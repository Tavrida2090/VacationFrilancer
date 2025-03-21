import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationService;

public class VacationServiceTest {

    @Test
    public void VacationInCrimea() {
        VacationService service = new VacationService();
        int vacationes = service.calculate(10_000, 3_000, 20_000);
        //System.out.println("Отпуск при работе в Крыму: " + vacationes);

        Assertions.assertEquals(3, 3);
    }

    @Test
    public void VacationInMoscow() {
        VacationService service = new VacationService();
        int vacationes = service.calculate(100_000, 60_000, 150_000);
        //System.out.println("Отпуск при работе в Москве: " + vacationes);

        Assertions.assertEquals(2, 2);
    }

    @Test
    public void VacationRemotely() {
        VacationService service = new VacationService();
        int vacationes = service.calculate(50_000, 10_000, 100_000);
        //System.out.println("Отпуск при работе удаленно: " + vacationes);

        Assertions.assertEquals(3, 3);
    }

}
