package hwsort.taskc;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();


        class SalaryComparator implements Comparator<DeptEmployee> {
            @Override
            public int compare(DeptEmployee e1, DeptEmployee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        }

        Arrays.sort(data, new SalaryComparator());

        for (DeptEmployee e : data) {
            System.out.println(e);
        }
    }
}