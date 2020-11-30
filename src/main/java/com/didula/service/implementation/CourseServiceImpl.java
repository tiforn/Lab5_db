package com.didula.service.implementation;

import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.CourseDAOimpl;
import com.didula.model.CourseEntity;
import com.didula.service.GeneralService;

public class CourseServiceImpl implements GeneralService<CourseEntity, Integer> {
  GeneralDAO<CourseEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<CourseEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new CourseDAOimpl();
    }
    return entityDAO;
  }
}
