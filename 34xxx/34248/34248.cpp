#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int two=0, one=0;
    while(n--) {
        int cnt; cin >> cnt;
        if(cnt==2) two++;
        else one++;
    }

    if(two<=one && (two*2+one)%3==0) cout << "Yes";
    else cout << "No";
}