#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; string s; cin >> n >> s;

    int cnt[4] = {0, };
    for(int i=0;i<n;i++) {
        if(s[i]=='A') cnt[0]++;
        else if(s[i]=='C') cnt[1]++;
        else if(s[i]=='G') cnt[2]++;
        else cnt[3]++;
    }

    cout << min(min(min(cnt[0], cnt[1]), cnt[2]), cnt[3]) << '\n';
    if(cnt[0]<=cnt[1] && cnt[0]<=cnt[2] && cnt[0]<=cnt[3]) {
        for(int i=0;i<n;i++) {
            cout << 'A';
        }
    } else if(cnt[1]<=cnt[2] && cnt[1]<=cnt[3]) {
        for(int i=0;i<n;i++) {
            cout << 'C';
        }
    } else if(cnt[2]<=cnt[3]) {
        for(int i=0;i<n;i++) {
            cout << 'G';
        }
    } else {
        for(int i=0;i<n;i++) {
            cout << 'T';
        }
    }
}