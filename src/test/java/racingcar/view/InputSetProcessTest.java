package racingcar.view;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.GetRandomNumber;

class InputSetProcessTest {

	@Test
	@DisplayName("플레이 횟수 입력 성공 테스트")
	void setCountSucessTest() {

		InputInfo inputInfo = new InputInfo(1);

	}

	@Test
	@DisplayName("주어진 횟수 수행 테스트")
	void racingCarQuarterPlay() {
		InputInfo inputInfo = new InputInfo(5);

		for (int i = 0; i < inputInfo.getRoundCount().getNum(); i++) {
			System.out.println((i + 1) + "회 : " + GetRandomNumber.getRandomNumber());
		}
	}

	@Test
	@DisplayName("자동차 이름 입력 값과 반환 값이 맞는지 실패 테스트")
	void setNamesReturnFailTest() {

		InputInfo inputInfo = new InputInfo(1);

		inputInfo.setCarNames("RED,BLUE,BLACK");

		assertThat(inputInfo.getCarNames().length).isEqualTo(3);
		assertThat(inputInfo.getCarNames()).containsExactly("RED", "BLACK", "BLUE");
	}

	@Test
	@DisplayName("자동차 이름 입력 값과 반환 값이 맞는지 성공 테스트")
	void setNamesReturnSucessTest() {

		InputInfo inputInfo = new InputInfo(1);

		inputInfo.setCarNames("RED,BLUE,BLACK");

		assertThat(inputInfo.getCarNames().length).isEqualTo(3);
		assertThat(inputInfo.getCarNames()).containsExactly("RED", "BLUE", "BLACK");
	}

	@Test
	@DisplayName("한 대 이름 입력 후 split 했을 때 잘 분리되는지 확인")
	void setOneCarNameTest() {

		InputInfo inputInfo = new InputInfo(1);

		inputInfo.setCarNames("RED,");

		assertThat(inputInfo.getCarNames().length).isEqualTo(1);
		assertThat(inputInfo.getCarNames()).containsExactly("RED");

		inputInfo.setCarNames("BLACK");

		assertThat(inputInfo.getCarNames().length).isEqualTo(1);
		assertThat(inputInfo.getCarNames()).containsExactly("BLACK");
	}

	@Test
	@DisplayName("자동차 이름 길이 실패 확인")
	void carNameLengthFailTest() {
		InputInfo inputInfo = new InputInfo(1);

		inputInfo.setCarNames("RED,YELLOW,BLACK");

		assertThatIllegalArgumentException()
			.isThrownBy(() -> new Car(inputInfo.getCarNames()[1]))
			.withMessageMatching("자동차 이름의 길이는 0보다 크고 5보다 작아야 합니다.");
	}

	@Test
	@DisplayName("자동차 이름 길이 성공 확인")
	void carNameLengthSucessTest() {
		InputInfo inputInfo = new InputInfo(1);

		inputInfo.setCarNames("RED,BLUE,BLACK");

		assertThatIllegalArgumentException()
			.isThrownBy(() -> new Car(inputInfo.getCarNames()[1]))
			.withMessageMatching("자동차 이름의 길이는 0보다 크고 5보다 작아야 합니다.");
	}

	@DisplayName("자동차 이름 부여 생성 테스트")
	void carWithNameSucessTest() {
		Car car = new Car("BLACK");
		assertThat(car.getCarName().getCarName()).isEqualTo("BLACK");
	}

	@Test
	@DisplayName("N개의 자동차 이름 부여 테스트")
	void carNameGrantTest() {
		InputInfo inputInfo = new InputInfo(1);
		inputInfo.setCarNames("RED,BLUE,BLACK");

		Cars cars = new Cars(inputInfo.getCarNames());

		for (Car forCar : cars.getCars()) {
			System.out.println(forCar.getCarName().getCarName() + ":");
		}
	}
}
