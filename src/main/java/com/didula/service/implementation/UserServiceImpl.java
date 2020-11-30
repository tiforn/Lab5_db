package com.didula.service.implementation;

import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.UserDAOimpl;
import com.didula.model.UserEntity;
import com.didula.service.GeneralService;

public class UserServiceImpl implements GeneralService<UserEntity, Integer> {
  GeneralDAO<UserEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<UserEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new UserDAOimpl();
    }
    return entityDAO;
  }
}
