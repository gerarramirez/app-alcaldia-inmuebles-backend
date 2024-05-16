package sv.gob.sanmarcos.appcontrolinmuebles.restcontroller.facturacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Facturacion;
import sv.gob.sanmarcos.appcontrolinmuebles.service.impl.FacturacionServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/alcaldia/facturacion")
public class FacturacionController {
    
    @Autowired
    private FacturacionServiceImpl facturacionService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Facturacion>> findALL(){
        return ResponseEntity.ok().body(facturacionService.findAll());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<Facturacion> findById(@PathVariable("id") String id){
        return  ResponseEntity.ok().body(facturacionService.findById(id).get());
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Facturacion facturacion){
        facturacionService.Create(facturacion);
        return  ResponseEntity.ok("ok");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Facturacion facturacion){
        facturacionService.Update(facturacion);
        return  ResponseEntity.ok("ok");
    }
}
