package sv.gob.sanmarcos.appcontrolinmuebles.restcontroller.facturacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Inmueble;
import sv.gob.sanmarcos.appcontrolinmuebles.service.impl.InmuebleServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/alcaldia/facturacion/inmueble")
public class InmuebleController {
    
    @Autowired
    private InmuebleServiceImpl inmuebleService;


    @GetMapping("/findAll")
    public ResponseEntity<List<Inmueble>> findALL(){
        return ResponseEntity.ok().body(inmuebleService.findAll());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<Inmueble> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(inmuebleService.findById(id).get());
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Inmueble inmueble){
        inmuebleService.Create(inmueble);
        return  ResponseEntity.ok("ok");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Inmueble inmueble){
        inmuebleService.Update(inmueble);
        return  ResponseEntity.ok("ok");
    }
}
