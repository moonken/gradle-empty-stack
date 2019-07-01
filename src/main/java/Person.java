public class Person {
  private String name;
  private Mobile mobile;

  public Person(String name) {
    this.name = name;
  }

  public Person(String name, Mobile mobile) {
    this.name = name;
    this.mobile = mobile;
  }

  public String getName() {
    return name;
  }

  public void setMobile(Mobile mobile) {
    this.mobile = mobile;
  }

  public void makeACall(String message) {
    this.mobile.makeACall(message);
  }
}
