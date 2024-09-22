#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    bool increasing=true, decreasing=true;
    int maxLen=1, curLen=1, a; cin >> a;
    while(n-->1) {
        int nextA; cin >> nextA;
        if(a<nextA) {
            if(increasing) maxLen = max(maxLen, ++curLen);
            else curLen=2;
            increasing=true;
            decreasing=false;
        } else if(a>nextA) {
            if(decreasing || increasing) maxLen = max(maxLen, ++curLen);
            else curLen=2;
            increasing=false;
            decreasing=true;
        } else {
            increasing=true;
            decreasing=true;
            curLen=1;
        }
        a=nextA;
    }
    cout << maxLen;
}