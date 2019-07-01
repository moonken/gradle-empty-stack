public class IPhone extends Mobile {
  public IPhone() {
    super();
  }

  public IPhone(String name, String color, String brand) {
    super(name, color, brand);
  }

  @Override
  public void makeACall(String message) {
    System.out.print("<iPhone>");
    super.makeACall(message);
  }

  @Override
  protected int getMessageLimit() {
    return 20;
  }
}
