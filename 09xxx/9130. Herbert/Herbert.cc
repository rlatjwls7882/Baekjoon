#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        long long n; cin >> n;
        
        long long sum = n+1; // 앞
        if(n>=1) sum += (n-1)*2 // 중앙 위 아래
            + (n-2)*(n-1); // 앞쪽 위 아래
        if(n>=2) sum += max(n-2, 0LL) // 뒤
            + (n-3)*(n-2); // 뒤쪽 위 아래
        
        cout << sum << '\n';
    }
}