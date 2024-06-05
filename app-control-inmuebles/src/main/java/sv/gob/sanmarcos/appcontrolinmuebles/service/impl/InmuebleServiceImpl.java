package sv.gob.sanmarcos.appcontrolinmuebles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Inmueble;
import sv.gob.sanmarcos.appcontrolinmuebles.repository.InmuebleRepository;
import sv.gob.sanmarcos.appcontrolinmuebles.service.InmuebleService;

import java.util.List;
import java.util.Optional;

@Service
public class InmuebleServiceImpl implements InmuebleService {

    @Autowired
    private InmuebleRepository inmuebleRepository;

    @Override
    public List<Inmueble> findAll() {
        return inmuebleRepository.findAll();
    }

    @Override
    public List<Inmueble> findAllWithoutFacturacion() {
        return inmuebleRepository.findAllWithoutFacturacion();
    }

    @Override
    public Optional<Inmueble> findById(Integer id) {
        return inmuebleRepository.findById(id);
    }

    @Override
    public void Create(Inmueble propietario) {
        inmuebleRepository.saveAndFlush(propietario);
    }

    @Override
    public void Update(Inmueble propietario) {
        inmuebleRepository.saveAndFlush(propietario);
    }
}
