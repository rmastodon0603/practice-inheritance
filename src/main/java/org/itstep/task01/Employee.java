package org.itstep.task01;
/**
 * Задание 1
 *
 * 1) Создайте класс Employee.
 * 2) Добавьте поля: fullName (ФИО), paymentType (вид оплаты), payment (сумма)
 * 3) Создайте конструктор с тремя параметрами
 * 4) Реализуйте геттеры и сеттеры
 * 5) Переопределите метод toString(), который должен возвращать данные вида: ФИО | Вид оплаты | Сумма
 * 6) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Вид оплаты  |  Сумма
 ---------|--------------|------------
 Иванов  | ставка       | 3000.0 грн
 Сидоров | почасовая    |  800.0 грн
 Петров  | сдельная     | 5500.0 грн
 Итого   |              | 9300.0 грн

 */

public class Employee {
    private String fullName;
    private String paymentType;
    private double payment;

    public Employee()
    {

    }

    public Employee(String fullName, String paymentType, double payment)
    {
        this.fullName = fullName;
        setPaymentType(paymentType);
        this.payment = payment;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public String toString()
    {
        String str = new String();

        str = fullName + " | " + paymentType + " | " + payment;

        return str;
    }

    public double getPaymentWithTax()
    {
        return getPayment();
    }

}
