import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@SuppressWarnings("ALL")

class urinalsTest {

    @Test
    void main() {
    }

    @Test
    void goodString() {
        System.out.println("=======Vamsi Krishna Somepalli========TEST ONE EXECUTED");
        assertFalse(urinals.GoodString("001100"));
        System.out.println("=======Vamsi Krishna Somepalli========TEST TWO EXECUTED");
        assertTrue(urinals.GoodString("001010101"));
    }

    @Test
    void getString() {
    }

    @Test
    void openFile() {
    }

    @Test
    void countUrinals() {
        System.out.println("=======Vamsi Krishna Somepalli========TEST THREE EXECUTED");
        assertEquals(-1,urinals.countUrinals("00110101"));
        assertEquals(1,urinals.countUrinals("10001"));
        assertEquals(3,urinals.countUrinals("00000"));
        assertEquals(1,urinals.countUrinals("01000"));
        assertEquals(2,urinals.countUrinals("0000"));

    }
}