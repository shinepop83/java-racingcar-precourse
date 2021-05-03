package racingcar.domain;

import java.util.Random;

public class GetRandomNumber {
	private static Random random = new Random();
	
	public static int getRandomNumber() {
		return random.nextInt(10);
	}
}
