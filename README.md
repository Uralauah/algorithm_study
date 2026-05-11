# 코딩테스트 스터디 커리큘럼

## 진행 방식
- 매주 4문제 풀이
- 같은 주차 안에서 쉬운 문제부터 도전 문제까지 골고루 구성
- 각 Cycle 마지막 주차는 모의 코테 형태로 진행
- 최대한 직접 생각해서 풀어보기
- 예전에 풀어봤던 문제라도 다시 풀어보기
- 공식문서 참조 가능: [OpenJDK 11 공식문서](https://devdocs.programmers.co.kr/openjdk~11/)

## 브랜치 규칙
- 기본 브랜치(`main` 또는 `master`)에서 각 주차에 해당하는 브랜치를 생성하여 작업합니다.
- **브랜치 명명 규칙**: `week[주차]/[이름 또는 깃허브 ID]`
  - 예시: `week04/hong-gildong`
  - 예시: `week12/algoking`
- 해당 주차의 문제 풀이가 완료되면 기본 브랜치로 **Pull Request**를 생성합니다.

## 디렉토리 구조 및 파일 명명 규칙
- 주차별 폴더 안에 자신의 이름(또는 깃허브 ID) 폴더를 생성하여 코드를 업로드합니다.
- `week04/홍길동/BOJ_2164_카드2.java`
- `week04/홍길동/PRG_기능개발.java`

## 태그 규칙
커밋 메시지의 태그는 아래 규칙에 따라 사용합니다.
- `[FEAT]` : 새로운 문제 풀이 추가
- `[FIX]` : 오답 수정, 예외 처리, 시간초과/메모리초과 해결
- `[REFACTOR]` : 정답 로직은 유지하면서 코드 구조나 가독성을 개선한 경우
- `[DOCS]` : README, 주석, 문서 등 설명용 내용 수정
- `[CHORE]` : 디렉토리 구조 변경, 파일 이동/이름 변경, 기타 설정 작업

## 커밋 메시지 컨벤션
- `[태그] week[주차]/플랫폼/문제번호/문제명` 형식으로 작성합니다.
- 예시: `[FEAT] week04/BOJ/2164/카드2`
- 예시: `[FIX] week05/PRG/기능개발 시간초과 해결`

## PR (Pull Request) 규칙
- 매주 정해진 시간(금요일 00:00) 전까지 PR을 올립니다.
- PR 제목: `[week04] 홍길동 알고리즘 과제 제출`

---

# Cycle 1: 자료구조 기초

## Week 1 — 문자열 기초 1 / 순회 / 빈도 / 조건 처리
- [프로그래머스 문자열 내 p와 y의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/12916)
- [프로그래머스 이상한 문자 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12930)
- [프로그래머스 가장 가까운 같은 글자](https://school.programmers.co.kr/learn/courses/30/lessons/142086)
- [프로그래머스 문자열 나누기](https://school.programmers.co.kr/learn/courses/30/lessons/140108)

---

## Week 2 — 정렬 + 해시 기초 / 맵 / 셋 사용
- [프로그래머스 폰켓몬](https://school.programmers.co.kr/learn/courses/30/lessons/1845)
- [프로그래머스 완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/42576)
- [프로그래머스 전화번호 목록](https://school.programmers.co.kr/learn/courses/30/lessons/42577)
- [프로그래머스 의상](https://school.programmers.co.kr/learn/courses/30/lessons/42578)

---

## Week 3 — 스택 기초 / 괄호 / 상태 관리
- [프로그래머스 올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12909)
- [프로그래머스 짝지어 제거하기](https://school.programmers.co.kr/learn/courses/30/lessons/12973)
- [프로그래머스 괄호 회전하기](https://school.programmers.co.kr/learn/courses/30/lessons/76502)
- [프로그래머스 주식가격](https://school.programmers.co.kr/learn/courses/30/lessons/42584)

---

## Week 4 — 큐 / 덱 / 시뮬레이션
- [프로그래머스 기능개발](https://school.programmers.co.kr/learn/courses/30/lessons/42586)
- [프로그래머스 프로세스](https://school.programmers.co.kr/learn/courses/30/lessons/42587)
- [프로그래머스 다리를 지나는 트럭](https://school.programmers.co.kr/learn/courses/30/lessons/42583)
- [프로그래머스 캐시](https://school.programmers.co.kr/learn/courses/30/lessons/17680)

---

## Week 5 — 1차 모의 코테
- [프로그래머스 과제 진행하기](https://school.programmers.co.kr/learn/courses/30/lessons/176962)
- [프로그래머스 프렌즈4블록](https://school.programmers.co.kr/learn/courses/30/lessons/17679)
- [프로그래머스 주차 요금 계산](https://school.programmers.co.kr/learn/courses/30/lessons/92341)
- [프로그래머스 [3차] 압축](https://school.programmers.co.kr/learn/courses/30/lessons/17684)

---

# Cycle 2: 탐색 & 완전탐색

## Week 6 — 백트래킹
- [프로그래머스 타겟 넘버](https://school.programmers.co.kr/learn/courses/30/lessons/43165)
- [프로그래머스 피로도](https://school.programmers.co.kr/learn/courses/30/lessons/87946)
- [프로그래머스 모음 사전](https://school.programmers.co.kr/learn/courses/30/lessons/84512)
- [프로그래머스 불량 사용자](https://school.programmers.co.kr/learn/courses/30/lessons/64064)

---

## Week 7 — 완전탐색
- [프로그래머스 최소직사각형](https://school.programmers.co.kr/learn/courses/30/lessons/86491)
- [프로그래머스 모의고사](https://school.programmers.co.kr/learn/courses/30/lessons/42840)
- [프로그래머스 카펫](https://school.programmers.co.kr/learn/courses/30/lessons/42842)
- [프로그래머스 소수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/42839)

---

## Week 8 — DFS / BFS (영역 탐색)
- [프로그래머스 네트워크](https://school.programmers.co.kr/learn/courses/30/lessons/43162)
- [프로그래머스 전력망을 둘로 나누기](https://school.programmers.co.kr/learn/courses/30/lessons/86971)
- [프로그래머스 무인도 여행](https://school.programmers.co.kr/learn/courses/30/lessons/154540)
- [프로그래머스 여행경로](https://school.programmers.co.kr/learn/courses/30/lessons/43164)

---

## Week 9 — BFS 최단거리
- [프로그래머스 게임 맵 최단거리](https://school.programmers.co.kr/learn/courses/30/lessons/1844)
- [프로그래머스 단어 변환](https://school.programmers.co.kr/learn/courses/30/lessons/43163)
- [프로그래머스 미로 탈출](https://school.programmers.co.kr/learn/courses/30/lessons/159993)
- [프로그래머스 아이템 줍기](https://school.programmers.co.kr/learn/courses/30/lessons/87694)

---

## Week 10 — 2차 모의 코테
- [프로그래머스 k진수에서 소수 개수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/92335)
- [프로그래머스 이모티콘 할인행사](https://school.programmers.co.kr/learn/courses/30/lessons/150368)
- [프로그래머스 거리두기 확인하기](https://school.programmers.co.kr/learn/courses/30/lessons/81302)
- [프로그래머스 양궁대회](https://school.programmers.co.kr/learn/courses/30/lessons/92342)

---

# Cycle 3: 효율성

## Week 11 — 이분탐색 / 파라메트릭 서치
- [프로그래머스 입국심사](https://school.programmers.co.kr/learn/courses/30/lessons/43238)
- [프로그래머스 징검다리](https://school.programmers.co.kr/learn/courses/30/lessons/43236)
- [프로그래머스 순위 검색](https://school.programmers.co.kr/learn/courses/30/lessons/72412)
- [프로그래머스 금과 은 운반하기](https://school.programmers.co.kr/learn/courses/30/lessons/86053)

---

## Week 12 — 투포인터 / 슬라이딩 윈도우
- [프로그래머스 숫자의 표현](https://school.programmers.co.kr/learn/courses/30/lessons/12924)
- [프로그래머스 연속된 부분 수열의 합](https://school.programmers.co.kr/learn/courses/30/lessons/178870)
- [프로그래머스 할인 행사](https://school.programmers.co.kr/learn/courses/30/lessons/131127)
- [프로그래머스 보석 쇼핑](https://school.programmers.co.kr/learn/courses/30/lessons/67258)

---

## Week 13 — 그리디 + 힙
- [프로그래머스 체육복](https://school.programmers.co.kr/learn/courses/30/lessons/42862)
- [프로그래머스 큰 수 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/42883)
- [프로그래머스 더 맵게](https://school.programmers.co.kr/learn/courses/30/lessons/42626)
- [프로그래머스 이중우선순위큐](https://school.programmers.co.kr/learn/courses/30/lessons/42628)

---

## Week 14 — 누적합 / 구간 처리 / 스위핑
- [프로그래머스 연속 부분 수열 합의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/131701)
- [프로그래머스 광고 삽입](https://school.programmers.co.kr/learn/courses/30/lessons/72414)
- [프로그래머스 파괴되지 않은 건물](https://school.programmers.co.kr/learn/courses/30/lessons/92344)
- [프로그래머스 [1차] 추석 트래픽](https://school.programmers.co.kr/learn/courses/30/lessons/17676)

---

## Week 15 — 3차 모의 코테
- [프로그래머스 호텔 대실](https://school.programmers.co.kr/learn/courses/30/lessons/155651)
- [프로그래머스 디스크 컨트롤러](https://school.programmers.co.kr/learn/courses/30/lessons/42627)
- [프로그래머스 두 큐 합 같게 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/118667)
- [프로그래머스 기지국 설치](https://school.programmers.co.kr/learn/courses/30/lessons/12979)

---

# Cycle 4: 심화

## Week 16 — DP
- [프로그래머스 정수 삼각형](https://school.programmers.co.kr/learn/courses/30/lessons/43105)
- [프로그래머스 등굣길](https://school.programmers.co.kr/learn/courses/30/lessons/42898)
- [프로그래머스 도둑질](https://school.programmers.co.kr/learn/courses/30/lessons/42897)
- [프로그래머스 N으로 표현](https://school.programmers.co.kr/learn/courses/30/lessons/42895)

---

## Week 17 — 다익스트라 / 최단경로 심화
- [프로그래머스 배달](https://school.programmers.co.kr/learn/courses/30/lessons/12978)
- [프로그래머스 합승 택시 요금](https://school.programmers.co.kr/learn/courses/30/lessons/72413)
- [프로그래머스 등산코스 정하기](https://school.programmers.co.kr/learn/courses/30/lessons/118669)
- [프로그래머스 가장 먼 노드](https://school.programmers.co.kr/learn/courses/30/lessons/49189)

---

## Week 18 — 트리 / 유니온파인드
- [프로그래머스 길 찾기 게임](https://school.programmers.co.kr/learn/courses/30/lessons/42892)
- [프로그래머스 섬 연결하기](https://school.programmers.co.kr/learn/courses/30/lessons/42861)
- [프로그래머스 호텔 방 배정](https://school.programmers.co.kr/learn/courses/30/lessons/64063)
- [프로그래머스 표현 가능한 이진트리](https://school.programmers.co.kr/learn/courses/30/lessons/150367)

---

## Week 19 — 복합 유형 (구현 + 탐색)
- [프로그래머스 기둥과 보 설치](https://school.programmers.co.kr/learn/courses/30/lessons/60061)
- [프로그래머스 블록 이동하기](https://school.programmers.co.kr/learn/courses/30/lessons/60063)
- [프로그래머스 표 병합](https://school.programmers.co.kr/learn/courses/30/lessons/150366)
- [프로그래머스 경주로 건설](https://school.programmers.co.kr/learn/courses/30/lessons/67259)

---

## Week 20 — 4차 모의 코테
- [프로그래머스 메뉴 리뉴얼](https://school.programmers.co.kr/learn/courses/30/lessons/72411)
- [프로그래머스 양과 늑대](https://school.programmers.co.kr/learn/courses/30/lessons/92343)
- [프로그래머스 자물쇠와 열쇠](https://school.programmers.co.kr/learn/courses/30/lessons/60059)
- [프로그래머스 코딩 테스트 공부](https://school.programmers.co.kr/learn/courses/30/lessons/118668)

---