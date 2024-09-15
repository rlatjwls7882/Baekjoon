#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string s; cin >> s;

    for(int i=1;i<N;i++) {
        int cnt=0;
        for(int j=0;j<i;j++) {
            if(s[j]!=s[N-i-j]) cnt++;
        }
        if(cnt==1) {
            cout << "YES";
            return 0;
        }
    }
    cout << "NO";
}