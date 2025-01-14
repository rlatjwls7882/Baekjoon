#include<bits/stdc++.h>
using namespace std;

int getCnt(bitset<32> b) {
    int cnt=0;
    for(int i=0;i<32;i++) {
        if(b[i]) cnt++;
    }
    return cnt;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K; cin >> N >> K;
    bitset<32> b(N);

    int res=0;
    for(int i=0;i<32 && getCnt(b)>K;i++) {
        if(b[i]) {
            res += pow(2, i);
            b = bitset<32>(N+res);
        }
    }
    cout << res;
}