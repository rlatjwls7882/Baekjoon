#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string S, P; cin >> S >> P;

    int idx=0, cnt=0;
    while(idx<P.length()) {
        int maxLen=0, curLen=0;
        for(int i=0;i<S.length();i++) {
            if(idx+curLen<P.length() && P[idx+curLen]==S[i]) {
                maxLen = max(maxLen, ++curLen);
            } else {
                curLen=0;
            }
        }
        cnt++;
        idx += maxLen;
    }
    cout << cnt;
}