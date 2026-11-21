#include<bits/stdc++.h>
using namespace std;

int cur[128];

bool chk() {
    for(int i=0;i<128;i++) {
        if(cur[i]) {
            return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int g, s; string W, S; cin >> g >> s >> W >> S;

    for(char ch:W) {
        cur[ch]--;
    }

    int cnt=0;
    for(int i=0;i<s;i++) {
        if(i>=g) cur[S[i-g]]--;
        cur[S[i]]++;
        if(chk()) cnt++;
    }
    cout << cnt;
}