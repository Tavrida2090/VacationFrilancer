package ru.netology.services;

public class Main {

    public static void main(String[] args) {
        VacationServices service = new VacationServices();
        int vacaciones = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Количество месяцев отпуска: " + vacaciones);
    }
}
