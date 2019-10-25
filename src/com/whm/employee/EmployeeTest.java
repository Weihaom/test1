package com.whm.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        //创建员工
        Employee staff[] = new Employee[3];

        staff[0] = new Employee("Michael", 75000, 1987, 12, 5);
        staff[1] = new Employee("Jack", 50000, 1989, 10, 1);
        staff[2] = new Employee("James", 40000, 1990, 3, 15);

        Employee Michael = staff[0];
        Employee Jack = staff[1];
        Employee James = staff[2];

        Jack.setId(Employee.nextID++);
        System.out.println("Jack.id=" + Jack.getId());
        System.out.println("Jack.nextID=" + Employee.nextID);

        People p = new People("Wade", 37, 1);

    }
}
