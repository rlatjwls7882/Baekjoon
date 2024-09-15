#include<bits/stdc++.h>
using namespace std;

int game(int N, int A[]) {
    int cnt=1;
    bool visited[N+1] = {false, };
    for(int i=1;!visited[i];i=A[i]) {
        visited[i]=true;
        if(A[i]==N) return cnt;
        cnt++;
    }
    return 0;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        int A[N+1];
        for(int i=1;i<=N;i++) {
            cin >> A[i];
        }
        cout << game(N, A) << '\n';
    }
}