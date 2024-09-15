#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int F[N];
    for(int i=0;i<N;i++) {
        cin >> F[i];
    }
    sort(F, F+N);

    long long cnt=0;
    for(long long i=0;i<N-1;i++) {
        long long left=i, right=N-1;
        while(left<right) {
            int mid = (left+right+1)/2;
            if(F[mid]*0.9>F[i]) {
                right=mid-1;
            } else {
                left=mid;
            }
        }
        cnt += right-i;
    }
    cout << cnt;
}