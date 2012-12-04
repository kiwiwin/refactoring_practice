import org.testng.annotations.*;
import static org.testng.Assert.*;

public class TelephoneNumberTest {
    @Test
    public void should_return_110_654321_for_telephone_number(){
        assertEquals("110_654321", new TelephoneNumber("110", "654321").getTelephoneNumber());
    }
}
