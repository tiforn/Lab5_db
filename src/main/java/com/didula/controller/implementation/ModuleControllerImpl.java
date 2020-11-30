package com.didula.controller.implementation;

import com.didula.controller.GeneralController;
import com.didula.model.ModuleEntity;
import com.didula.service.implementation.ModuleServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class ModuleControllerImpl implements GeneralController<ModuleEntity, Integer> {
  @Override
  public List<ModuleEntity> findAll() throws SQLException {
    return new ModuleServiceImpl().findAll();
  }

  @Override
  public ModuleEntity findById(Integer id) throws SQLException {
    return new ModuleServiceImpl().findById(id);
  }

  @Override
  public void create(ModuleEntity entity) throws SQLException {
    new ModuleServiceImpl().create(entity);
  }

  @Override
  public void update(ModuleEntity entity) throws SQLException {
    new ModuleServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new ModuleServiceImpl().delete(id);
  }
}
