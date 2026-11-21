#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int cnt=0;
    while(n--) {
        int s, c, a, r; cin >> s >> c >> a >> r;
        if(s>=1000 || c>=1600 || a>=1500 || r!=-1 && r<=30) cnt++;
    }
    cout << cnt;
}