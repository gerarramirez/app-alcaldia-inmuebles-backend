package sv.gob.sanmarcos.appcontrolinmuebles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Factura;
import sv.gob.sanmarcos.appcontrolinmuebles.repository.FacturaRepository;
import sv.gob.sanmarcos.appcontrolinmuebles.service.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public void Create(Factura factura) {
        facturaRepository.saveAndFlush(factura);
    }

    @Override
    public Factura getConfig() {
        return facturaRepository.findByEstadoTrue();
    }

    @Override
    public void disableOldConfig() {
        facturaRepository.UpdateEstado(false);
    }

    @Override
    public void enableOldConfig() {
        facturaRepository.UpdateEstado(true);
        facturaRepository.flush();
    }

    @Override
    public void delete(String id){
        facturaRepository.deleteById(id);
    }
}
