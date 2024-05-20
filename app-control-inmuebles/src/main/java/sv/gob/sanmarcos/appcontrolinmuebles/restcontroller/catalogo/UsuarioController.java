package sv.gob.sanmarcos.appcontrolinmuebles.restcontroller.catalogo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.gob.sanmarcos.appcontrolinmuebles.model.Usuario;
import sv.gob.sanmarcos.appcontrolinmuebles.service.impl.UsuarioServiceImpl;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/alcaldia/catalogo/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Usuario>> findALL(){
        return ResponseEntity.ok().body(usuarioService.findAll());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<Usuario> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(usuarioService.findById(id).get());
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Usuario usuario){
        usuarioService.Create(usuario);
        return  ResponseEntity.ok("ok");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Usuario usuario){
        usuarioService.Update(usuario);
        return  ResponseEntity.ok("ok");
    }
}
