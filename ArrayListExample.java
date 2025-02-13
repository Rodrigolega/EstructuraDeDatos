import java.util.ArrayList;

public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<String>();
    
    public void addCars(String car){
        cars.add(car);
        System.out.println(cars.size());
    }

    public int returnSize(){
        return cars.size();

    }

    public void removeCar(){
        cars.clear();
    }
}
