package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class RacingCarProcessTest {
    
    @Test
    @DisplayName("자동차 전진 테스트")
    void carAdvanceTest() {
    	RacingCarProcess status = new RacingCarProcess();
    	
    	assertThat(status.advanceDecision(7)).isTrue();
    }
    
    @Test
    @DisplayName("자동차 멈춤 테스트")
    void carStopTest() {
    	RacingCarProcess status = new RacingCarProcess();
    	
    	assertThat(status.stopDecision(2)).isTrue();
    }
    
    @RepeatedTest(value = 10)
    @DisplayName("랜덤 숫자 유효성 반복 체크 테스트")
    void randomNumberTest() {
        assertThat(GetRandomNumber.getRandomNumber()).isBetween(0, 9);
    }
    
    @DisplayName("자동차 이름 부여 생성 테스트")
    void carWithNameSucessTest() {
        Car car = new Car("BLACK");
        assertThat(car.getCarName().getCarName()).isEqualTo("BLACK");
    }
}
