#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;

    int cnt1=0, cnt2=0;
    while(N-->0) {
        int h; cin >> h;
        cnt2 += h/2;
        cnt1 += h%2;
    }

    if(cnt2<cnt1 || (cnt2-cnt1)%3) cout << "NO";
    else cout << "YES";
}