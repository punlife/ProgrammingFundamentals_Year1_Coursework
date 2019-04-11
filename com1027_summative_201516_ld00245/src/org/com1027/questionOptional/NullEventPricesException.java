package org.com1027.questionOptional;

public class NullEventPricesException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 3445804788196930704L;

  public NullEventPricesException() {
  }

  public NullEventPricesException(String msg) {
    super(msg);
  }

  public NullEventPricesException(Throwable cause) {
    super(cause);
  }

  public NullEventPricesException(String msg, Throwable cause) {
    super(msg, cause);
  }

}
