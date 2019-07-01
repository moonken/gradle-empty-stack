import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PersonTest {

  @Test
  public void should_has_name() {
    Person person = new Person("tom");
    assertEquals("tom", person.getName());
  }

  @Test
  public void should_able_to_send_message_via_phone() {
    Person person = new Person("tom", new IPhone("myPhone", "green", "APPLE"));
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    person.makeACall("testtesttesttesttesttesttest");

    assertEquals("<iPhone> Message cannot be sent", outContent.toString());
  }

  @Test
  public void should_able_to_change_mobile() {
    Person person = new Person("tom", new IPhone("myPhone", "green", "APPLE"));

    person.setMobile(new Android("myPhone", "red", "LG"));
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    person.makeACall("testtesttesttesttesttesttest");

    assertEquals("<Android> Message cannot be sent", outContent.toString());
  }
}
