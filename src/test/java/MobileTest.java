import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MobileTest {
  @Test
  public void should_has_name_color_brand_attributes() {
    Mobile mobile = new Mobile("testPhone", "red", "APPLE");
    assertEquals("testPhone", mobile.getName());
    assertEquals("red", mobile.getColor());
    assertEquals("APPLE", mobile.getBrand());
  }

  @Test
  public void should_output_formatted_message_when_make_a_call_and_print_test_message() {
    Mobile mobile = new Mobile("testPhone", "red", "APPLE");
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    mobile.makeACall("test");

    assertEquals("Message : test", outContent.toString());
  }

  @Test
  public void should_output_formatted_message_when_make_a_call_and_print_input_message() {
    Mobile mobile = new Mobile();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    mobile.makeACall("input");

    assertEquals("Message : input", outContent.toString());
  }

  @Test
  public void should_print_mobile_introduction() {
    Mobile mobile = new Mobile("testPhone", "red", "APPLE");
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    mobile.introduce();

    assertEquals("name: testPhone, color: red, brand: APPLE", outContent.toString());
  }
}
