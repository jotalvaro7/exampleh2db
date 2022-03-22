package com.personales.exampleh2db.services;

import com.personales.exampleh2db.entitys.Usuario;

import java.util.Optional;

/**
 * @created 22/03/2022 - 10:50
 * @autor Pruebas_Horus
 **/
public interface IUsuarioService {


    <S extends Usuario> S save(S entity);

    Optional<Usuario> findById(Long aLong);

    Iterable<Usuario> findAll();

    void deleteById(Long aLong);
}
