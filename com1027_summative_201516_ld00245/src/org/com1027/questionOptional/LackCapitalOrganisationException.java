package org.com1027.questionOptional;

public class LackCapitalOrganisationException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 2281315594778397723L;

  /**
   * 
   */

  public LackCapitalOrganisationException() {
  }

  public LackCapitalOrganisationException(String msg) {
    super(msg);
  }

  public LackCapitalOrganisationException(Throwable cause) {
    super(cause);
  }

  public LackCapitalOrganisationException(String msg, Throwable cause) {
    super(msg, cause);
  }

}
