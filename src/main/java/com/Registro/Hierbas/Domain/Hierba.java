package com.Registro.Hierbas.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("hierba")
public class Hierba {

    @Id
    private String id;

    private String nombreComun;
    private String nombreCientifico;
    private String descripcion;
    private String regionOrigen;
    private String urlImagen;
    private LocalDateTime creadaEn;
    private LocalDateTime actualizadaEn;
    private String creadaPorId; // FK a Usuario


}
