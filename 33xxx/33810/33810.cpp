#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a; cin >> a;
    string b = "SciComLove";

    int cnt=0;
    for(int i=0;i<10;i++) {
        if(a[i]!=b[i]) cnt++;
    }
    cout << cnt;
}