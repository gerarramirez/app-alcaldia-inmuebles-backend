package sv.gob.sanmarcos.appcontrolinmuebles.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Table(schema = "main_sm")
@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "empleado_id_seq", schema = "main_sm", initialValue = 1, allocationSize = 1)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column(unique = true)
    private String email;

    @JsonIgnore
    @CreationTimestamp
    @Column(updatable = false)
    private Date fechaIngreso;

}
