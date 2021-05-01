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
    
    // 우승자 비교
    public CarRecord getCarRecord() {
    	return carRecord;
    }
    
    // 기록 출력
    public String getCarRecordView() {
    	return carRecordView.toString();
    }
    
}
