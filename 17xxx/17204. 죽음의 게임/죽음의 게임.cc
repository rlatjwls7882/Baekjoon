#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int cnt=1;
    bool visited[N] = {false, };
    for(int i=0;!visited[i];i=arr[i]) {
        visited[i]=true;
        if(arr[i]==K) {
            cout << cnt;
            return 0;
        }
        cnt++;
    }
    cout << -1;
}