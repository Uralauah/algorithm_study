import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class BOJ_5430_AC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String input = br.readLine();
            input = input.substring(1, input.length() - 1);

            Deque<Integer> array = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(input, ",");

            // 입력 배열을 덱에 저장
            while (st.hasMoreTokens()) {
                array.addLast(Integer.parseInt(st.nextToken()));
            }

            boolean head = true;   // true면 정방향, false면 역방향
            boolean error = false;

            for (int i = 0; i < p.length(); i++) {
                char op = p.charAt(i);

                // 뒤집기 연산은 실제로 뒤집지 않고 방향만 반전
                if (op == 'R') {
                    head = !head;
                    continue;
                }

                // 버릴 원소가 없으면 에러
                if (array.isEmpty()) {
                    error = true;
                    break;
                }

                // 현재 방향에 따라 앞 또는 뒤에서 제거
                if (head) array.pollFirst();
                else array.pollLast();
            }

            if (error) {
                sb.append("error").append("\n");
            } else {
                sb.append("[");

                // 현재 방향에 맞게 결과 출력
                while (!array.isEmpty()) {
                    if (head) sb.append(array.pollFirst());
                    else sb.append(array.pollLast());

                    if (!array.isEmpty()) {
                        sb.append(",");
                    }
                }

                sb.append("]").append("\n");
            }
        }

        System.out.print(sb);
    }
}