package org.itstep.task05;

import org.itstep.task04.EmployeeAndTugrik;

/**
 * Задание 5
 *
 * 1) Создайте класс EmployeeAndOffshore
 * 2) Добавьте приватное поле inOffshore
 * 3) Реализуйте нужные конструкторы
 * 4) Реализуйте геттер и сеттер для inOffshore
 * 5) Переопределите метод toString() для вывода данных о сотруднике с учетом работы в офшоре
 * 6) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов  |        0% | 3000.0      | 3000.0
 Сидоров |       20% | 800.0       | 320.0 / 40.0
 Петров  |       20% | 5500.0      | 4400.0
 Итого   |           |             | 9300.0

 */
public class EmployeeAndOffshore extends EmployeeAndTugrik {

    private boolean inOffshore;
    private double payment;
    public EmployeeAndOffshore(String fullName, String paymentType, double payment)
    {
        super(fullName, paymentType, payment);
    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild)
    {
        super(fullName, paymentType, payment, hasChild);
    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild, boolean inOffshore)
    {
        super(fullName, paymentType, payment, hasChild);
        this.inOffshore = inOffshore;
    }

    public boolean getInOffshore() {
        return inOffshore;
    }

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore = inOffshore;
    }

    @Override
    public double getPaymentWithTax() {
        if(inOffshore == true)
        {
            setTax(0);
        }


        payment = getPayment() - getPayment()*getTax()/100;

        setPayment(getPayment() - getPayment()*getTax()/100);

        if(getPaymentType() == "почасовая")
        {
            setPayment(getPayment()/2);
            setTugrickExchange(getPayment()/getTugrickExchange());
        }

        return payment;
    }


}
