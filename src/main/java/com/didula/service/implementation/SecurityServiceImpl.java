package com.didula.service.implementation;

import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.SecurityDAOimpl;
import com.didula.model.SecurityEntity;
import com.didula.service.GeneralService;

public class SecurityServiceImpl implements GeneralService<SecurityEntity, Integer> {
  GeneralDAO<SecurityEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<SecurityEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new SecurityDAOimpl();
    }
    return entityDAO;
  }
}
