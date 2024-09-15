#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);

    bool notPrime[100000] = {true, true, false, };
    for(int i=2;i*i<100000;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<100000;j+=i) {
                notPrime[j]=true;
            }
        }
    }

    while(true) {
        string s; cin >> s;
        if(s[0]=='0' && s[1]==0) {
            break;
        }

        int _max=-1;
        for(int i=min(int(s.length()), 5);i>0;i--) {
            for(int j=0;j+i<=s.length();j++) {
                int val = stoi(s.substr(j, i));
                if(!notPrime[val]) {
                    _max = max(_max, val);
                }
            }
            if(_max!=-1) {
                break;
            }
        }
        cout << _max << endl;
    }
}