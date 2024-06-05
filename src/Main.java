package Problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class MainProblem2 {
    public static void main(String[] args) {
        Professor[] professors = {
                new Professor("Prof1", 50000, LocalDate.of(2002, 6, 25), 30),
                new Professor("Prof2", 80000, LocalDate.of(2010, 7, 10), 40),
                new Professor("Prof3", 90000, LocalDate.of(2012, 8, 9), 5)
        };

        Secretary[] secretaries = {
                new Secretary("Sec1", 20000, LocalDate.of(2020, 9, 9), 10),
                new Secretary("Sec2", 15000, LocalDate.of(2022, 10, 5), 5)
        };

        DeptEmployee[] department = new DeptEmployee[professors.length + secretaries.length];

        int index = 0;
        for (Professor prof : professors) {
            department[index++] = prof;
        }
        for (Secretary sec : secretaries) {
            department[index++] = sec;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you wish to see the sum of all Professor and Secretary salary in the department? (Y/N): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            double totalSalary = 0;
            for (DeptEmployee emp : department) {
                totalSalary += emp.computeSalary();
            }
            System.out.println("Total salary: " + totalSalary);
            System.out.println("Average salary: " + (totalSalary / department.length));
        }

        scanner.close();
    }
}