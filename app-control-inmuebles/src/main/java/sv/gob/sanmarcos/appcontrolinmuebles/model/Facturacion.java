package sv.gob.sanmarcos.appcontrolinmuebles.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(schema = "main_sm")
public class Facturacion {
    @Id
    private String noFacturacion;
    @OneToOne
    @JoinColumn(name = "id_inmueble", referencedColumnName = "id")
    private Inmueble inmueble;
    @OneToOne
    @JoinColumn(name = "id_propietario", referencedColumnName = "id")
    private Propietario propietario;
    @CreationTimestamp
    private Date fechaFacturacion;
    @Column
    private BigDecimal montoFacturacion;

}
