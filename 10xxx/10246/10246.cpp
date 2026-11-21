#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(n==0) break;

        int cnt=0, sum=0;
        for(int i=1;sum<=n;i++) {
            sum += i;
            if((n-sum)%i==0 && (n-sum)/i>=1) cnt++;
        }
        cout << cnt << '\n';
    }
}