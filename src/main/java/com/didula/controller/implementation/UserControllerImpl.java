package com.didula.controller.implementation;

import com.didula.controller.GeneralController;
import com.didula.model.UserEntity;
import com.didula.service.implementation.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class UserControllerImpl implements GeneralController<UserEntity, Integer> {
  @Override
  public List<UserEntity> findAll() throws SQLException {
    return new UserServiceImpl().findAll();
  }

  @Override
  public UserEntity findById(Integer id) throws SQLException {
    return new UserServiceImpl().findById(id);
  }

  @Override
  public void create(UserEntity entity) throws SQLException {
    new UserServiceImpl().create(entity);
  }

  @Override
  public void update(UserEntity entity) throws SQLException {
    new UserServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new UserServiceImpl().delete(id);
  }
}

