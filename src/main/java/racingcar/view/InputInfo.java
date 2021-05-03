package racingcar.view;

public class InputInfo {
	private final PlayNum roundCount;
	private String[] carNames;
	private int carCount;

	public InputInfo(int num) {
		this.roundCount = new PlayNum(num);
	}

	public PlayNum getRoundCount() {
		return roundCount;
	}

	public String[] getCarNames() {
		return carNames;
	}

	public void setCarNames(String carNames) {
		if (carNames.isEmpty()) {
			throw new IllegalArgumentException("빈값을 등록 할 수 없습니다");
		}
		this.carNames = carNames.split(",");
		this.carCount = this.carNames.length;
	}

	public int getCarCount() {
		return carCount;
	}

}
