package racingcar.domain;

public class CarName {
	
	private String carName;
	private static final int NAME_MAX_LENGTH = 5;

	public CarName(String carName) {
		checkNameValue(carName);
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	private void checkNameValue(String carName) {

		if (carName == null || carName.isEmpty() || carName.length() > NAME_MAX_LENGTH) {
			throw new IllegalArgumentException("자동차 이름의 길이는 1자 이상, 5자 보다 작아야 합니다.");
		}
	}
}
