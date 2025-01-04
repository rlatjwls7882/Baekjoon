#include<bits/stdc++.h>
using namespace std;

int k, cur=2, len=1;
void findNum() {
    bitset<32> bits(k-1);
    for(int i=len-1;i>=0;i--) {
        if(bits[i]==0) cout << 4;
        else cout << 7;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> k;
    while(true) {
        if(k<=cur) {
            findNum();
            return 0;
        }
        k-=cur;
        cur*=2;
        len++;
    }
}