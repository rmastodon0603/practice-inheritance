package org.itstep.task06;

import org.itstep.task05.EmployeeAndOffshore;

/**
 * Задание 6
 *
 * 1) Создайте класс EmplyeeAndBonus
 * 2) Добавьте приватное поле workHours
 * 3) Реализуйте нужные конструкторы
 * 4) Реализуйте геттер и сеттер для workHours
 * 5) Переопределите метод toString() для вывода данных о сотруднике с учетом бонусов при работе более 200 часов
 * 6) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов  |       15% | 3600.0      | 3060.0
 Сидоров |       20% | 800.0       | 320.0 / 40.0
 Петров  |       20% | 6600.0      | 5280.0
 Итого   |           |             | 11000.0

 */
public class EmplyeeAndBonus extends EmployeeAndOffshore {
    private int workHours;

    EmplyeeAndBonus(String fullName, String paymentType, double payment, int hours)
    {
        super(fullName, paymentType, payment);
        bonus(hours);
    }

    EmplyeeAndBonus(String fullName, String paymentType, double payment, boolean hasChild, int hours)
    {
        super(fullName, paymentType, payment, hasChild);
        bonus(hours);
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void bonus(int hours)
    {
        if(hours > 200)
        {
            setPayment(getPayment() + getPayment()*20/100);
            setPaymentClear(getPayment());
        }
    }

    /*@Override
    public String toString() {
        String str = new String();

        if(getPaymentType() == "почасовая") {
            str = getFullName() + " | " + getTax() + "%" + " | " + paymentClear + " | " + super.getPayment() + "/"+ getTugrickExchange();
        }
        else
        {
            str = getFullName() + " | " + getTax() + "%" + " | " + paymentClear + " | " + super.getPayment();
        }
        return str;
    }*/
}
