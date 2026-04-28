import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void greet() {
        //given
        String expected = "Hello World!";
        //when
        String actual = Main.greet();
        //then
        assertEquals(expected, actual);
    }
}