package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int vacationes = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money = money / 3;
                vacationes++;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return vacationes;
    }
}