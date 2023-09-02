package ru.netology.services;

public class MoneyService {

    public int calculate(int income, int expense) {  // деньги (доход от работы), расходы за месяц
        int threshold = 0; //деньги на счету
        int count = 0; // счётчик месяцев отдыха

        for (int month = 1; month < 12; month++) {
            if (threshold >= 20000) {  // месяцы отдыха, если денег на счету 20 000 то отдыхаем
                count++;
                threshold = (threshold - expense) / 3; //вычитаем со счета расходы
                //threshold = threshold / 3; //деньги на счету уменьшаем в три раза
            } else {  //идем работать
                threshold = threshold + (income - expense); // деньги на счету = деньги от работы - расходы за месяц
            }
        }
        return count;
    }
}
