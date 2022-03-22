package com.personales.exampleh2db.dao;

import com.personales.exampleh2db.entitys.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 * @created 22/03/2022 - 10:33
 * @autor Pruebas_Horus
 **/
public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
