package racingcar.domain;

public class RacingCarProcess {
	private static final int STANDARD_NUM = 3;
	
	// ADVANCE
	public boolean advanceDecision(int ranNum) {
		return ranNum > STANDARD_NUM;
	}
	
	// STOP
	public boolean stopDecision(int ranNum) {
		return ranNum <= STANDARD_NUM;
	}
}
