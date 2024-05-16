package sv.gob.sanmarcos.appcontrolinmuebles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Usuario;
import sv.gob.sanmarcos.appcontrolinmuebles.repository.UsuarioRepository;
import sv.gob.sanmarcos.appcontrolinmuebles.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void Create(Usuario usuario) {
        usuarioRepository.saveAndFlush(usuario);
    }

    @Override
    public void Update(Usuario usuario) {
        usuarioRepository.saveAndFlush(usuario);

    }
}
