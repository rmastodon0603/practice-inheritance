package org.itstep.task02;

import org.itstep.task01.Employee;

/**
 * Задание 2
 *
 * 1) Создайте класс EmployeeAndTax
 * 2) Отнаследуйтесь от класса Employee
 * 3) Реализуйте нужные конструкторы
 * 4) Добавьте защищенное поле налога (tax)
 * 5) Создайте геттер для tax
 * 6) Переопределите метод setPaymentType(), который задает налог в зависимости от вида оплаты
 * 7) Переопределите метод getPaymentWithTax(), который должен возвращать К оплате (т.е. сумму с учетом налогов)
 * 8) Переопределите метод toString(), который должен возвращать строку вида: ФИО | Налог, % | Сумма | К оплате
 * 9) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов  |       15% | 3000.0      | 2550.0
 Сидоров |       20% | 800.0       |  640.0
 Петров  |       15% | 5500.0      | 4675.0
 Итого   |           |             | 7865.0
 */

public class EmployeeAndTax extends Employee {

    private double tax;
    private double payment;

    public EmployeeAndTax(String fullName, String paymentType, double payment)
    {
        super(fullName, paymentType, payment);
        this.payment = payment;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public void setPaymentType(String paymentType) {

        if(paymentType == "ставка" || paymentType == "сдельная")
        {
            tax = 15;
        }
        else
        {
            tax = 20;
        }

        super.setPaymentType(paymentType);
    }

    @Override
    public double getPaymentWithTax() {
        setPayment(getPayment() - getPayment()*tax/100);
        return getPayment();
    }

    public String toString()
    {
        String str = new String();

        str = getFullName() + " | " + tax + "%" + " | " + payment + " | " + super.getPayment();

        return str;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


}
