# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 목록

### 입력
- [x] 참여자 이름 입력받기
  - [x] 쉼표를 기준으로 구분한다
  - [x] IllegalArgumentException
    - [x] 참여자 이름은 1 ~ 5자 이하이다
    - [x] 중복은 허용하지 않는다
- [] 실행 결과를 입력받기
  - [] 쉼표를 기준으로 구분한다
  - [] IllegalArgumentException
    - [] 결과 상품은 1 ~ 5자 이하이다.
- [x] 사다리 높이 입력받기
  - [x] IllegalArgumentException
    - [x] 높이는 2 이상의 자연수이다
- [] 결과를 보고 싶은 사람 이름 입력받기
  - [] IllegalArgumentException
    - [] 현재 참여자 이름 혹은 'all'만 입력되어야 한다

### 사다리 생성하기

- [x] 발판 생성하기
  - [x] 생성된 발판 다음 칸은 비어있어야 한다.
  - [x] IllegalArgumentException
    - [x] 허용되지 않는 값이 인자로 넘어올 경우
- [x] (참여자수 - 1)의 너비만큼 사다리 한 줄 생성하기
  - [x] IllegalArgumentException
    - [x] (참여자수 - 1)과 사다리 너비가 일치해야 한다
- [x] 입력 받은 높이만큼 사다리 생성하기

### 사다리 게임 진행

- [] 플레이어를 높이 1칸만큼 이동시키기
- [] 플레이어를 사다리 높이만큼 이동시키기
- [] 최종 위치를 기반으로 이동 결과 연결하기

### 출력

- [x] 이름을 사다리의 형태에 맞게 한 줄에 출력하기
- [x] 사다리 출력하기
  - [x] 사다리 발판을 "-----"로 출력하기
- [] 참여자의 사다리 게임 실행 결과 출력하기
  - [] 한 명일 때와 'all'일 때 출력 형태가 다르다