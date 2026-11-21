#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int L; cin >> L;
    int S[L];
    for(int i=0;i<L;i++) {
        cin >> S[i];
    }
    int n; cin >> n;

    int left=1, right=1000;
    for(int i=0;i<L;i++) {
        if(S[i]<n) {
            left = max(left, S[i]+1);
        } else if(S[i]>n) {
            right = min(right, S[i]-1);
        } else {
            cout << 0;
            return 0;
        }
    }

    int cnt=0;
    for(int i=left;i<=n;i++) {
        cnt += right-n+1;
        if(i==n) cnt--;
    }
    cout << cnt;
}