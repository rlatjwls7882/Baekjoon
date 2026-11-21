#include<bits/stdc++.h>
using namespace std;

int preMin[100'001], preMax[100'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        cin >> preMin[i] >> preMax[i];
        preMin[i] += preMin[i-1];
        preMax[i] += preMax[i-1];
    }

    int cnt=0;
    for(int i=1;i<n;i++) {
        int leftL = preMin[i], leftR = preMax[i];
        int rightL = preMin[n]-preMin[i], rightR = preMax[n]-preMax[i];
        if(leftL<=rightR && rightR<=leftR || leftL<=rightL && rightL<=leftR || rightL<=leftL && leftL<=rightR || rightL<=leftR && leftR<=rightR) cnt++;
    }
    cout << cnt;
}