#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        long long n; cin >> n;

        // 1~k의 합<=n인 최대 k 찾기
        long long left=1, right=200000000;
        while(left<right) {
            long long mid = (left+right+1)/2;
            if(mid*(mid+1)/2<=n) left=mid;
            else right=mid-1;
        }
        cout << left << '\n';
    }
}