import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class BOJ_1158_요세푸스문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new ArrayDeque<>();

        // 1번부터 n번까지 큐에 삽입
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 큐가 빌 때까지 K번째 사람 제거
        for (int i = 0; i < n; i++) {
            // 앞에서 K-1명은 뒤로 이동
            for (int j = 0; j < k - 1; j++) {
                q.add(q.poll());
            }

            // K번째 사람 제거
            sb.append(q.poll());

            // 마지막 원소가 아니면 쉼표 추가
            if (i != n - 1) {
                sb.append(", ");
            }
        }

        sb.append(">");

        System.out.println(sb);
    }
}