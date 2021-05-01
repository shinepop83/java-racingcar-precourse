package racingcar.domain;

public class CarRecord {
	private int record;

	public int getMileage() {
		return record;
	}

	public void addMileage(int record) {
		this.record += record;
	}
}
