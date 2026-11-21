#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long x, y; cin >> x >> y;

    // x+y를 1부터 n까지의 합으로 나타내기
    long long left=0, right=10000000;
    while(left<right) {
        long long mid = (left+right)/2;
        if(mid*(mid+1)/2<x+y) left=mid+1;
        else right=mid;
    }

    if(left*(left+1)/2 != x+y) {
        cout << -1;
        return 0;
    }

    // 그리디하게 할당
    int cnt=0;
    for(int i=left;i>0;i--) {
        if(x>=i) {
            x-=i;
            cnt++;
        }
    }
    cout << cnt;
}