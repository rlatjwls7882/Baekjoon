#include<bits/stdc++.h>
using namespace std;

int c, n, t[100'000];

bool chk(int i) {
    int cnt=0;
    for(int j=0;j<n;j++) {
        if(t[j]<i) cnt++;
        else cnt=0;
        if(cnt>c) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> c >> n;
    for(int i=0;i<n;i++) cin >> t[i];

    for(int i=50;i>=-50;i--) {
        if(chk(i)) {
            cout << i;
            return 0;
        }
    }
}