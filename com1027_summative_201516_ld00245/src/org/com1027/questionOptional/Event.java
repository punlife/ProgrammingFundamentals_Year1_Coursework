package org.com1027.questionOptional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Event {

  /**
   * 
   * @param name
   *          Contains the event name
   * @param eventType
   *          Type of event, either Free or Paid
   * @param totalNumberOfSeats
   *          The total amount of seats available at the event
   * @param prices
   *          Map that stores the prices for different ticket types
   * @throws Exception
   *           Exceptions are thrown based on which parameter contains the invalid value.
   */
  public Event(String name, EventType eventType, int totalNumberOfSeats, Map<TicketType, Double> prices) throws Exception {
    this.name = name;
    this.eventType = eventType;
    this.totalNumberOfSeats = totalNumberOfSeats;
    this.prices = prices;
    // loop that iterates through the map and assigns it default values
    for (TicketType type : TicketType.values()) {
      currentTicketNumber.put(type, 0);
    }
    // loop that iterates through the map and assigns it default values
    for (TicketType type : TicketType.values()) {
      List<Ticket> ticketList = new ArrayList<Ticket>();
      ticketList.add(null);
      tickets.put(type, ticketList);
      constructorValidation();
    }
  }

  private String                           name                = null;
  private EventType                        eventType;
  private int                              totalNumberOfSeats;

  private Map<TicketType, Integer>         currentTicketNumber = new HashMap<TicketType, Integer>();
  protected Map<TicketType, List<Ticket>>  tickets             = new HashMap<TicketType, List<Ticket>>();
  protected static Map<TicketType, Double> prices;

  /**
   * Method used for adding tickets to a list already existing within the map
   * 
   * @param ticket
   *          Ticket object passed in from the purchaseTicket method
   */
  private void addTicket(Ticket ticket) {
    tickets.get(ticket.getType()).add(ticket);
  }

  /**
   * Getter
   * 
   * @return Returns the name field
   */
  public String getEventName() {
    return this.name;
  }

  /**
   * Getter
   * 
   * @return Returns the EventType field
   */
  public EventType getEventType() {
    return this.eventType;
  }

  /**
   * Getter
   * 
   * @return Returns the totalNumberOfSeats field
   */
  public int getTotalNumberOfSeats() {
    return totalNumberOfSeats;
  }

  /**
   * Method used for displaying the information about how many tickets were purchased for different type
   * 
   * @param type
   *          Type of ticket you are looking for
   * @return If no tickets are bought return zero, otherwise return amount of tickets bought
   */
  public int howManyTicketsPurchased(TicketType type) {
    if (currentTicketNumber.get(type).intValue() == 0) {
      return 0;
    }
    else {
      return currentTicketNumber.get(type).intValue();
    }

  }

  /**
   * Method prints out the purchased number of tickets for the event, as well as the number of tickets available.
   * 
   */
  public void printPurchasedTicketInformation() {
    System.out.println("Event Name:" + name);
    int availableSeats = totalNumberOfSeats;
    for (Integer type : currentTicketNumber.values()) {
      availableSeats -= type;
    }
    System.out.println("Number of Tickets Still Available:\n" + availableSeats);
    for (TicketType type : TicketType.values()) {
      System.out.println("\n" + type + " Ticket Numbers:");
      for (int i = 0; i < tickets.get(type).size(); i++) {
        if (tickets.get(type).get(i) == null) {
          System.out.print("");
        }
        else {
          System.out.print(tickets.get(type).get(i).getNumber() + " ");
        }
      }

    }
    System.out.print("\n");
  }

  /**
   * Along with addTicket method, this method is used to purchase tickets and add them to the list
   * 
   * @param numberOfTickets
   *          Number of Tickets the user is looking to purchase
   * @param type
   *          TicketType used for the creation of the ticket (passed onto addTicket)
   */
  public void purchaseTickets(int numberOfTickets, TicketType type) {
    int seatsAvailable = totalNumberOfSeats;
    for (Integer type1 : currentTicketNumber.values()) {
      seatsAvailable -= type1;
    }
    if (0 >= seatsAvailable) {
      System.out.println("No spaces available.");
    }
    else if (0 < seatsAvailable) {
      if (numberOfTickets <= seatsAvailable) {
        for (int i = 0; i < numberOfTickets; i++) {
          Ticket ticket = new Ticket(currentTicketNumber.get(type).intValue() + 1, type, prices.get(type));
          addTicket(ticket);
          currentTicketNumber.put(type, currentTicketNumber.get(type).intValue() + 1);
        }
      }

    }
  }

  // Extra Question
  /**
   * //Method used for validating the constructors by ensuring none of them are null, if they are null exceptions are thrown
   * 
   * @throws Exception
   *           Throws exception based on the condition that is filled.
   */
  public void constructorValidation() throws Exception {
    if (this.name == null) {
      throw new NullEventNameException();
    }

    if (this.eventType == null) {
      throw new NullEventTypeException();
    }
    if (this.prices == null) {
      throw new NullEventPricesException();
    }
  }
}
