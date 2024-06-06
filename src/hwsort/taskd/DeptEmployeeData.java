package src.hwsort.taskd;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class DeptEmployeeData {
    public static void main(String[] args) {
       DeptEmployee[] data = DeptEmployeeData.getDeptData();
       Arrays.sort(data, new Comparator<DeptEmployee>() {
           public int compare(DeptEmployee Employee1, DeptEmployee Employee2) {
               return Employee2.getName().compareTo(Employee1.getName());
           }
       });

        System.out.println(Arrays.toString(data));


    }

    public static DeptEmployee[] getDeptData () {
        DeptEmployee[] departments = new DeptEmployee[5];
        departments[0] = new Secretary("Wycliff", 2000.00, LocalDate.of(2002, 6, 10), 10);
        departments[1] = new Secretary("Stella", 4000.00, LocalDate.of(2002, 6, 10), 13);
        departments[2] = new Professor("Okello", 3000, LocalDate.of(2016, 4,2), 4);
        departments[3] = new Professor("Otim", 3000, LocalDate.of(2016, 4,2), 2);
        departments[4] = new Professor("Stephanie", 3000, LocalDate.of(2016, 4,2), 3);
        return departments;
    }

}
