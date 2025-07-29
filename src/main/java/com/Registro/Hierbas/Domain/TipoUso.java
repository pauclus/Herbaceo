package com.Registro.Hierbas.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("tipo_uso")
public class TipoUso {

    @Id
    private Integer id;

    private String nombre;

}
