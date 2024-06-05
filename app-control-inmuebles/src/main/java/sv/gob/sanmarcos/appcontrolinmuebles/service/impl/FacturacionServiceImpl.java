package sv.gob.sanmarcos.appcontrolinmuebles.service.impl;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Factura;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Facturacion;
import sv.gob.sanmarcos.appcontrolinmuebles.repository.FacturacionRepository;
import sv.gob.sanmarcos.appcontrolinmuebles.service.FacturaService;
import sv.gob.sanmarcos.appcontrolinmuebles.service.FacturacionService;

import java.util.List;
import java.util.Optional;

@Service
public class FacturacionServiceImpl implements FacturacionService {
    @Autowired
    private FacturacionRepository facturacionRepository;

    @Autowired
     private FacturaServiceImpl facturaService;

    @Override
    public List<Facturacion> findAll() {
        return facturacionRepository.findAll();
    }

    @Override
    public Optional<Facturacion> findById(String id) {
        return facturacionRepository.findById(id);
    }

    @Transactional
    @Override
    public void Create(Facturacion facturacion) {
        try {
            Factura factura = facturaService.getConfig();
            String id = factura.getSerieMh().concat("-").concat(String.valueOf(facturacionRepository.findMaxFactura(factura.getSerieMh())+1));
            facturacion.setSerie(factura.getSerieMh());
            facturacion.setNoFacturacion(id);
            facturacionRepository.saveAndFlush(facturacion);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void Update(Facturacion facturacion) {
        facturacionRepository.saveAndFlush(facturacion);
    }
}
