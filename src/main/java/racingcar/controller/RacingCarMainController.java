package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.RacingCarProcess;
import racingcar.view.InputInfo;
import racingcar.view.InputSetProcess;

public class RacingCarMainController {
	
	public static void play() {
		InputSetProcess inputSet = new InputSetProcess();
		System.out.println("");
		
		play(inputSet);
	}
	
	public static void play(String carsName, int count) {
		InputSetProcess inputSet = new InputSetProcess(carsName, count);
		
		System.out.println("경주 할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		System.out.println(carsName);
        System.out.println("시도할 횟수는 몇 회 인가요?");
        System.out.println(count);
        System.out.println("");
        
		play(inputSet);
	}
	
	public static void play(InputSetProcess inputSet) {
		InputInfo inputInfo = inputSet.getInputInfo();
		Cars cars = new Cars(inputInfo.getCarNames());
		
		// 시도 할 회수 만큼 수행
		RacingCarProcess.quarterPlay(cars, inputInfo.getRoundCount().getNum());
		
		// 최종 우승 자동차 조회
		RacingCarProcess.getChampionRacingCar(cars);
	}

	public static void main(String[] args) {
		play();
	}
}
