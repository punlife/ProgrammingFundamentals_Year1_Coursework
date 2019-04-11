package org.com1027.questionOptional;

public class NullEventNameException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 7754098622262794971L;

  public NullEventNameException() {
  }

  public NullEventNameException(String msg) {
    super(msg);
  }

  public NullEventNameException(Throwable cause) {
    super(cause);
  }

  public NullEventNameException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
