#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    for(int i=1;i<=99999999;i++) {
        string s = to_string(i);
        if(N>s.length()) {
            N -= s.length();
        } else {
            cout << s[N-1];
            return 0;
        }
    }
}