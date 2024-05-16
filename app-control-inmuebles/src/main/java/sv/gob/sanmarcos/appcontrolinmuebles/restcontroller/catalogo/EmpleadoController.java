package sv.gob.sanmarcos.appcontrolinmuebles.restcontroller.catalogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Empleado;
import sv.gob.sanmarcos.appcontrolinmuebles.service.impl.EmpleadoServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/alcaldia/catalogo/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Empleado>> findALL(){
        return ResponseEntity.ok().body(empleadoService.findAll());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<Empleado> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(empleadoService.findById(id).get());
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Empleado empleado){
        empleadoService.Create(empleado);
        return  ResponseEntity.ok("ok");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Empleado empleado){
        empleadoService.Update(empleado);
        return  ResponseEntity.ok("ok");
    }
}