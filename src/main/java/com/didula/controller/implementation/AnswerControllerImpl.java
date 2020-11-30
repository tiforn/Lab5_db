package com.didula.controller.implementation;

import com.didula.controller.GeneralController;
import com.didula.model.AnswerEntity;
import com.didula.service.implementation.AnswerServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class AnswerControllerImpl implements GeneralController<AnswerEntity, Integer> {
  @Override
  public List<AnswerEntity> findAll() throws SQLException {
    return new AnswerServiceImpl().findAll();
  }

  @Override
  public AnswerEntity findById(Integer id) throws SQLException {
    return new AnswerServiceImpl().findById(id);
  }

  @Override
  public void create(AnswerEntity entity) throws SQLException {
    new AnswerServiceImpl().create(entity);
  }

  @Override
  public void update(AnswerEntity entity) throws SQLException {
    new AnswerServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new AnswerServiceImpl().delete(id);
  }
}
