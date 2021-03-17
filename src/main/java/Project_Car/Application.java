package Project_Car;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Cars cars = new Cars("Mercedes-Benz", 1);
        cars.displaysName();
        cars.move();
        cars.wordList(null);
        SortCars sortCars = new SortCars("BMW", 2);
        sortCars.wordList(cars.carsList);
        sortCars.wordList(new ArrayList<>());  // не уверен что правильно "3 - добавить вызов из экземпляра класса Б, передать массив new ArrayList<Stirng>"


    }

}


