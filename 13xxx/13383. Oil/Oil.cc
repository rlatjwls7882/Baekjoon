#include<bits/stdc++.h>
using namespace std;

bool visited[100];
vector<set<int>> conn(100);
void dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur]) {
        if(!visited[next]) dfs(next);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int n; cin >> n;
        vector<int> cnt(n);
        int m; cin >> m;

        for(int i=0;i<n;i++) { // 초기화
            visited[i]=false;
            conn[i].clear();
        }

        int start=0;
        while(m-->0) {
            int x, y, z; cin >> x >> y >> z;
            cnt[x]+=z;
            cnt[y]+=z;
            conn[x].insert(y);
            conn[y].insert(x);
            start=x;
        }
        dfs(start);

        bool chk=true;
        int oddCnt=0;
        for(int i=0;i<n;i++) {
            if(cnt[i]%2==1) oddCnt++;
            if(!conn[i].empty() && !visited[i]) chk=false;
        }

        if(chk && (oddCnt==0 || oddCnt==2)) cout << "yes\n"; // 오일러 경로나 오일러 회로 생성
        else cout << "no\n";
    }
}