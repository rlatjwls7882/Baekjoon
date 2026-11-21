#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int color[N+1] = {0, };

    color[1]=1;
    int cnt=1;
    for(int i=2;i<=N;i++) {
        if(!color[i]) {
            cnt++;
            for(int j=i;j<=N;j+=i) {
                color[j]=cnt;
            }
        }
    }

    cout << cnt << '\n';
    for(int i=1;i<=N;i++) {
        cout << color[i] << ' ';
    }
}