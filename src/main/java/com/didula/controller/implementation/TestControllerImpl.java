package com.didula.controller.implementation;

import com.didula.controller.GeneralController;
import com.didula.model.TestEntity;
import com.didula.service.implementation.TestServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class TestControllerImpl implements GeneralController<TestEntity, Integer> {
  @Override
  public List<TestEntity> findAll() throws SQLException {
    return new TestServiceImpl().findAll();
  }

  @Override
  public TestEntity findById(Integer id) throws SQLException {
    return new TestServiceImpl().findById(id);
  }

  @Override
  public void create(TestEntity entity) throws SQLException {
    new TestServiceImpl().create(entity);
  }

  @Override
  public void update(TestEntity entity) throws SQLException {
    new TestServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new TestServiceImpl().delete(id);
  }
}
