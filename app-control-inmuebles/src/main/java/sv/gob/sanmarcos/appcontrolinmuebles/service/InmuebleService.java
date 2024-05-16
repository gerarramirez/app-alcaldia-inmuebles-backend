package sv.gob.sanmarcos.appcontrolinmuebles.service;

import sv.gob.sanmarcos.appcontrolinmuebles.model.Inmueble;

import java.util.List;
import java.util.Optional;

public interface InmuebleService {

    public List<Inmueble> findAll();
    public Optional<Inmueble> findById(Integer id);
    public void Create(Inmueble propietario);

    public void Update(Inmueble propietario);
}
