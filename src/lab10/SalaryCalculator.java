package lab10;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {
    public static void main(String[] args) {
        Employee fullTimeEmployee1 = new FullTimeEmployee();
        Employee fullTimeEmployee2 = new FullTimeEmployee();
        Employee fullTimeEmployee3 = new FullTimeEmployee();
        Employee contractEmployee1 = new ContractEmployee();
        Employee contractEmployee2 = new ContractEmployee();

        int totalSalary;
        totalSalary = SalaryCalculator.calculatorSalary(Arrays.asList(fullTimeEmployee1, fullTimeEmployee2
                , fullTimeEmployee3, contractEmployee1, contractEmployee2));

        System.out.println("Total salary: " + totalSalary);


    }

    private static int calculatorSalary(List<Employee> arrayList) {
        int totalSalary = 0;
        for (Employee employee : arrayList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }

}
