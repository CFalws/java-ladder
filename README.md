# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 목록

### 입력
-[] 참여자 이름 입력받기
  -[] IllegalArgumentException
    -[] 참여자 이름은 1 ~ 5자 이하이다. 
    -[] 중복은 허용하지 않는다. 
- 사다리 높이 입력받기

### 핵심 로직

#### 사다리 생성하기
- [] 가로선 랜덤으로 생성하기
  - [] 가로선 연속 라인 체크
  - [] 가로선들의 길이가 참여자수 - 1과 일치하는지 확인하기
  - [] 세로선에 최소 한 개 이상의 가로선이 존재하는지 확인하기

### 출력
- [] 실행 결과 출력하기
- [] 이름을 정책에 맞게 한 줄에 출력하기
- [] 라인순서대로 가로선(-----) 출력하기