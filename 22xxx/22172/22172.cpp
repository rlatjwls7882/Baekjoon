#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int minVal=INT_MAX, maxVal=INT_MIN;
    for(int i=1;i<=n;i++) {
        int val; cin >> val;
        minVal = min(minVal, val-i);
        maxVal = max(maxVal, val-i);
    }

    int leftCnt = (minVal<0 ? -minVal : 0);
    int rightCnt = (maxVal>0 ? maxVal : 0);
    cout << min(leftCnt*2+rightCnt, leftCnt+rightCnt*2);
}