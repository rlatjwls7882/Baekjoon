#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K, B; cin >> N >> K >> B;

    bool gojang[N] = {false, };
    while(B-->0) {
        int cnt; cin >> cnt;
        gojang[cnt-1]=true;
    }

    int cnt=0;
    for(int i=0;i<K;i++) {
        if(gojang[i]) cnt++;
    }

    int _min = cnt;
    for(int i=K;i<N;i++) {
        if(gojang[i]) cnt++;
        if(gojang[i-K]) cnt--;
        _min = min(_min, cnt);
    }
    cout << _min;
}