import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AndroidTest {
  @Test
  public void should_print_message_with_brand() {
    Android android = new Android();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    android.makeACall("test");

    assertEquals("<Android>Message : test", outContent.toString());
  }

  @Test
  public void should_alert_when_message_exceed_limit_length() {
    Android android = new Android();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    android.makeACall("TestTestTestTest");

    assertEquals("<Android> Message cannot be sent", outContent.toString());
  }
}
