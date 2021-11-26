package edu.ib;

public class Car implements Comparable<Car> {
    private  String make;
    private  double weight;

    public Car(String make, double weight) {
        this.make = make;
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Car o) {
       // return (int) (weight-o.weight);
       //  return Double.compare(weight,o.weight);
        return make.compareTo(o.make);
    }
}
