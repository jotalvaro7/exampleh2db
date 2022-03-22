package com.personales.exampleh2db.entitys;

import lombok.Data;

import javax.persistence.*;

/**
 * @created 22/03/2022 - 10:10
 * @autor Pruebas_Horus
 **/

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int edad;

    private String sexo;
}
