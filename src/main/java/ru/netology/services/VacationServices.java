package ru.netology.services;

public class VacationServices {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int vacaciones = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money = money / 3;
                vacaciones++;
                // money /=3;
            } else {
                money += income;
                money -= expenses;
                // money += income - expenses;
            }
        }
        return vacaciones;
    }
}



