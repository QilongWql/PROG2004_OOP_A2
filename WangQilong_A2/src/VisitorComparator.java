import java.util.*;

class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        String firstNameChar1 = Character.toString(v1.getName().charAt(0)).toLowerCase();
        String firstNameChar2 = Character.toString(v2.getName().charAt(0)).toLowerCase();
        int nameComparison = firstNameChar1.compareTo(firstNameChar2);

        if (nameComparison == 0) {
            return Integer.compare(v1.getAge(), v2.getAge());
        }

        return nameComparison;
    }
}