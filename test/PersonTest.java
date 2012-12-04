import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void should_return_abc_for_the_name() {
        assertEquals("abc", new Person("abc", new TelephoneNumber("dummy_area_code", "dummy_office_number")).getName());
    }

    @Test
    public void should_return_028_123456_for_telephone_number(){
        assertEquals("028_123456", new Person("dummy_name", new TelephoneNumber("028", "123456")).getTelephoneNumber());
    }
}