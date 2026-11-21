#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int last=0, cnt=1, curLen=0, maxLen=1;
    while(n--) {
        int cur; cin >> cur;
        if(last<=cur) maxLen = max(maxLen, ++curLen);
        else curLen=1, cnt++;
        last = cur;
    }
    cout << cnt << ' ' << maxLen;
}