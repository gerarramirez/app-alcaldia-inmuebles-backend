package sv.gob.sanmarcos.appcontrolinmuebles.service;

import sv.gob.sanmarcos.appcontrolinmuebles.model.Propietario;

import java.util.List;
import java.util.Optional;

public interface PropietarioService {
    public List<Propietario> findAll();
    public Optional<Propietario> findById(Integer id);
    public void Create(Propietario propietario);

    public void Update(Propietario propietario);
}
