package racingcar.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarProcess {
	private static final int STANDARD_NUM = 3;
	
	// ADVANCE or STOP
	public static RacingcarStatus advanceOrStopDecision(int ranNum) {
		return getRacingCarStatus(ranNum > STANDARD_NUM);
	}
	
	public static RacingcarStatus getRacingCarStatus(boolean decision) {
		if(decision) {
			return RacingcarStatus.ADVANCE;
		}
		return RacingcarStatus.STOP;
	}
	
	// 기록 기준으로 내림차순 정렬
	public static List<Car> getCarsSort(List<Car> cars){
		return cars.stream()
    				.sorted(Comparator.comparing((Car car) -> car.getCarRecord().getMileage()).reversed()).collect(Collectors.toList());
	}
	
	// 우승차 추출
	public static List<Car> getChampionExtraction(List<Car> cars){
		return cars.stream()
					.filter(t->t.getCarRecord().getMileage()==cars.get(0).getCarRecord().getMileage()).collect(Collectors.toList());
	}
	
	// 우승차 이름 출력
	public static void championRacingCarNamePrint(List<Car> cars) {
		System.out.println(cars.stream()
								.map(s->s.getCarName().getCarName()).collect(Collectors.joining(", "))
		);
	}
}
