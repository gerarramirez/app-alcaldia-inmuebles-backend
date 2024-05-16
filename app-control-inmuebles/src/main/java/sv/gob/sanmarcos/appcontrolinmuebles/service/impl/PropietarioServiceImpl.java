package sv.gob.sanmarcos.appcontrolinmuebles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Propietario;
import sv.gob.sanmarcos.appcontrolinmuebles.repository.PropietarioRepository;
import sv.gob.sanmarcos.appcontrolinmuebles.service.PropietarioService;

import java.util.List;
import java.util.Optional;
@Service
public class PropietarioServiceImpl implements PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;
    @Override
    public List<Propietario> findAll() {
        return propietarioRepository.findAll();
    }

    @Override
    public Optional<Propietario> findById(Integer id) {
        return propietarioRepository.findById(id);
    }

    @Override
    public void Create(Propietario propietario) {
        propietarioRepository.saveAndFlush(propietario);
    }

    @Override
    public void Update(Propietario propietario) {
        propietarioRepository.saveAndFlush(propietario);

    }
}
