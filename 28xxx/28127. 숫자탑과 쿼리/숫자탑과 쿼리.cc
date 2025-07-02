#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int q; cin >> q;
    while(q--) {
        long long a, d, x; cin >> a >> d >> x;

        long long left=0, right=1000000; // 층 수 이분탐색
        while(left<right) {
            long long mid = (left+right+1)/2;
            long long cur = mid*a + (mid-1)*mid/2*d;
            if(cur>=x) right = mid-1;
            else left = mid;
        }
        cout << left+1 << ' ' << x - (left*a + (left-1)*left/2*d) << '\n';
    }
}