package sv.gob.sanmarcos.appcontrolinmuebles.service;

import sv.gob.sanmarcos.appcontrolinmuebles.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public List<Usuario> findAll();
    public Optional<Usuario> findById(Integer id);
    public void Create(Usuario usuario);

    public void Update(Usuario usuario);
}
