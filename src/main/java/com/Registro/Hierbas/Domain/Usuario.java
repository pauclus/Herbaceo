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
@Table("usuario")
public class Usuario {

    @Id
    private String id;

    private String nombreUsuario;
    private String correo;
    private String contrasena;
    private String rol;
    private LocalDateTime creadoEn;


}
