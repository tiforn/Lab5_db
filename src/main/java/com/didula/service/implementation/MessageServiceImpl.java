package com.didula.service.implementation;

import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.MessageDAOimpl;
import com.didula.model.MessageEntity;
import com.didula.service.GeneralService;

public class MessageServiceImpl implements GeneralService<MessageEntity, Integer> {
  GeneralDAO<MessageEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<MessageEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new MessageDAOimpl();
    }
    return entityDAO;
  }
}
