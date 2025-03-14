package ru.netology.services;

public class Main {

    public static void main(String[] args) {
        VacationServices service = new VacationServices();
        int vacaciones = service.calculate(10_000, 3_000, 20_000);
        System.out.println("Количество месяцев отпуска: " + vacaciones);

        vacaciones = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Новое количество месяцев отпуска: " + vacaciones);
    }
}
