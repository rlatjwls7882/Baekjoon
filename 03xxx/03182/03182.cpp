#include<bits/stdc++.h>
using namespace std;

int cnt=0;
int arr[1001];
bool visited[1001] = {false, };

void dfs(int cur) {
    visited[cur]=true;
    cnt++;
    if(!visited[arr[cur]]) dfs(arr[cur]);
    visited[cur]=false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    for(int i=1;i<=N;i++) {
        cin >> arr[i];
    }

    int max=0, idx=1;
    for(int i=1;i<=N;i++) {
        dfs(i);
        if(max<cnt) {
            max=cnt;
            idx=i;
        }
        cnt=0;
    }
    cout << idx;
}