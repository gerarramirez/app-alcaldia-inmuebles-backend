package sv.gob.sanmarcos.appcontrolinmuebles.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Table( schema = "main_sm")
@Entity
public class Inmueble {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "inmueble_id_seq", schema = "main_sm", initialValue = 1, allocationSize = 1)
    private Integer id;
    @Column
    private String claveCatastral;
    @Column
    private String direccion;
    @Column
    private String tipoInmueble;
    @Column
    private Integer numHabitaciones;
    @Column
    private Integer numBanios;
    @Column
    private BigDecimal precio;
    @OneToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id")
    private Empleado empleado;
    @JsonIgnore
    @Column(updatable = false)
    @CreationTimestamp
    private Date fechaIngreso;
}
