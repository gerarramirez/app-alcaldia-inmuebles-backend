package sv.gob.sanmarcos.appcontrolinmuebles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, String> {
    public Factura findByEstadoTrue();

    @Modifying
    @Query("UPDATE Factura F SET F.estado = :estado")
    public void UpdateEstado(@Param("estado") Boolean estado);

}
