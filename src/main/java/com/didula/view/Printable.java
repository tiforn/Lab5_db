package com.didula.view;

import java.sql.SQLException;
import java.text.ParseException;

@FunctionalInterface
public interface Printable {
  void print() throws SQLException, ParseException;
}
