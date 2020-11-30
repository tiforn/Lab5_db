package com.didula.controller.implementation;

import com.didula.controller.GeneralController;
import com.didula.model.MessageEntity;
import com.didula.service.implementation.MessageServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class MessageControllerImpl implements GeneralController<MessageEntity, Integer> {
  @Override
  public List<MessageEntity> findAll() throws SQLException {
    return new MessageServiceImpl().findAll();
  }

  @Override
  public MessageEntity findById(Integer id) throws SQLException {
    return new MessageServiceImpl().findById(id);
  }

  @Override
  public void create(MessageEntity entity) throws SQLException {
    new MessageServiceImpl().create(entity);
  }

  @Override
  public void update(MessageEntity entity) throws SQLException {
    new MessageServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new MessageServiceImpl().delete(id);
  }
}
