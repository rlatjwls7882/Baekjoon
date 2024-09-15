#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int visited[max(N, K)*2+1] = {0, }, cnt[max(N, K)*2+1] = {0, };
    
    queue<int> q; q.push(N);
    cnt[N]=1;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        if(cur-1>=0 && !visited[cur-1]) {
            visited[cur-1]=visited[cur]+1;
            cnt[cur-1]+=cnt[cur];
            if(!cnt[K]) q.push(cur-1);
        } else if(cur-1>=0 && visited[cur-1]==visited[cur]+1) {
            cnt[cur-1]+=cnt[cur];
        }
        if(cur+1<=K && !visited[cur+1]) {
            visited[cur+1]=visited[cur]+1;
            cnt[cur+1]+=cnt[cur];
            if(!cnt[K]) q.push(cur+1);
        } else if(cur+1<=K && visited[cur+1]==visited[cur]+1) {
            cnt[cur+1]+=cnt[cur];
        }
        if(cur<=K && !visited[cur*2]) {
            visited[cur*2]=visited[cur]+1;
            cnt[cur*2]+=cnt[cur];
            if(!cnt[K]) q.push(cur*2);
        } else if(cur<=K && visited[cur*2]==visited[cur]+1) {
            cnt[cur*2]+=cnt[cur];
        }
    }
    cout << visited[K] << '\n' << cnt[K];
}