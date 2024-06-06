package hwsort.taska;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
        super(name, hireDate, salary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return salary + (12 * overtimeHours);
    }
}