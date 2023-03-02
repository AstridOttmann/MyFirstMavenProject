import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SmallerThanZeroTest {
    @Test
    void givenNumberTwoReturnsFalse(){
        //GIVEN
        int i = 2;

        //WHEN
        boolean actual = SmallerThanZero.smallerThanZero(i);

        //THEN
        assertFalse(actual);

    }

    @Test
    void givenNumberElevenReturnsTrue(){
        //GIVEN
        int i = -11;

        //WHEN
        boolean actual = SmallerThanZero.smallerThanZero(i);

        //THEN
        assertTrue(actual);

    }
    @Test
    void givenNumberEqualZeroReturnsFalse(){
        //GIVEN
        int i = 0;

        //WHEN
        boolean actual = SmallerThanZero.smallerThanZero(i);

        //THEN
       // assertEquals(true, actual);
        assertFalse(actual);

    }
}
