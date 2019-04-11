package org.com1027.questionOptional;

import java.util.ArrayList;
import java.util.List;

//Extra Question
public abstract class History<T> {

  /**
   * 
   * @param organisation
   *          Organisation object that is passed into the class.
   * @throws Exception
   *           Exception is thrown if organisation has a lower case name.
   */
  public History(Organisation organisation) throws Exception {
    this.organisation = organisation;
    if (organisation != null) {
      if (!Character.isUpperCase(organisation.getName().charAt(0))) {
        throw new LackCapitalOrganisationException();
      }
    }

  }

  List<FreeEvent> FreeEvents = new ArrayList<FreeEvent>();
  List<PaidEvent> PaidEvents = new ArrayList<PaidEvent>();
  Organisation    organisation;

  /**
   * Passes a free event object into the method then adds it to the list.
   * 
   * @param event
   *          Free event object that is passed in and added to the list
   */
  public void addFreeEvent(FreeEvent event) {
    FreeEvents.add(event);
  }

  /**
   * Passes a paid event object into the method then adds it to the list.
   * 
   * @param event
   *          Paid event object that is passed in and added to the list
   */
  public void addPaidEvent(PaidEvent event) {
    PaidEvents.add(event);
  }

  /**
   * Creates a string with all the free event names and event types and then returns it
   * 
   * @return String with all event names and types and returns it
   */
  public String displayFreeEvents() {
    String displayEvent = null;
    for (FreeEvent event : FreeEvents) {
      if (displayEvent == null) {
        displayEvent = event.getEventName() + ": " + event.getEventType() + "\n";
      }
      else {
        displayEvent += event.getEventName() + ": " + event.getEventType() + "\n";
      }
    }
    return displayEvent;
  }

  /**
   * Creates a string with all the paid event names and event types and then returns it
   * 
   * @return String with all event names and types and returns it
   */
  public String displayPaidEvents() {
    String displayEvent = null;
    for (PaidEvent event : PaidEvents) {
      if (displayEvent == null) {
        displayEvent = event.getEventName() + ": " + event.getEventType() + "\n";
      }
      else {
        displayEvent += event.getEventName() + ": " + event.getEventType() + "\n";
      }
    }
    return displayEvent;
  }

  /**
   * Method that calculates the cost of all the paid events.
   * 
   * @param discountCode
   *          Code that determines if the user receives a 20% discount
   * @return Total cost of all the paid events
   */
  public double calculateTotalTicketCostOfPaidEvents(String discountCode) {
    double totalCost = 0;
    for (PaidEvent event : PaidEvents) {
      totalCost += event.calculateTotalTicketCostOfPurchasedTickets(discountCode);
    }

    return totalCost;

  }

  /**
   * Getter
   * 
   * @return Returns the organisation field.
   */
  public Organisation getOrganisation() {
    return organisation;
  }

  // Extra Question
  public abstract List<String> listOfSoldOutEvents();
}
