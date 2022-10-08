package ru.netology.sqr;

public class SQRService {
    public int range(int a, int b) {
        int amount = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= a) & (i * i <= b)) {
                amount++;
            }
        }
        return amount;
    }
}