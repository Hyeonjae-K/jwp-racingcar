# jwp-racingcar

## [1 단계]

### 기능 요구사항

- [x] 이름 목록과 경주 횟수를 json 형식으로 요청받을 수 있다.
- [x] 요청 결과를 json 형식으로 응답할 수 있다.
- [x] 자동차 경주 게임의 플레이 이력을 DB에 저장한다.

### 피드백 요구사항

- [x] 접근제어자 확인
- [x] 매직넘버 상수화
- [x] 상수명 컨벤션 확인
- [x] 입력 예외처리 기능 구현
- [x] 미사용 코드 제거
- [x] 테스트 실패 오류 수정

## [2단계]

### 기능 요구사항

- [x] 게임 플레이 이력 조회 API 구현
- [x] 기존 기능 수정 - 출력 방식 수정
- [x] 리팩터링 - 중복 코드 제거

### 피드백 요구사항

- [x] 단일 생성자의 경우 `@Autowired` 생략
- [x] `@RequestMapping`을 활용하여 코드 중복 제거
- [x] Dao의 `@Repository` 어노테이션 통일
- [x] WINNER 테이블의 플레이어 정보를 PLAYER 테이블을 참조하도록 하여 중복 제거
- [x] 우승자 업데이트 로직 리팩터링
- [x] 추가된 API 테스트 추가
