package OOP.SemDZ.homeWork.comparator;

import java.util.Comparator;

import OOP.SemDZ.homeWork.human.Human;

public class HumanComparatorByName<T extends Human> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
