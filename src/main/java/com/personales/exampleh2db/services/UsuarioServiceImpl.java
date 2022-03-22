package com.personales.exampleh2db.services;

import com.personales.exampleh2db.dao.IUsuarioDao;
import com.personales.exampleh2db.entitys.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @created 22/03/2022 - 10:45
 * @autor Pruebas_Horus
 **/
@Service
public class UsuarioServiceImpl implements IUsuarioService{

    private IUsuarioDao iUsuarioDao;

    public UsuarioServiceImpl(IUsuarioDao iUsuarioDao) {
        this.iUsuarioDao = iUsuarioDao;
    }

    @Override
    public <S extends Usuario> S save(S entity) {
        return iUsuarioDao.save(entity);
    }

    @Override
    public Optional<Usuario> findById(Long aLong) {
        return iUsuarioDao.findById(aLong);
    }

    public List<Usuario> findAll(){
        return (List<Usuario>) iUsuarioDao.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        iUsuarioDao.deleteById(aLong);
    }
}
