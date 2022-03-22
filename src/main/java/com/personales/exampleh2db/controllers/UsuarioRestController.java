package com.personales.exampleh2db.controllers;

import com.personales.exampleh2db.entitys.Usuario;
import com.personales.exampleh2db.services.IUsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @created 22/03/2022 - 11:46
 * @autor Pruebas_Horus
 **/
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    IUsuarioService iUsuarioService;

    public UsuarioRestController(IUsuarioService iUsuarioService) {
        this.iUsuarioService = iUsuarioService;
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return (List<Usuario>) iUsuarioService.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Optional getUsuarioById(@PathVariable Long id){
        return iUsuarioService.findById(id);
    }

}
