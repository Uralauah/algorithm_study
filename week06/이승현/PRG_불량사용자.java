class Solution {
    public boolean[] visited;
    public int ans = 0, last, n;
    public String[] ban, user;

    public void find(int idx){
        if(idx>=last){
            ans++;
            return;
        }
        String id = ban[idx];
        for(int i=0;i<n;i++){
            if(visited[i]||id.length()!=user[i].length())
                continue;
            boolean flag = false;
            for(int j=0;j<id.length();j++){
                if(id.charAt(j)=='*')
                    continue;
                if(id.charAt(j)!=user[i].charAt(j)){
                    flag = true;
                    break;
                }
            }

            if(flag){
                continue;
            }
            System.out.println(id+" "+user[i]);

            visited[i] = true;
            find(idx+1);
        }
    }

    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        last = banned_id.length;
        n = user_id.length;

        visited = new boolean[user_id.length];
        ban = banned_id;
        user = user_id;

        find(0);
        return ans;
    }
}