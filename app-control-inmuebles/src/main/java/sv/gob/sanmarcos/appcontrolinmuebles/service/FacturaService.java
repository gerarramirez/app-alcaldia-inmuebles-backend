package sv.gob.sanmarcos.appcontrolinmuebles.service;

import sv.gob.sanmarcos.appcontrolinmuebles.model.Factura;

public interface FacturaService {

    public void Create(Factura factura);
    public Factura getConfig();
    public void disableOldConfig();

    public void enableOldConfig();

    public void delete(String id);

}
