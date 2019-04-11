package org.com1027.question3;

import java.util.ArrayList;
import java.util.List;

public abstract class Event {

  /**
   * 
   * @param name
   *          Contains the event name
   * @param eventType
   *          Type of event, either Free or Paid
   * @param totalNumberOfSeats
   *          The total amount of seats available at the event
   */
  public Event(String name, EventType eventType, int totalNumberOfSeats) {
    this.name = name;
    this.eventType = eventType;
    this.totalNumberOfSeats = totalNumberOfSeats;
  }

  // Fields
  private String       name                       = null;
  private EventType    eventType;
  private int          totalNumberOfSeats;
  private List<Ticket> memberTickets              = new ArrayList<Ticket>();
  private List<Ticket> studentTickets             = new ArrayList<Ticket>();
  private int          currentMemberTicketNumber  = 0;
  private int          currentStudentTicketNumber = 0;

  /**
   * This method is used in conjunction with purchase tickets to create and populate the list with tickets
   * 
   * @param numberOfTickets
   *          Number of tickets the user wishes to purchase
   * @param type
   *          Type of tickets the user wishes to purchase
   */
  private void createTickets(int numberOfTickets, TicketType type) {
    if (type == TicketType.MEMBER) {
      for (int i = 1; i <= numberOfTickets; i++) {
        Ticket ticket = new Ticket(currentMemberTicketNumber + 1, TicketType.MEMBER);
        memberTickets.add(ticket);
        currentMemberTicketNumber++;
      }
    }
    else if (type == TicketType.STUDENT) {
      for (int i = 1; i <= numberOfTickets; i++) {
        Ticket ticket = new Ticket(currentStudentTicketNumber + 1, TicketType.MEMBER);
        studentTickets.add(ticket);
        currentStudentTicketNumber++;
      }

    }

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
    if (type == TicketType.STUDENT) {
      return currentStudentTicketNumber;
    }
    else if (type == TicketType.MEMBER) {
      return currentMemberTicketNumber;
    }
    else {
      return 0;
    }

  }

  /**
   * Method prints out the purchased number of tickets for the event, as well as the number of tickets available.
   * 
   */
  public void printPurchasedTicketInformation() {
    System.out.println("Event Name:" + name);
    int availableSeats = totalNumberOfSeats - (currentMemberTicketNumber + currentStudentTicketNumber);
    System.out.println("Number of Tickets Still Available:\n" + availableSeats);
    System.out.println("Member Ticket Numbers:");
    for (Ticket ticket : memberTickets) {
      System.out.print(ticket.getNumber() + " ");
    }
    System.out.println("\nStudent Ticket Numbers:");
    for (Ticket ticket : studentTickets) {
      System.out.print(ticket.getNumber() + " ");
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
  public void purchaseTickets(int memberTickets, int studentTickets) {
    int ticketTotal = memberTickets + studentTickets;
    int seatsAvailable = totalNumberOfSeats - (currentMemberTicketNumber + currentStudentTicketNumber);

    if (0 >= seatsAvailable) {
      System.out.println("No spaces available.");
    }
    else if (0 < seatsAvailable) {
      if (ticketTotal <= seatsAvailable) {
        if (memberTickets > 0) {
          createTickets(memberTickets, TicketType.MEMBER);
        }
        if (studentTickets > 0) {
          createTickets(studentTickets, TicketType.STUDENT);
        }
      }

    }
  }
}
