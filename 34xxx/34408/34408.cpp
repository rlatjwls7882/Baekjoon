#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int cnt[26];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string s, t; cin >> s >> t;
    for(char ch:s) cnt[ch-'A']++;
    for(char ch:t) cnt[ch-'A']--;

    for(int i=0;i<26;i++) {
        if(cnt[i]<0) {
            cout << "NEED FIX";
            return 0;
        }
    }
    cout << "OK";
}