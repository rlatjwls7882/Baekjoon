#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N+1];
    for(int i=1;i<=N;i++) {
        cin >> arr[i];
    }
    int a, b; cin >> a >> b;

    int cnt[N+1] = {0, };
    queue<int> q; q.push(a); cnt[a]=1;
    while(!q.empty()) {
        int cur = q.front(); q.pop();

        for(int i=1;;i++) {
            int next = cur+arr[cur]*i;
            if(next>N) break;
            if(!cnt[next]) {
                cnt[next]=cnt[cur]+1;
                q.push(next);
            }
        }
        for(int i=1;;i++) {
            int next = cur-arr[cur]*i;
            if(next<=0) break;
            if(!cnt[next]) {
                cnt[next]=cnt[cur]+1;
                q.push(next);
            }
        }
    }
    cout << cnt[b]-1;
}