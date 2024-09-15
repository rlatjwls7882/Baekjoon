#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int A[n];
    for(int i=0;i<n;i++) {
        cin >> A[i];
    }
    int s; cin >> s; s--;

    int cnt=0;
    bool visited[n] = {false, };
    queue<int> q; q.push(s);
    visited[s]=true;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        cnt++;
        if(cur-A[cur]>=0 && !visited[cur-A[cur]]) {
            q.push(cur-A[cur]);
            visited[cur-A[cur]]=true;
        }
        if(cur+A[cur]<n && !visited[cur+A[cur]]) {
            q.push(cur+A[cur]);
            visited[cur+A[cur]]=true;
        }
    }
    cout << cnt;
}