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
        System.out.println("=======Vamsi Krishna Somepalli========TEST THREE EXECUTED");
        assertFalse(urinals.GoodString("001A00"));
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