package com.example.auth_api.controllers;

import com.example.auth_api.dtos.UsuarioDto;
import com.example.auth_api.models.Usuario;
import com.example.auth_api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    private UsuarioDto salvar(@RequestBody UsuarioDto usuarioDto) {
        return usuarioService.salvar(usuarioDto);
    }

    @GetMapping
    private String getOK() {
        return "OK";
    }
}
