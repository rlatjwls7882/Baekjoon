#include<bits/stdc++.h>
using namespace std;

int l, n, k, res;
string s[20];

void chkScore(string p) {
    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j+k-1<l;j++) {
            if(s[i].substr(j, k)==p) cnt++;
        }
    }
    res = max(res, cnt);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> l >> n;
    for(int i=0;i<n;i++) cin >> s[i];
    cin >> k;
    for(int i=0;i<n;i++) {
        for(int j=0;j+k-1<l;j++) {
            chkScore(s[i].substr(j, k));
        }
    }
    cout << res;
}