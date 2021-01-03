package org.itstep.task03;

import org.itstep.task02.EmployeeAndTax;
/**
 * Задание 3
 *
 * 1) Создайте класс EmployeeAndChild, наследник EmployeeAndTax
 * 2) Реализуйте нужные конструкторы
 * 3) Добавьте логическое поле hasChild
 * 4) Добавьте дополнительный конструктор, который помимо ФИО, вида оплаты и суммы принимает
 * есть ли дети у сотрудника
 * 5) Добавить геттеры и сеттеры для поля hasChild
 * 6) Раскомментируйте код в методе main()
 *
 * Запустите, ожидается вывод:

 ФИО    |  Налог, % | Сумма (грн) | К оплате (грн)
 ---------|-----------|-------------|---------------
 Иванов  |       15% | 3000.0      | 2550.0
 Сидоров |       20% | 800.0       |  640.0
 Петров  |       20% | 5500.0      | 4400.0
 Итого   |           |             | 7590.0
 */
public class EmployeeAndChild extends EmployeeAndTax {
    private boolean hasChild;

    public EmployeeAndChild(String fullName, String paymentType, double payment)
    {
        super(fullName, paymentType, payment);
        setTax(getTax() + 5);
    }

    public EmployeeAndChild(String fullName, String paymentType, double payment, boolean hasChild)
    {
        super(fullName, paymentType, payment);

        this.hasChild = hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public boolean isHasChild() {
        return hasChild;
    }
}
