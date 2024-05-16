package sv.gob.sanmarcos.appcontrolinmuebles.service;

import sv.gob.sanmarcos.appcontrolinmuebles.model.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    public List<Empleado> findAll();
    public Optional<Empleado> findById(Integer id);
    public void Create(Empleado empleado);

    public void Update(Empleado empleado);
}
