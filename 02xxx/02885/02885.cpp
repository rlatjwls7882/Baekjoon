#include<bits/stdc++.h>
using namespace std;

int main() {
    int K; cin >> K;
    bitset<32> b(K);
    int big, first=-1, last;
    for(int i=0;i<32;i++) {
        if(b[i]) {
            big = pow(2, i);
            if(first==-1) first=i;
            last=i;
        }
    }
    if(big!=K) {
        big*=2;
        last++;
    }
    cout << big << ' ' << last-first;
}