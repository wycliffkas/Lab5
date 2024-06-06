package hwsort.taskd;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private LocalDate hireDate;
    protected double salary;

    public DeptEmployee(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public double computeSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "DeptEmployee [name=" + name + ", hireDate=" + hireDate;
    }
}