import com.kata.BoundaryService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class
BoundaryServiceTest {

    BoundaryService boundaryService = new BoundaryService();

    @Test
    void testFindMin() {
        int[] marks = {-1, 2, 3, 4, -3};

        int expectedResult = Arrays.stream(marks).min().getAsInt();
        int actualResult = boundaryService.findMin(marks);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testFake() {
        assertEquals(1, 2);
    }
}
