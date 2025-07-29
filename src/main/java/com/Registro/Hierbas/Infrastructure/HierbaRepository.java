package com.Registro.Hierbas.Infrastructure;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.Registro.Hierbas.Domain.Hierba;

public interface HierbaRepository extends ReactiveCrudRepository<Hierba, String> {

    Flux<Hierba> findByNombreComunContainingIgnoreCase(String nombreComun);

    Flux<Hierba> findByRegionOrigenContainingIgnoreCase(String region);

    Flux<Hierba> findByCreadaPorId(String usuarioId);

    Mono<Hierba> findByNombreCientifico(String nombreCientifico);
}