import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@SuppressWarnings("unused")

class urinalsTest {

    @Test
    void main() {
    }

    @Test
    void goodString() {
        System.out.println("=======Vamsi Krishna Somepalli========TEST ONE EXECUTED");
        assertFalse(urinals.GoodString("001100"));
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
    }
}