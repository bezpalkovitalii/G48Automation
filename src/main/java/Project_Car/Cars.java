package Project_Car;

import java.util.ArrayList;
import java.util.List;

public class Cars extends Transport {

    private String CarName;
    private int CarNumber;

    public String[] carsArray = new String[]{"Mercedes-Benz", "BMW", "Audi", "Honda", "Toyota", "Volkswagen", "Skoda", "Opel"};

    public List<String> carsList = new ArrayList<>();


    public List<String> move() {
        int i = 0;
        while (i < 4) {
            carsList.add(carsArray[i]);
            i++;
        }
        return carsList;
    }

    public Cars() {
        log.info("Новый пустой экземпляр класса Cars");
    }

    public Cars(String name, int number) {
        super(name);
        this.CarName = name;
        this.CarNumber = number;
    }


}
