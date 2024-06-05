package sv.gob.sanmarcos.appcontrolinmuebles.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Entity
@Table(schema = "main_sm")
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "factura_id_seq", schema = "main_sm", initialValue = 1, allocationSize = 1)
    private Integer id;
    @Column
    private String serieMh;
    @Column
    private String noRegistro;
    @Column
    private String nit;
    @Column
    private Boolean estado;
    @JsonIgnore
    @CreationTimestamp
    private Date fechaIngreso;
    @Column
    private Integer desde;
    @Column
    private Integer hasta;
}
