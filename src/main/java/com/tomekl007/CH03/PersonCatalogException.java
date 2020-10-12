package com.tomekl007.CH03;

public class PersonCatalogException extends Exception {

  private PersonCatalogException(String message, Throwable cause) {
    super(message, cause);
  }

  PersonCatalogException getPersonException(String personName, Throwable t) {
    return new PersonCatalogException("Problem when getting person file for: " + personName, t);
  }

  PersonCatalogException createPersonException(String personName, Throwable t) {
    return new PersonCatalogException("Problem when creating person file for: " + personName, t);
  }
}
