package racingcar.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSetProcess {

	private InputInfo inputInfo;

	public InputSetProcess() {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("경주 할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
			String carsName = scanner.nextLine();

			System.out.println("시도할 횟수는 몇 회 인가요?");
			inputInfo = new InputInfo(scanner.nextInt());

			inputInfo.setCarNames(carsName);
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
			throw e;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

	public InputSetProcess(String carsName, int count) {

		try {
			inputInfo = new InputInfo(count);

			inputInfo.setCarNames(carsName);
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
			throw e;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

	public InputInfo getInputInfo() {
		return this.inputInfo;
	}
}
