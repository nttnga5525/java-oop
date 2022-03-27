package lab8_1;

import java.util.Arrays;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        Employee fullTimeEmployee1 = new FullTimeEmployee();
        Employee fullTimeEmployee2 = new FullTimeEmployee();
        Employee fullTimeEmployee3 = new FullTimeEmployee();
        Employee contractEmployee1 = new ContractEmployee();
        Employee contractEmployee2 = new ContractEmployee();
        TestEmployee.calculatorSalary(Arrays.asList(fullTimeEmployee1, fullTimeEmployee2
                , fullTimeEmployee3, contractEmployee1, contractEmployee2));


    }

    private static void calculatorSalary(List<Employee> arrayList) {
        int totalSalary = 0;
        for (Employee employee : arrayList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        System.out.println("Total salary: " + totalSalary);
    }

}
