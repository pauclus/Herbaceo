package com.Registro.Hierbas.Infrastructure;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.Registro.Hierbas.Domain.TipoUso;

import reactor.core.publisher.Mono;

public interface TipoUsoRepository extends ReactiveCrudRepository<TipoUso, Integer> {

    Mono<TipoUso> findByNombreIgnoreCase(String nombre);
}
