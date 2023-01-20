import org.junit.Test;
import static org.junit.Assert.*;

public class TestingStuff {

  @Test
  public void HelloWorldTest() {
    String helloWorld = "Hello World";
    String testing = "Hello World";
    String bad = "bad";

    assertEquals(helloWorld, testing);
  }
}