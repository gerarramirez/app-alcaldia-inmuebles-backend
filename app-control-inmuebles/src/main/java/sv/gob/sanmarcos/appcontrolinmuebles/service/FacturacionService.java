package sv.gob.sanmarcos.appcontrolinmuebles.service;


import sv.gob.sanmarcos.appcontrolinmuebles.model.Facturacion;

import java.util.List;
import java.util.Optional;

public interface FacturacionService {

    public List<Facturacion> findAll();
    public Optional<Facturacion> findById(String id);
    public void Create(Facturacion facturacion);
    public void Update(Facturacion facturacion);
}
