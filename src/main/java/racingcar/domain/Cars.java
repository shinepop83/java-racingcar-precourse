package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public final class Cars {
	private List<Car> cars = new ArrayList<>();
	
    public Cars(String... carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }
    
    public List<Car> getCars() {
        return cars;
    }
}
