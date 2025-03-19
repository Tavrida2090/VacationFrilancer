import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        int vacationes = service.calculate(10_000, 3_000, 20_000);
        System.out.println("Отпуск при работе в Крыму: " + vacationes);

        vacationes = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Отпуск при работе в Москве: " + vacationes);
    }
}
//int income = 10_000;
//int expenses = 3_000;
//int threshold = 20_000;