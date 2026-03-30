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
- [백준 1157 단어 공부](https://www.acmicpc.net/problem/1157)
- [백준 2941 크로아티아 알파벳](https://www.acmicpc.net/problem/2941)
- [백준 1316 그룹 단어 체커](https://www.acmicpc.net/problem/1316)
- [백준 9996 한국이 그리울 땐 서버에 접속하지](https://www.acmicpc.net/problem/9996)

---

## Week 2 — 정렬 + 해시 기초 / 맵 / 셋 사용
- [백준 7785 회사에 있는 사람](https://www.acmicpc.net/problem/7785)
- [백준 1302 베스트셀러](https://www.acmicpc.net/problem/1302)
- [백준 1764 듣보잡](https://www.acmicpc.net/problem/1764)
- [백준 1620 나는야 포켓몬 마스터 이다솜](https://www.acmicpc.net/problem/1620)

---

## Week 3 — 스택 기초 / 괄호 / 상태 관리
- [백준 9012 괄호](https://www.acmicpc.net/problem/9012)
- [백준 4949 균형잡힌 세상](https://www.acmicpc.net/problem/4949)
- [백준 5397 키로거](https://www.acmicpc.net/problem/5397)
- [백준 1406 에디터](https://www.acmicpc.net/problem/1406)

---

## Week 4 — 큐 / 덱 / 시뮬레이션
- [백준 2164 카드2](https://www.acmicpc.net/problem/2164)
- [백준 1158 요세푸스 문제](https://www.acmicpc.net/problem/1158)
- [백준 1966 프린터 큐](https://www.acmicpc.net/problem/1966)
- [백준 5430 AC](https://www.acmicpc.net/problem/5430)

---

## Week 5 — 1차 모의 코테
- [백준 10816 숫자 카드 2](https://www.acmicpc.net/problem/10816)
- [프로그래머스 기능개발](https://school.programmers.co.kr/learn/courses/30/lessons/42586)
- [백준 1021 회전하는 큐](https://www.acmicpc.net/problem/1021)
- [백준 2493 탑](https://www.acmicpc.net/problem/2493)

---

# Cycle 2: 탐색 & 완전탐색

## Week 6 — 백트래킹
- [백준 15649 N과 M (1)](https://www.acmicpc.net/problem/15649)
- [백준 15650 N과 M (2)](https://www.acmicpc.net/problem/15650)
- [프로그래머스 피로도](https://school.programmers.co.kr/learn/courses/30/lessons/87946)
- [백준 14889 스타트와 링크](https://www.acmicpc.net/problem/14889)

---

## Week 7 — 완전탐색
- [백준 2798 블랙잭](https://www.acmicpc.net/problem/2798)
- [백준 2231 분해합](https://www.acmicpc.net/problem/2231)
- [프로그래머스 카펫](https://school.programmers.co.kr/learn/courses/30/lessons/42842)
- [백준 14500 테트로미노](https://www.acmicpc.net/problem/14500)

---

## Week 8 — DFS / BFS (영역 탐색)
- [백준 1012 유기농 배추](https://www.acmicpc.net/problem/1012)
- [백준 11724 연결 요소의 개수](https://www.acmicpc.net/problem/11724)
- [백준 2583 영역 구하기](https://www.acmicpc.net/problem/2583)
- [백준 7569 토마토](https://www.acmicpc.net/problem/7569)

---

## Week 9 — BFS 최단거리
- [백준 2178 미로 탐색](https://www.acmicpc.net/problem/2178)
- [백준 1697 숨바꼭질](https://www.acmicpc.net/problem/1697)
- [프로그래머스 게임 맵 최단거리](https://school.programmers.co.kr/learn/courses/30/lessons/1844)
- [백준 13913 숨바꼭질 4](https://www.acmicpc.net/problem/13913)

---

## Week 10 — 2차 모의 코테
- [백준 2606 바이러스](https://www.acmicpc.net/problem/2606)
- [백준 1182 부분수열의 합](https://www.acmicpc.net/problem/1182)
- [프로그래머스 소수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/42839)
- [백준 14502 연구소](https://www.acmicpc.net/problem/14502)

---

# Cycle 3: 효율성

## Week 11 — 이분탐색
- [백준 1920 수 찾기](https://www.acmicpc.net/problem/1920)
- [백준 1654 랜선 자르기](https://www.acmicpc.net/problem/1654)
- [백준 2805 나무 자르기](https://www.acmicpc.net/problem/2805)
- [백준 2110 공유기 설치](https://www.acmicpc.net/problem/2110)

---

## Week 12 — 투포인터
- [백준 1940 주몽](https://www.acmicpc.net/problem/1940)
- [백준 2003 수들의 합 2](https://www.acmicpc.net/problem/2003)
- [프로그래머스 연속된 부분 수열의 합](https://school.programmers.co.kr/learn/courses/30/lessons/178870)
- [백준 1806 부분합](https://www.acmicpc.net/problem/1806)

---

## Week 13 — 그리디 + 힙
- [백준 11399 ATM](https://www.acmicpc.net/problem/11399)
- [백준 11047 동전 0](https://www.acmicpc.net/problem/11047)
- [프로그래머스 큰 수 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/42883)
- [백준 11286 절댓값 힙](https://www.acmicpc.net/problem/11286)

---

## Week 14 — 누적합
- [백준 11659 구간 합 구하기 4](https://www.acmicpc.net/problem/11659)
- [백준 2559 수열](https://www.acmicpc.net/problem/2559)
- [프로그래머스 호텔 대실](https://school.programmers.co.kr/learn/courses/30/lessons/155651)
- [백준 11660 구간 합 구하기 5](https://www.acmicpc.net/problem/11660)

---

## Week 15 — 3차 모의 코테
- [백준 2512 예산](https://www.acmicpc.net/problem/2512)
- [백준 2470 두 용액](https://www.acmicpc.net/problem/2470)
- [백준 1744 수 묶기](https://www.acmicpc.net/problem/1744)
- [프로그래머스 입국심사](https://school.programmers.co.kr/learn/courses/30/lessons/43238)

---

# Cycle 4: 심화

## Week 16 — DP
- [백준 1463 1로 만들기](https://www.acmicpc.net/problem/1463)
- [백준 2579 계단 오르기](https://www.acmicpc.net/problem/2579)
- [프로그래머스 정수 삼각형](https://school.programmers.co.kr/learn/courses/30/lessons/43105)
- [백준 12865 평범한 배낭](https://www.acmicpc.net/problem/12865)

---

## Week 17 — 다익스트라
- [백준 1916 최소비용 구하기](https://www.acmicpc.net/problem/1916)
- [백준 1753 최단경로](https://www.acmicpc.net/problem/1753)
- [프로그래머스 배달](https://school.programmers.co.kr/learn/courses/30/lessons/12978)
- [백준 1504 특정한 최단 경로](https://www.acmicpc.net/problem/1504)

---

## Week 18 — 트리 / 유니온파인드
- [백준 11725 트리의 부모 찾기](https://www.acmicpc.net/problem/11725)
- [백준 1717 집합의 표현](https://www.acmicpc.net/problem/1717)
- [프로그래머스 네트워크](https://school.programmers.co.kr/learn/courses/30/lessons/43162)
- [백준 1197 최소 스패닝 트리](https://www.acmicpc.net/problem/1197)

---

## Week 19 — 복합 유형 (구현 + 탐색)
- [백준 14888 연산자 끼워넣기](https://www.acmicpc.net/problem/14888)
- [백준 14503 로봇 청소기](https://www.acmicpc.net/problem/14503)
- [프로그래머스 거리두기 확인하기](https://school.programmers.co.kr/learn/courses/30/lessons/81302)
- [백준 17144 미세먼지 안녕!](https://www.acmicpc.net/problem/17144)

---

## Week 20 — 4차 모의 코테
- [백준 15686 치킨 배달](https://www.acmicpc.net/problem/15686)
- [백준 16234 인구 이동](https://www.acmicpc.net/problem/16234)
- [프로그래머스 메뉴 리뉴얼](https://school.programmers.co.kr/learn/courses/30/lessons/72411)
- [백준 14499 주사위 굴리기](https://www.acmicpc.net/problem/14499)

---
