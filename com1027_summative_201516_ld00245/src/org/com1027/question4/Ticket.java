package org.com1027.question4;

import java.text.DecimalFormat;

public class Ticket {

  public Ticket(int number, TicketType type, Double price) {
    // TODO Auto-generated constructor stub
    this.number = number;
    this.type = type;
    this.price = price;
  }

  private final int        number;
  private final TicketType type;
  private final double     price;

  public int getNumber() {
    return this.number;
  }

  public TicketType getType() {
    return this.type;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    DecimalFormat doubleFormat = new DecimalFormat("0.00");
    return number + ", " + type + ", £" + doubleFormat.format(price);
  }
}
