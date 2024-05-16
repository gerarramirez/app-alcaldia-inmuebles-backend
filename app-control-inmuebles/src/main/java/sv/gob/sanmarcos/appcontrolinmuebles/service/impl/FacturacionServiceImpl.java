package sv.gob.sanmarcos.appcontrolinmuebles.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Facturacion;
import sv.gob.sanmarcos.appcontrolinmuebles.repository.FacturacionRepository;
import sv.gob.sanmarcos.appcontrolinmuebles.service.FacturacionService;

import java.util.List;
import java.util.Optional;

@Service
public class FacturacionServiceImpl implements FacturacionService {
    @Autowired
    private FacturacionRepository facturacionRepository;

    @Override
    public List<Facturacion> findAll() {
        return facturacionRepository.findAll();
    }

    @Override
    public Optional<Facturacion> findById(String id) {
        return facturacionRepository.findById(id);
    }

    @Override
    public void Create(Facturacion facturacion) {
        facturacionRepository.saveAndFlush(facturacion);
    }

    @Override
    public void Update(Facturacion facturacion) {
        facturacionRepository.saveAndFlush(facturacion);
    }
}
