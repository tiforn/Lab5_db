package com.didula.service.implementation;

import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.AnswerDAOimpl;
import com.didula.model.AnswerEntity;
import com.didula.service.GeneralService;

public class AnswerServiceImpl implements GeneralService<AnswerEntity, Integer> {
  GeneralDAO<AnswerEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<AnswerEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new AnswerDAOimpl();
    }
    return entityDAO;
  }
}
