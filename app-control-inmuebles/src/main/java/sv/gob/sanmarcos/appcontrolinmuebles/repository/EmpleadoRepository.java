package sv.gob.sanmarcos.appcontrolinmuebles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Empleado;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    @Query(value = "SELECT E FROM Empleado E WHERE not exists  (SELECT U FROM Usuario U WHERE U.empleado.id=E.id) ", nativeQuery = false)
    public List<Empleado> findALLWithoutUser();
}
