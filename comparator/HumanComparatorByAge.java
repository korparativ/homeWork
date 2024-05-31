package OOP.SemDZ.homeWork.comparator;

import java.util.Comparator;

import OOP.SemDZ.homeWork.human.Human;

public class HumanComparatorByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }    
}
