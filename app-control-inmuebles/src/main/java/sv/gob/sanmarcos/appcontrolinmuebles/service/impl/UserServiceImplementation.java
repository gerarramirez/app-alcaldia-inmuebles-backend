package sv.gob.sanmarcos.appcontrolinmuebles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Usuario;
import sv.gob.sanmarcos.appcontrolinmuebles.repository.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImplementation implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsuario(username);
        System.out.println(usuario);

        if(usuario==null) {
            throw new UsernameNotFoundException("User not found with this email"+username);

        }
        List<GrantedAuthority> authorities = new ArrayList<>();

        return new org.springframework.security.core.userdetails.User(
                usuario.getUsuario(),
                usuario.getClave(),
                authorities);
    }
}
