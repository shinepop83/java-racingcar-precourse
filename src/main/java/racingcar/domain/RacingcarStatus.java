package racingcar.domain;

public enum RacingcarStatus {
	
	ADVANCE, STOP;

	public boolean isAdvance() {
		return this == ADVANCE;
	}

	public boolean isStop() {
		return this == STOP;
	}
}
