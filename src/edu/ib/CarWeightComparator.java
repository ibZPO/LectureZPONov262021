package edu.ib;

import java.util.Comparator;

public class CarWeightComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getWeight(),o2.getWeight());
    }
}
