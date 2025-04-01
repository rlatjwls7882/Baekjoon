#include<bits/stdc++.h>
using namespace std;

int res;
int N, L, R, X;
vector<int> A(15);

void calc(int start=0, int curSum=0, int curMin=INT_MAX, int curMax=INT_MIN) {
    if(start==N) return;

    for(int i=start;i<N;i++) {
        int nextSum = curSum + A[i];
        int nextMin = min(A[i], curMin);
        int nextMax = max(A[i], curMax);

        if(L<=nextSum && nextSum<=R && nextMax-nextMin>=X) res++;
        if(nextSum<=R) calc(i+1, nextSum, nextMin, nextMax);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> N >> L >> R >> X;
    for(int i=0;i<N;i++) cin >> A[i];
    calc();
    cout << res;
}