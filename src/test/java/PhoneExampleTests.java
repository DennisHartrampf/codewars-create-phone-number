import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneExampleTests {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void tests2() {
        assertEquals("(000) 000-0000", Kata.createPhoneNumber(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }
}
