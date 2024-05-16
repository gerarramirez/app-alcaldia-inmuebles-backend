package sv.gob.sanmarcos.appcontrolinmuebles.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Table( schema = "main_sm")
@Entity
public class Inmueble {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "inmueble_id_seq", schema = "main_sm", initialValue = 1, allocationSize = 1)
    private Integer id;
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
}
