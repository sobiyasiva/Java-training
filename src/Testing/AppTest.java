package Testing;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(5, 3);
        assertEquals(8, result); 
    }
}
