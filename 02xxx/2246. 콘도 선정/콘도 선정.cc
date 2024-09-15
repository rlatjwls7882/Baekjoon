#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int D[N], C[N];
    for(int i=0;i<N;i++) {
        cin >> D[i] >> C[i];
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        bool chk=true;
        for(int j=0;j<N;j++) {
            if(D[j]<D[i] && C[j]<=C[i] || C[j]<C[i] && D[j]<=D[i]) {
                chk=false;
            }
        }
        if(chk) cnt++;
    }
    cout << cnt;
}