package sv.gob.sanmarcos.appcontrolinmuebles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Facturacion;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Inmueble;

import java.util.List;

@Repository
public interface InmuebleRepository  extends JpaRepository<Inmueble, Integer> {

    @Query(value = "SELECT I FROM Inmueble I WHERE NOT EXISTS (SELECT F FROM Facturacion F WHERE F.inmueble.id=I.id)", nativeQuery = false)
    public List<Inmueble> findAllWithoutFacturacion();

}
