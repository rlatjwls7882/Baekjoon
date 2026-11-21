#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string s; cin >> N >> s;

    int cnt=0;
    for(int i=0;i<N;i++) {
        if(s[i]=='1') {
            cnt++;
        }
    }
    cout << cnt;
}