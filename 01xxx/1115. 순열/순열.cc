#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    int cnt=0;
    bool visited[N] = {false, };
    for(int i=0;i<N;i++) {
        if(!visited[i]) {
            for(int j=i;!visited[j];j=A[j]) {
                visited[j]=true;
            }
            cnt++;
        }
    }
    if(cnt==1) cout << 0;
    else cout << cnt;
}