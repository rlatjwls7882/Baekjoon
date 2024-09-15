#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    bool chk[1440] = {false, };
    while(N-->0) {
        int s, e; cin >> s >> e;
        s = (s/100*60)+s%100;
        e = (e/100*60)+e%100;
        for(int i=s-10;i<e+10;i++) {
            chk[i]=true;
        }
    }

    int cur=0, _max=0;
    for(int i=600;i<=1320;i++) {
        if(chk[i] || i==1320) {
            _max = max(_max, cur);
            cur=0;
        } else {
            cur++;
        }
    }
    cout << _max;
}