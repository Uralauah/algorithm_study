import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class BOJ_2164_카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> q = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        // 1번부터 n번 카드까지 순서대로 큐에 삽입
        for (int i = 1; i <= n; i++) {
            q.addLast(i);
        }

        // 카드가 한 장 남을 때까지 반복
        while (q.size() != 1) {
            q.pollFirst();              // 맨 위 카드 버리기
            q.addLast(q.pollFirst());   // 다음 카드를 맨 아래로 이동
        }

        // 마지막으로 남은 카드 출력
        System.out.println(q.poll());
    }
}