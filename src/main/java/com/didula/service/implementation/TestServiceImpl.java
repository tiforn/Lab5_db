package com.didula.service.implementation;

import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.TestDAOimpl;
import com.didula.model.TestEntity;
import com.didula.service.GeneralService;

public class TestServiceImpl implements GeneralService<TestEntity, Integer> {
  GeneralDAO<TestEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<TestEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new TestDAOimpl();
    }
    return entityDAO;
  }
}
