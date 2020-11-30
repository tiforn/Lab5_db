package com.didula.controller.implementation;

import com.didula.controller.GeneralController;
import com.didula.model.SecurityEntity;
import com.didula.service.implementation.SecurityServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class SecurityControllerImpl implements GeneralController<SecurityEntity, Integer> {
  @Override
  public List<SecurityEntity> findAll() throws SQLException {
    return new SecurityServiceImpl().findAll();
  }

  @Override
  public SecurityEntity findById(Integer id) throws SQLException {
    return new SecurityServiceImpl().findById(id);
  }

  @Override
  public void create(SecurityEntity entity) throws SQLException {
    new SecurityServiceImpl().create(entity);
  }

  @Override
  public void update(SecurityEntity entity) throws SQLException {
    new SecurityServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new SecurityServiceImpl().delete(id);
  }
}
