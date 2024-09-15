#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, P, Q; cin >> N >> P >> Q;

    int A[N], B[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    for(int i=0;i<N;i++) {
        cin >> B[i];
    }

    int total[N];
    for(int i=0;i<N;i++) {
        int cnt=0;
        while(A[i]!=B[i]) {
            A[i]+=P;
            B[i]+=Q;
            cnt++;
            if(cnt>10000) {
                cout << "NO";
                return 0;
            }
        }
        total[i]=cnt;
    }

    cout << "YES\n";
    for(int i=0;i<N;i++) {
        cout << total[i] << ' ';
    }
}