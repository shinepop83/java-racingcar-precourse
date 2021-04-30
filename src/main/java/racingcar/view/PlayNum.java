package racingcar.view;

public class PlayNum {
	public static final int MIN_NO = 1;
	
	private int num;

	public PlayNum(int num) {
		if(num < MIN_NO ) {
			throw new IllegalArgumentException("시도할 회수는 0보다 큰 정수를 입력해야 합니다.");
		}
		
		this.num = num;
	}
}
