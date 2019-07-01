import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class IPhoneTest {
  @Test
  public void should_print_message_with_brand() {
    IPhone iPhone = new IPhone();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    iPhone.makeACall("test");

    assertEquals("<iPhone>Message : test", outContent.toString());
  }

  @Test
  public void should_alert_when_message_exceed_limit_length() {
    IPhone iPhone = new IPhone();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    iPhone.makeACall("TestTestTestTestTestTest");

    assertEquals("<iPhone> Message cannot be sent", outContent.toString());
  }
}
