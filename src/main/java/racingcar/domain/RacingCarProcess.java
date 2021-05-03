package racingcar.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarProcess {
	
	private static final int STANDARD_NUM = 3;

	// 시도 할 회수 만큼 수행
	public static void quarterPlay(Cars cars, int cnt) {
		for (int i = 0; i < cnt; i++) {
			quarter(cars);
			System.out.println("");
		}
	}

	// 횟수 별 수행
	public static void quarter(Cars cars) {
		for (Car car : cars.getCars()) {
			advance(car);

			System.out.print(car.getCarName().getCarName() + " : ");
			System.out.println(car.getCarRecordView());
		}
	}

	// 전진 시 처리
	public static void advance(Car car) {
		if (advanceOrStopDecision(GetRandomNumber.getRandomNumber()).isAdvance()) {
			car.carAddRecord();
		}
	}

	// 전진 or 멈춤
	public static RacingcarStatus advanceOrStopDecision(int ranNum) {
		return getRacingCarStatus(ranNum > STANDARD_NUM);
	}

	public static RacingcarStatus getRacingCarStatus(boolean decision) {
		if (decision) {
			return RacingcarStatus.ADVANCE;
		}
		return RacingcarStatus.STOP;
	}

	// 기록 기준으로 내림차순 정렬
	public static List<Car> getCarsSort(List<Car> cars) {
		return cars.stream()
			.sorted(Comparator.comparing((Car car) -> car.getCarRecord().getMileage()).reversed())
			.collect(Collectors.toList());
	}

	// 우승 차 추출
	public static List<Car> getChampionExtraction(List<Car> cars) {
		return cars.stream()
			.filter(t -> t.getCarRecord().getMileage() == cars.get(0).getCarRecord().getMileage())
			.collect(Collectors.toList());
	}

	// 우승 차 이름 출력
	public static void championRacingCarNamePrint(List<Car> cars) {
		System.out.print(cars.stream()
			.map(s -> s.getCarName().getCarName()).collect(Collectors.joining(", ")));
		System.out.println("가 최종 우승했습니다.");
	}

	// 최종 우승 자동차 조회
	public static void getChampionRacingCar(Cars cars) {
		championRacingCarNamePrint(getChampionExtraction(getCarsSort(cars.getCars())));
	}
}
