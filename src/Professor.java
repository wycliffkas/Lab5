package Problem2;

import java.time.LocalDate;

public class Professor extends  DeptEmployee {
    private int numberOfPublications;

    public Professor(String name, double salary, LocalDate hireDate, int numberOfPublications) {
        super(name, hireDate, salary);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public double computeSalary() {
        return salary;
    }
}
