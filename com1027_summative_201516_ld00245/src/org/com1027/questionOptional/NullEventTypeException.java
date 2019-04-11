package org.com1027.questionOptional;

public class NullEventTypeException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = -5912377898211995863L;

  public NullEventTypeException() {
  }

  public NullEventTypeException(String msg) {
    super(msg);
  }

  public NullEventTypeException(Throwable cause) {
    super(cause);
  }

  public NullEventTypeException(String msg, Throwable cause) {
    super(msg, cause);
  }

}
