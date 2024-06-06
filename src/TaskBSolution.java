package src;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class TaskBSolution {
    public static DeptEmployee[] prepareData() {
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = new Secretary("Wycliff", 2000.00, LocalDate.of(2002, 6, 10), 10);
        department[1] = new Secretary("Stella", 4000.00, LocalDate.of(2002, 6, 10), 13);
        department[2] = new Professor("Okello", 3000, LocalDate.of(2016, 4, 2), 4);
        department[3] = new Professor("Otim", 3000, LocalDate.of(2016, 4, 2), 2);
        department[4] = new Professor("Stephanie", 3000, LocalDate.of(2016, 4, 2), 3);

        return department;
    }


    public static void main(String[] args) {

        DeptEmployee[] persons = prepareData();
        // Outside Name Comparator
        TaskBSolution sol = new TaskBSolution();
        MyComparator com = sol.getComparator();
        System.out.println("Before Sorting: " + Arrays.toString(persons));
        Arrays.sort(persons,com);
        System.out.println("After Sorting: " + Arrays.toString(persons));

    }
    // Member Inner Class to implements Comparator
    private class MyComparator implements Comparator<DeptEmployee>{
        // To sort by Last name
        @Override
        public int compare(DeptEmployee de1, DeptEmployee de2) {
            return de1.getName().compareTo(de2.getName());
        }
    }
    // Write a getter to return the object of MyComparator
    private MyComparator getComparator(){
        return new MyComparator();
    }
}
