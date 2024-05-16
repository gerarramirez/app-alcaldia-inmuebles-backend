package sv.gob.sanmarcos.appcontrolinmuebles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Propietario;
@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Integer> {
}
