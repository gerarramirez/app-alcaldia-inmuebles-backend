package sv.gob.sanmarcos.appcontrolinmuebles.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Entity
@Table(schema = "main_sm")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "usuario_id_seq", schema = "main_sm", initialValue = 1, allocationSize = 1)
    private Integer id;
    @Column
    private String usuario;
    @Column
    private String clave;

    @Column(updatable = false)
    @CreationTimestamp
    private Date fechaIngreso;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_empleado", referencedColumnName = "id")
    private Empleado empleado;
}
