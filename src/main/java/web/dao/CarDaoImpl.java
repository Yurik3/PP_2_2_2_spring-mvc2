package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static List<Car> carList = new ArrayList<>();

    static {
        Car car1 = new Car("Opel", 2000, 200000);
        Car car2 = new Car("Honda", 2001, 300000);
        Car car3 = new Car("Renoult", 2002, 400000);
        Car car4 = new Car("LADA", 2003, 500000);
        Car car5 = new Car("Haval", 2004, 600000);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
