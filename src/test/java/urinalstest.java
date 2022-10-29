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
    void openFile() throws Exception {
        urinals urinals = new urinals();
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> urinals.openFile("test1.txt"),
                "throw error"
        );

    }


    @Test
    void countUrinals() {
        System.out.println("=======Vamsi Krishna Somepalli========TEST FOUR EXECUTED");
        assertEquals(1,urinals.countUrinals("10001"));
        assertEquals(3,urinals.countUrinals("00000"));
        assertEquals(1,urinals.countUrinals("01000"));
        assertEquals(2,urinals.countUrinals("0000"));
        System.out.println("=======Vamsi Krishna Somepalli========TEST FIVE EXECUTED");
        assertEquals(-1,urinals.countUrinals("00A00"));
    }
}