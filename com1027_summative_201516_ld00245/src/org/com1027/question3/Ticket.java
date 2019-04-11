package org.com1027.question3;

public class Ticket {

  public Ticket(int number, TicketType type) {
    this.number = number;
    this.type = type;
  }

  private final int        number;
  private final TicketType type;

  public int getNumber() {
    return this.number;
  }

  public TicketType getType() {
    return this.type;
  }

  @Override
  public String toString() {
    return number + ", " + type;
  }
}
