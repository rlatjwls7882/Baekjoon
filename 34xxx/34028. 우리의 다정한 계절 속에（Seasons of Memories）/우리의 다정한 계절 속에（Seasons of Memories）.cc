#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c; cin >> a >> b >> c;

    int sa=2015, sb=1, cnt=1;
    while(sa<a || sa==a && sb<=b) {
        if(sb==12 || sb==3 || sb==6 || sb==9) cnt++;
        if(++sb==13) sa++, sb=1;
    }
    cout << cnt;
}