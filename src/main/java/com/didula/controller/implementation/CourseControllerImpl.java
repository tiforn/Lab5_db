package com.didula.controller.implementation;

import com.didula.controller.GeneralController;
import com.didula.model.CourseEntity;
import com.didula.service.implementation.CourseServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class CourseControllerImpl implements GeneralController<CourseEntity, Integer> {
  @Override
  public List<CourseEntity> findAll() throws SQLException {
    return new CourseServiceImpl().findAll();
  }

  @Override
  public CourseEntity findById(Integer id) throws SQLException {
    return new CourseServiceImpl().findById(id);
  }

  @Override
  public void create(CourseEntity entity) throws SQLException {
    new CourseServiceImpl().create(entity);
  }

  @Override
  public void update(CourseEntity entity) throws SQLException {
    new CourseServiceImpl().update(entity);
  }

  @Override
  public void delete(Integer id) throws SQLException {
    new CourseServiceImpl().delete(id);
  }
}

