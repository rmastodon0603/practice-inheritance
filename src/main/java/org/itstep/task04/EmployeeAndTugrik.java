package org.itstep.task04;

import org.itstep.task03.EmployeeAndChild;

/**
 * Задание 4
 *
 * 1) Создайте класс EmployeeAndTugrik
 * 2) Реализуйте нужные конструкторы
 * 3) Добавьте приватное поле tugrickExchange
 * 4) Реализуйте геттер и сеттер для tugrickExchange
 * 5) Переопределите метод toString() для вывода данных о сотруднике с учетом выплаты в тугриках
 * 6) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов   |       15% | 3000.0      | 2550.0
 Сидоров  |       20% | 800.0       | 320.0 / 40.0
 Петров   |       20% | 5500.0      | 4400.0
 Итого    |           |             | 9300.0
 */

public class EmployeeAndTugrik extends EmployeeAndChild {
    private double tugrickExchange;
    private double payment;
    private double paymentClear;

    public EmployeeAndTugrik(String fullName, String paymentType, double payment)
    {
        super(fullName, paymentType, payment);
        this.paymentClear = payment;
    }

    public EmployeeAndTugrik(String fullName, String paymentType, double payment, boolean hasChild)
    {
        super(fullName, paymentType, payment, hasChild);
        this.paymentClear = payment;
    }

    public void setTugrickExchange(double tugrickExchange) {
        this.tugrickExchange = tugrickExchange;
    }

    public double getTugrickExchange() {
        return tugrickExchange;
    }

    @Override
    public double getPaymentWithTax() {

        payment = getPayment() - getPayment()*getTax()/100;
        setPayment(getPayment() - getPayment()*getTax()/100);

        if(getPaymentType() == "почасовая")
        {
            setPayment(getPayment()/2);
            setTugrickExchange(getPayment()/getTugrickExchange());
        }

        return payment;
    }

    public void setPaymentClear(double paymentClear) {
        this.paymentClear = paymentClear;
    }

    @Override
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
    }

}
