#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    while(true) {
        int n; cin >> n;
        if(cin.fail()) break;

        int cnt=0, sum=n;
        while(sum>0) {
            while(sum%10!=1) {
                sum += n;
            }
            sum/=10;
            cnt++;
        }
        cout << cnt << '\n';
    }
}