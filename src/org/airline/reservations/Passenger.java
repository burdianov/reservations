package org.airline.reservations;

public class Passenger {
  private String name;

  public Passenger() {
    name = "Unknown name";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
