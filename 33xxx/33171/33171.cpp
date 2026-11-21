#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, a, b; cin >> n >> a >> b;

    int cnt=0;
    for(int i=1;i<=n;i++) {
        if(i%a && !(i%b) || !(i%a) && i%b) {
            cnt++;
        }
    }
    cout << cnt;
}