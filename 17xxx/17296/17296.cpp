#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    bool press=false;
    int cnt=0;
    while(n--) {
        double cur; cin >> cur;
        if(press) cnt += cur;
        else cnt += cur + 0.5;
        if(cur) press=true;
    }
    cout << cnt;
}