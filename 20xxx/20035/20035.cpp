#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int maxA=-1, maxAFirstIdx, maxALastIdx;
    long long A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
        if(A[i]>maxA) {
            maxA=A[i];
            maxAFirstIdx=i;
        }
        if(A[i]==maxA) {
            maxALastIdx=i;
        }
    }

    int maxB=-1, maxBIdx;
    long long B[M];
    for(int i=0;i<M;i++) {
        cin >> B[i];
        if(B[i]>maxB) {
            maxB=B[i];
            maxBIdx=i;
        }
    }

    int Aidx=0, Bidx=0;
    long long cnt=0;
    while(Aidx<N) {
        cnt += A[Aidx]*1000000000+B[Bidx];
        if(Aidx<maxAFirstIdx) Aidx++;
        else if(Aidx==maxAFirstIdx && Bidx<maxBIdx) Bidx++;
        else if(Aidx<maxALastIdx) Aidx++;
        else if(Bidx+1<M) Bidx++;
        else Aidx++;
    }
    cout << cnt;
}