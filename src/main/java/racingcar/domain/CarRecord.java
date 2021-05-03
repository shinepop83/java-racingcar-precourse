package racingcar.domain;

public class CarRecord {
	
	private static final int ADD_RECORD_VALUE = 1;
	private int record = 0;

	public int getMileage() {
		return record;
	}

	public void addMileage() {
		this.record += ADD_RECORD_VALUE;
	}
}
