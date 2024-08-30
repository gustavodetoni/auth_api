package com.example.auth_api.dtos;

import com.example.auth_api.enums.RoleEnum;

public record UsuarioDto(
        String nome,
        String login,
        String senha,
        RoleEnum role
        ) {
}
