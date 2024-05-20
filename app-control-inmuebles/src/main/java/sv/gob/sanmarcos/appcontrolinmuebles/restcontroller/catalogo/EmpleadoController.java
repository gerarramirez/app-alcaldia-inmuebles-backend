package sv.gob.sanmarcos.appcontrolinmuebles.restcontroller.catalogo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Empleado;
import sv.gob.sanmarcos.appcontrolinmuebles.service.impl.EmpleadoServiceImpl;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/alcaldia/catalogo/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Empleado>> findALL(){
        return ResponseEntity.ok().body(empleadoService.findAll());
    }

    @GetMapping("/findALLWithoutUser")
    public ResponseEntity<List<Empleado>> findALLWithoutUser(){
        return ResponseEntity.ok().body(empleadoService.findALLWithoutUser());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<Empleado> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(empleadoService.findById(id).get());
    }

    @PostMapping(value = "/create")
    public ResponseEntity<String> create(@RequestBody Empleado empleado, HttpServletRequest request){
        empleadoService.Create(empleado);
        return  ResponseEntity.ok("ok");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Empleado empleado){
        empleadoService.Update(empleado);
        return  ResponseEntity.ok("ok");
    }
}
