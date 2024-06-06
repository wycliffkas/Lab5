package src;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = new Secretary("Wycliff", 2000.00, LocalDate.of(2002, 6, 10), 10);
        department[1] = new Secretary("Stella", 4000.00, LocalDate.of(2002, 6, 10), 13);
        department[2] = new Professor("Okello", 3000, LocalDate.of(2016, 4,2), 4);
        department[3] = new Professor("Otim", 3000, LocalDate.of(2016, 4,2), 2);
        department[4] = new Professor("Stephanie", 3000, LocalDate.of(2016, 4,2), 3);

        System.out.println("Do wishes to see the sum of all Professor and Secretary salary in the department");

        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine().toLowerCase();
        if(response.equals("y")) {
            double salary = computeAveSalary(department);
            System.out.println("Salary: " + salary);
        }


    }

    public static double computeAveSalary(DeptEmployee[] department) {
        double salary = 0;
        for(DeptEmployee employee : department) {
            salary +=  employee.computeSalary();
        }

        return salary / department.length;
    }
}
