public class Mobile {

  private String name;
  private String color;
  private String brand;

  public Mobile() {

  };

  public Mobile(String name, String color, String brand) {
    this.name = name;
    this.color = color;
    this.brand = brand;
  }


  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public String getBrand() {
    return brand;
  }

  public void makeACall(String message) {
    if (message.length() > getMessageLimit()) {
      System.out.print(" Message cannot be sent");
      return;
    }
    System.out.print("Message : " + message);
  }

  protected int getMessageLimit() {
    return Integer.MAX_VALUE;
  };

  public void introduce() {
    System.out.print("name: " + name + ", color: " + color + ", brand: " + brand);
  }
}
