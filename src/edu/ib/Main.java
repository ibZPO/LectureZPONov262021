package edu.ib;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        String [] names={"John","Ann","Ben"};
        Arrays.sort(names);

        int [] numbers = {8,2,1};
        Arrays.sort(numbers);

        Car [] car ={new Car("Honda",1200),
                            new Car("Bentley",3000),
                            new Car("Fiat",1100)
        };

//        CarMakeComparator makeComparator= new CarMakeComparator();
//        CarWeightComparator weightComparator= new CarWeightComparator();
//        System.out.println(Arrays.toString(car));
//        Arrays.sort(car,makeComparator);
//        System.out.println(Arrays.toString(car));
//        Arrays.sort(car,weightComparator);
//        System.out.println(Arrays.toString(car));

        // klasa anonimowa
        Comparator<Car> mComparator= new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getMake().compareTo(o2.getMake());
            }
        };

//        System.out.println(Arrays.toString(car));
//        Arrays.sort(car,mComparator);
//        System.out.println(Arrays.toString(car));

//        System.out.println(Arrays.toString(car));
//        Arrays.sort(car,(Car c1, Car c2)-> c1.getMake().compareTo(c2.getMake()));
//        Arrays.sort(car,(Car c1, Car c2)-> Double.compare(c1.getWeight(),c2.getWeight()));
//        System.out.println(Arrays.toString(car));

        Runnable task1= new ThreadDemo("Thread1");
        Runnable task2= new ThreadDemo("Thread2");

/*        Thread thread1= new Thread(task1);
        Thread thread2= new Thread(task2);*/
        Thread thread1= new Thread(() -> {for (int i = 0; i<100000; i++) System.out.println("Thread 1: " + i);} );
        Thread thread2= new Thread(() -> {for (int i = 0; i<100000; i++) System.out.println("Thread 2: " + i);} );


        thread1.start();
        thread2.start();



    }
}
