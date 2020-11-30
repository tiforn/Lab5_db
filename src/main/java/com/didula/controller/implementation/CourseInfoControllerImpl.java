package com.didula.controller.implementation;

import com.didula.controller.GeneralController;
import com.didula.model.CourseInfoEntity;
import com.didula.service.implementation.CourseInfoServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class CourseInfoControllerImpl implements GeneralController<CourseInfoEntity, Integer> {
  @Override
  public List<CourseInfoEntity> findAll() throws SQLException {
    return new CourseInfoServiceImpl().findAll();
  }

  @Override
  public CourseInfoEntity findById(Integer id) throws SQLException {
    return new CourseInfoServiceImpl().findById(id);
  }

  @Override
  public void create(CourseInfoEntity entity) throws SQLException {
    new CourseInfoServiceImpl().create(entity);
  }

  @Override
  public void update(CourseInfoEntity entity) throws SQLException {
    new CourseInfoServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new CourseInfoServiceImpl().delete(id);
  }
}

