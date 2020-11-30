package com.didula.service;

import com.didula.dao.GeneralDAO;

import java.sql.SQLException;
import java.util.List;

public interface GeneralService<T, ID> {
  GeneralDAO<T, ID> takeDAOObject();

  default List<T> findAll() throws SQLException {
    return takeDAOObject().findAll();
  }

  default T findById(ID id) throws SQLException {
    return takeDAOObject().findById(id);
  }

  default void create(T entity) throws SQLException {
    takeDAOObject().create(entity);
  }

  default void update(T entity) throws SQLException {
    takeDAOObject().update(entity);
  }

  default void delete(ID id) throws SQLException {
    takeDAOObject().delete(id);
  }
}
