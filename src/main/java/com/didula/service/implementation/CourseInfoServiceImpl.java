package com.didula.service.implementation;

import com.didula.dao.GeneralDAO;
import com.didula.dao.implementation.CourseInfoDAOimpl;
import com.didula.model.CourseInfoEntity;
import com.didula.service.GeneralService;

public class CourseInfoServiceImpl implements GeneralService<CourseInfoEntity, Integer> {
  GeneralDAO<CourseInfoEntity, Integer> entityDAO;

  @Override
  public GeneralDAO<CourseInfoEntity, Integer> takeDAOObject() {
    if (entityDAO == null) {
      entityDAO = new CourseInfoDAOimpl();
    }
    return entityDAO;
  }
}
