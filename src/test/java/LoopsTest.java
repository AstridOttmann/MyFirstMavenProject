import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopsTest {
    @Test
    void calculateFacultyForZero(){
        //GIVEN
        int number = 0;
        //WHEN
        int actual = Loops.faculty(number);
        //THEN
        int result = 1;
        assertEquals(1, actual);
    }
    @Test
    void calculateFacultyForOne(){
        //GIVEN
        int number = 1;
        //WHEN
        int actual = Loops.faculty(number);
        //THEN
        int result = 1;
        assertEquals(1, actual);
    }
    @Test
    void calculateFacultyForTwo(){
        //GIVEN
        int number = 2;
        //WHEN
        int actual = Loops.faculty(number);
        //THEN
        int result = 2;
        assertEquals(2, actual);
    }
    @Test
    void calculateFacultyForThree(){
        //GIVEN
        int number = 3;
        //WHEN
        int actual = Loops.faculty(number);
        //THEN
        int result = 6;
        assertEquals(6, actual);
    }
}