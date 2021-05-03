package racingcar.domain;

public class Car {
	private CarName carName;
	private CarRecord carRecord;
	private StringBuilder carRecordView;

	public Car() {
		this.carRecord = new CarRecord();
		this.carRecordView = new StringBuilder();
	}

	public Car(String carName) {
		this();
		this.carName = new CarName(carName);
	}

	public CarName getCarName() {
		return carName;
	}

	public CarRecord getCarRecord() {
		return carRecord;
	}

	public String getCarRecordView() {
		return carRecordView.toString();
	}

	public void carAddRecord() {
		this.carRecord.addMileage();
		carRecordView.append("-");
	}
}
