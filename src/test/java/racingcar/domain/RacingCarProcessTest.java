package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import racingcar.view.InputInfo;

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
    
}
