package com.example.auth_api.controllers;

import com.example.auth_api.dtos.AuthDto;
import com.example.auth_api.services.AutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

    private final AuthenticationManager authenticationManager;
    private final AutenticacaoService autenticacaoService;

    @Autowired
    public AutenticacaoController(AuthenticationManager authenticationManager, AutenticacaoService autenticacaoService) {
        this.authenticationManager = authenticationManager;
        this.autenticacaoService = autenticacaoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String auth(@RequestBody AuthDto authDto) {

        var usuarioAutenticationToken = new UsernamePasswordAuthenticationToken(authDto.login(), authDto.senha());
        authenticationManager.authenticate(usuarioAutenticationToken);
        return autenticacaoService.obterToken(authDto);
    }
}
