package com.didula.service.implementation;

import com.didula.service.GeneralService;
import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.GenderDAOimpl;
import com.didula.model.GenderEntity;

public class GenderServiceImpl implements GeneralService<GenderEntity, Integer> {
  GeneralDAO<GenderEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<GenderEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new GenderDAOimpl();
    }
    return entityDAO;
  }
}
