import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class BOJ_1966_프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // 현재 가장 높은 중요도를 빠르게 확인하기 위한 우선순위 큐
            PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
                return Integer.compare(o2, o1);
            });

            // (문서의 원래 위치, 중요도) 저장
            Queue<int[]> q = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int priority = st.nextToken().charAt(0) - '0';

                pq.add(priority);
                q.add(new int[]{i, priority});
            }

            int cnt = 0;
            while (!pq.isEmpty()) {
                int[] now = q.poll();

                // 현재 최고 중요도가 아니면 뒤로 보냄
                if (pq.peek() != now[1]) {
                    q.add(now);
                    continue;
                } else {
                    // 최고 중요도 문서라면 인쇄
                    pq.poll();
                    cnt++;
                }

                // 찾고 있는 문서라면 종료
                if (now[0] == m) {
                    break;
                }
            }

            System.out.println(cnt);
        }
    }
}