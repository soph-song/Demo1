import static org.junit.Assert.*;
import org.junit.*;

public class FinderTest {
    @Test
    public void isItEven(){
        Integer[] list = {1,2,3,4,5};
        Integer[] expected = {2,4};
        Finder f1 = new Finder();
        assertArrayEquals(expected,f1.EvenNumberFinder(list));
    }
}
