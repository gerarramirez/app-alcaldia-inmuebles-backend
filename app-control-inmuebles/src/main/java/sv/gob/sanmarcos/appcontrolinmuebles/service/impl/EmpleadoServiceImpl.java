package sv.gob.sanmarcos.appcontrolinmuebles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Empleado;
import sv.gob.sanmarcos.appcontrolinmuebles.repository.EmpleadoRepository;
import sv.gob.sanmarcos.appcontrolinmuebles.service.EmpleadoService;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findALLWithoutUser() {
        return empleadoRepository.findALLWithoutUser();
    }

    @Override
    public Optional<Empleado> findById(Integer id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public void Create(Empleado empleado) {
        empleadoRepository.saveAndFlush(empleado);

    }

    @Override
    public void Update(Empleado empleado) {
        empleadoRepository.saveAndFlush(empleado);
    }
}
