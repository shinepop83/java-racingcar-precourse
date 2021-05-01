# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


-------- to do list
룰_1. 주어진 횟수
	숫자 입력 테스트	
		숫자 여부 확인 (1 이상의 숫자 보장, 실패 테스트 제거)
		N번 수행을 하는지 확인
룰_2. N대의 자동차	
	자동차 이름은 쉼표 기준으로 구분 테스트
		split 했을 때 잘 분리되는지 확인
		한대 입력, split 했을 때 잘 분리되는지 확인
	자동차 이름 길이 테스트 : null 및 빈칸 보장
		자동차 명 길이 6 확인 -> ('abcdef')
	 	자동차 명 길이 > 1 && 자동차 명 길이 =< 5 확인 -> ('abcde')
룰_3. 전진	
	Random	테스트 : 0 ~ 9 숫자 보장
		임임의 값 -1 로 확인
		임임의 값 10 로 확인
		임임의 값 5로 확인
	4~9 전진
		임임의 값 7로 테스트
		임임의 값 3로 테스트
룰_4. 멈춤
	Random 테스트 : 0 ~ 9 슷자 보장
	0~3 멈춤	
		임임의 값 3로 테스트
		임임의 값 8로 테스트
룰_5. 각 자동차에 이름을 부여
	객체 생성 테스트
		차 이름 빈값 적용 (이름에 null 및 빈칸 보장, 실패 테스트 제거)
		차 이름 객체 생성
룰_6. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력	
룰_7. 완료 한 후 우승했는지 알려준다.
	우승자는 한 명 이상일 수 있다
		N 대 우승자
		한 대 우승
		
-------------------

- feat: 시도 횟수 숫자 여부 확인 및 자동차 이름 분리 및 길이, 실패하는 테스트, 테스트, 리팩토링

룰_1. 주어진 횟수
	숫자 입력 테스트	
		숫자 여부 확인
		
룰_2. N대의 자동차
	자동차 이름 빈값 테스트
		자동차 이름 빈 값 -> ("")
	자동차 이름은 쉼표 기준으로 구분 테스트
		split 했을 때 잘 분리되는지 확인
		한대 입력, split 했을 때 잘 분리되는지 확인
	자동차 이름은 5자 이하	테스트
		자동차 명 길이 6 확인 -> ("abcdef")
		자동차 명 길이 > 1 && 자동차 명 길이 < 6 확인 -> (abcde")	

-------------------

- feat : 전진, 멈춤, 자동차 객체에 이름 부여 실패하는 테스트, 테스트

룰_3. 전진	
	Random	테스트 : 0 ~ 9 숫자 보장
		임임의 값 -1 로 확인
		임임의 값 10 로 확인
		임임의 값 5로 확인
	4~9 전진
		임임의 값 7로 테스트
		임임의 값 3로 테스트
룰_4. 멈춤
	Random 테스트 : 0 ~ 9 슷자 보장
	0~3 멈춤	
		임임의 값 3로 테스트
		임임의 값 8로 테스트
룰_5. 각 자동차에 이름을 부여
	객체 생성 테스트 : 이름에 null 및 빈칸 보장
		차 이름 객체 생성

-------------------

- feat : 주어진 횟수 1 이상의 숫자 보장, 차 이름 null 및 빈칸 보장, N개의 자동차 이름 부여 및 출력 테스트

룰_6. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력
