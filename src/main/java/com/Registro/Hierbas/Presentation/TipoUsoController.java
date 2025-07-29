package com.Registro.Hierbas.Presentation;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.Registro.Hierbas.Domain.TipoUso;
import com.Registro.Hierbas.Infrastructure.TipoUsoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/usos")
@RequiredArgsConstructor
public class TipoUsoController {

    private final TipoUsoRepository tipoUsoRepository;

    @GetMapping
    public Flux<TipoUso> listar() {
        return tipoUsoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<TipoUso> obtener(@PathVariable Integer id) {
        return tipoUsoRepository.findById(id);
    }

    @PostMapping
    public Mono<TipoUso> crear(@RequestBody TipoUso uso) {
        return tipoUsoRepository.save(uso);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminar(@PathVariable Integer id) {
        return tipoUsoRepository.deleteById(id);
    }
}

