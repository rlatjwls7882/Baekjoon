#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; string s; cin >> N >> K >> s;

    int H[20000]; int sizeH=0;
    int P[20000]; int sizeP=0;
    for(int i=0;i<N;i++) {
        if(s[i]=='H') H[sizeH++]=i;
        else P[sizeP++]=i;
    }

    int cnt=0, idxH=0, idxP=0;
    while(idxP<sizeP && idxH<sizeH) {
        while(idxP<sizeP && H[idxH]>P[idxP]+K) idxP++;
        while(idxH<sizeH && P[idxP]>H[idxH]+K) idxH++;
        if(idxP<sizeP && idxH<sizeH) {
            cnt++;
            idxH++;
            idxP++;
        }
    }
    cout << cnt;
}