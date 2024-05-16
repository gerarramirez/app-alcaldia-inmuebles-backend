package sv.gob.sanmarcos.appcontrolinmuebles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Facturacion;

@Repository
public interface FacturacionRepository extends JpaRepository<Facturacion, String> {
}
