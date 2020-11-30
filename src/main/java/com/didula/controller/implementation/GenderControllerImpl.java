package com.didula.controller.implementation;

import com.didula.service.implementation.GenderServiceImpl;
import com.didula.controller.GeneralController;
import com.didula.model.GenderEntity;

import java.sql.SQLException;
import java.util.List;

public class GenderControllerImpl implements GeneralController<GenderEntity, Integer> {
  @Override
  public List<GenderEntity> findAll() throws SQLException {
    return new GenderServiceImpl().findAll();
  }

  @Override
  public GenderEntity findById(Integer id) throws SQLException {
    return new GenderServiceImpl().findById(id);
  }

  @Override
  public void create(GenderEntity entity) throws SQLException {
    new GenderServiceImpl().create(entity);
  }

  @Override
  public void update(GenderEntity entity) throws SQLException {
    new GenderServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new GenderServiceImpl().delete(id);
  }
}
