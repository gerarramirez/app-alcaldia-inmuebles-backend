package sv.gob.sanmarcos.appcontrolinmuebles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Facturacion;

@Repository
public interface FacturacionRepository extends JpaRepository<Facturacion, String> {

    @Query(value = "SELECT count(F) FROM Facturacion F where F.Serie =:serie ")
    public Long findMaxFactura(@Param("serie") String serie);
}
