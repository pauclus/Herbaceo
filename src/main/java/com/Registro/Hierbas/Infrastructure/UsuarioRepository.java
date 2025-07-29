package com.Registro.Hierbas.Infrastructure;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.Registro.Hierbas.Domain.Usuario;

import reactor.core.publisher.Mono;

public interface UsuarioRepository extends ReactiveCrudRepository<Usuario, String> {

    Mono<Usuario> findByCorreo(String correo);

    Mono<Usuario> findByNombreUsuario(String nombreUsuario);
}

