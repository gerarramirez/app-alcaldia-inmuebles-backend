package sv.gob.sanmarcos.appcontrolinmuebles.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Table(schema = "main_sm")
@Entity
public class Propietario {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "propietario_id_seq", schema = "main_sm", initialValue = 1, allocationSize = 1)
    private Integer id;
    @Column
    private String tipoDocumento;
    @Column(unique = true)
    private String documento;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String telefono;
    @Column
    private String correoElectronico;
    @Column(updatable = false)
    @CreationTimestamp
    private Date fechaIngreso;
}
