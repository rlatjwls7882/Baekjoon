#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    // 짝 / 홀
    long cntEvenMove=0, curMove=0;
    for(int i=0;i<N;i++) {
        if(A[i]%2==1) {
            curMove++;
        }
        if(i!=0&&A[i]%2==0) {
            cntEvenMove += curMove;
        }
    }

    // 홀 / 짝
    long cntOddMove=0; curMove=0;
    for(int i=0;i<N;i++) {
        if(A[i]%2==0) {
            curMove++;
        }
        if(i!=0&&A[i]%2==1) {
            cntOddMove += curMove;
        }
    }
    cout << min(cntEvenMove, cntOddMove);
}