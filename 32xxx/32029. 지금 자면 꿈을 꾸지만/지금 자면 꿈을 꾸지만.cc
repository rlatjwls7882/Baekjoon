#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, A, B; cin >> N >> A >> B;
    int T[N];
    for(int i=0;i<N;i++) {
        cin >> T[i];
    }
    sort(T, T+N);

    int maxCnt=0;
    for(int X=0;X<A;X++) {
        for(int i=-1;i<N;i++) {
            int cnt=0, last=0;
            for(int j=0;j<=i;j++) {
                if(last+A<=T[j]) {
                    last += A;
                    cnt++;
                }
            }
            last += X*B;
            for(int j=i+1;j<N;j++) {
                if(last+A-X<=T[j]) {
                    last += A-X;
                    cnt++;
                }
            }
            maxCnt = max(maxCnt, cnt);
        }
    }
    cout << maxCnt;
}