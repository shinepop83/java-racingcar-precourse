package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RacingCarProcessTest {
    
    @Test
    @DisplayName("자동차 전진 테스트")
    void carAdvanceTest() {
    	RacingCarProcess status = new RacingCarProcess();
    	
    	assertThat(status.advanceOrStopDecision(7).isAdvance()).isTrue();
    }
    
    @Test
    @DisplayName("자동차 멈춤 테스트")
    void carStopTest() {
    	RacingCarProcess status = new RacingCarProcess();
    	
    	assertThat(status.advanceOrStopDecision(2).isAdvance()).isTrue();
    }
    
    @RepeatedTest(value = 10)
    @DisplayName("랜덤 숫자 유효성 반복 체크 테스트")
    void randomNumberTest() {
		assertThat(GetRandomNumber.getRandomNumber()).isBetween(0, 9);
    }
    
    @Test
    @DisplayName("자동차 전진 시 ADD 테스트")
    void carRecordAddTest() {
    	RacingCarProcess status = new RacingCarProcess();
    	Car car = new Car("RED");
    	
    	if(status.advanceOrStopDecision(2).isAdvance()) {
    		car.carAddRecord();
    	}
    	
    	if(status.advanceOrStopDecision(7).isAdvance()) {
    		car.carAddRecord();
    	}
    	
    	System.out.println(car.getCarName().getCarName() + " RECOR : " + car.getCarRecord().getMileage());
    	System.out.println(car.getCarName().getCarName() + " : " + car.getCarRecordView().toString());
    }
    
    @Test
    @DisplayName("기록 기준으로 내림차순 정렬 테스트")
    void carsSortTest() {
    	Car red = new Car("RED");
    	Car blue = new Car("BLUE");
    	Car black = new Car("BLACK");
    	
    	red.carAddRecord();
    	red.carAddRecord();
    	red.carAddRecord();
    	
    	black.carAddRecord();
    	black.carAddRecord();
    	
    	blue.carAddRecord();
    	
    	List<Car> cars1 = new ArrayList<>();
    	cars1.add(blue);
    	cars1.add(black);
    	cars1.add(red);

    	List<Car> cars = RacingCarProcess.getCarsSort(cars1);
    	
    	System.out.print("record 정렬 : ");
    	for(Car car : cars) {
    		 System.out.print(car.getCarName().getCarName() + ":" +car.getCarRecord().getMileage() + ", ");
    	}
    	
    }
    
    @Test
    @DisplayName("우승차 이름 추출 테스트")
    void test() {
    	Car red = new Car("RED");
    	Car blue = new Car("BLUE");
    	Car black = new Car("BLACK");
    	
    	red.carAddRecord();
    	red.carAddRecord();
    	red.carAddRecord();
    	
    	black.carAddRecord();
    	black.carAddRecord();
    	black.carAddRecord();
    	
    	blue.carAddRecord();
    	
    	List<Car> cars1 = new ArrayList<>();
    	cars1.add(blue);
    	cars1.add(black);
    	cars1.add(red);
    	
    	for(Car car : cars1) {
    		 System.out.print(car.getCarName().getCarName() + ":" +car.getCarRecord().getMileage() + ", ");
    	}
    	
    	System.out.println("");
    	
    	List<Car> cars = RacingCarProcess.getChampionExtraction(RacingCarProcess.getCarsSort(cars1));
    	
    	System.out.print("우승 차 : ");
    	RacingCarProcess.championRacingCarNamePrint(cars);

    }
}
