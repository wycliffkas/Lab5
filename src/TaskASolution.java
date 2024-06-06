package src;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class TaskASolution {
    public static void main(String[] args) {
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = new Secretary("Wycliff", 2000.00, LocalDate.of(2002, 6, 10), 10);
        department[1] = new Secretary("Stella", 4000.00, LocalDate.of(2002, 6, 10), 13);
        department[2] = new Professor("Okello", 3000, LocalDate.of(2016, 4,2), 4);
        department[3] = new Professor("Otim", 3000, LocalDate.of(2016, 4,2), 2);
        department[4] = new Professor("Stephanie", 3000, LocalDate.of(2016, 4,2), 3);

        Arrays.sort(department, new TaskAComparator());


        System.out.println(Arrays.toString(department));

    }
}