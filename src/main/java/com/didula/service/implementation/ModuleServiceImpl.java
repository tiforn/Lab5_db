package com.didula.service.implementation;

import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.ModuleDAOimpl;
import com.didula.model.ModuleEntity;
import com.didula.service.GeneralService;

public class ModuleServiceImpl implements GeneralService<ModuleEntity, Integer> {
  GeneralDAO<ModuleEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<ModuleEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new ModuleDAOimpl();
    }
    return entityDAO;
  }
}
