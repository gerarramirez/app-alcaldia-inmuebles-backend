package sv.gob.sanmarcos.appcontrolinmuebles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Inmueble;

@Repository
public interface InmuebleRepository  extends JpaRepository<Inmueble, Integer> {

}
