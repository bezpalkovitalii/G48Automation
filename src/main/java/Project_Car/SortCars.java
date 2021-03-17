package Project_Car;

import java.util.Collections;
import java.util.List;

public class SortCars extends Transport {

    private String CarName;
    private int CarNumber;

    public void sortList(List<String> list) {
        log.debug("Sort cars:");
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            log.debug(list.get(i));
        }


    }

    public SortCars() {

    }

    public SortCars(String name, int number) {
        //super(name);
        this.CarName = name;
        this.CarNumber = number;
    }

}


