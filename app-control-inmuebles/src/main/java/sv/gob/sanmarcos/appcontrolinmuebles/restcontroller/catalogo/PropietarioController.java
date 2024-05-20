package sv.gob.sanmarcos.appcontrolinmuebles.restcontroller.catalogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Propietario;
import sv.gob.sanmarcos.appcontrolinmuebles.service.impl.PropietarioServiceImpl;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/alcaldia/catalogo/propietario")
public class PropietarioController {

    @Autowired
    private PropietarioServiceImpl propietarioService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Propietario>> findALL(){
        return ResponseEntity.ok().body(propietarioService.findAll());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<Propietario> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(propietarioService.findById(id).get());
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Propietario propietario){
        propietarioService.Create(propietario);
        return  ResponseEntity.ok("ok");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Propietario propietario){
        propietarioService.Update(propietario);
        return  ResponseEntity.ok("ok");
    }
}
