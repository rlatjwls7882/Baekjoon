#include<bits/stdc++.h>
using namespace std;

int rem[1000000], idx;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=1;;i++) {
        string s = to_string(i);
        bool chk=true;
        int cnt[10] = {0, };
        for(int i=0;i<s.length();i++) {
            if(cnt[s[i]-'0']++) {
                chk=false;
                break;
            }
        }
        if(chk) {
            rem[idx] = i;
            if(++idx==1000000) break;
        }
    }

    while(true) {
        int n; cin >> n;
        if(!n) break;
        cout << rem[n-1] << '\n';
    }
}