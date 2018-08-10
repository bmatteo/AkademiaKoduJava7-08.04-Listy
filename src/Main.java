import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new LinkedList<>();

        method1(list);

        System.out.println(list.size());

        Car c = new Car();
        c.brand = "Honda";

        Car c2 = new Car();
        c2.brand = "Mercedes";

        Car c3 = new Car();
        c3.brand = "BMW";

        Car c4 = new Car();
        c4.brand = "Skoda";

        list.add(c);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        System.out.println(list.size());

        Car gettedC = list.get(0);
        System.out.println(gettedC.brand);

        //list.get(0).brand = null;

        System.out.println(list.get(0).brand);

        //list.remove(c);

        System.out.println(list.size());

        Iterator i = list.listIterator();

        while (i.hasNext()) {
            Car tempCar = (Car) i.next();
            if(tempCar.brand.equals("Honda")) {
                tempCar.brand = "Toyota";
            }
            System.out.println(tempCar.brand);
        }

        Object tab[];

        tab = list.toArray();
    }

    public static int method1(List a) {
        return 0;
    }
}
