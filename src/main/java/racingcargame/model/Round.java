package racingcargame.model;

import java.util.List;

class Round {

    private static final int MAKE_INT = 10;

    List<Car> round(List<Car> cars) {
        cars.forEach(car -> car.move(getRandomNo()));
        return cars;
    }

    private int getRandomNo() {
        return (int) (Math.random() * MAKE_INT);
    }
}
