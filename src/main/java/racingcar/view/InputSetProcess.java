package racingcar.view;

public class InputSetProcess {
	// 입력 로직
	public static final int MIN_LENGTH = 1;
	public static final int MAX_LENGTH = 5;
	
	// 자동차 명 길이 체크
	public static boolean carNameLengthCheck(String carName) {
		return carName.length() >= MIN_LENGTH && carName.length() <= MAX_LENGTH;
	}
}
