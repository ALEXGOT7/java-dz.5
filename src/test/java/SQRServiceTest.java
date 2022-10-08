import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.range(200, 400);

        Assertions.assertEquals(expected, actual);


    }
}
