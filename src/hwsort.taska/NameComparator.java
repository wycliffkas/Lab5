package hwsort.taska;

import java.util.Comparator;

public class NameComparator implements Comparator<DeptEmployee> {
    @Override
    public int compare(DeptEmployee de1, DeptEmployee de2) {

        return de1.getName().compareTo(de2.getName());
    }
}