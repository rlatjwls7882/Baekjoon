#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, a, b; cin >> n >> a >> b;
    
    int cnt = a+b;
    if(cnt>n) cnt = n-(cnt-n);
    
    bitset<10> bit;
    for(int i=n-1;i>=0;i--) {
        if(cnt) {
            bit[i]=1;
            cnt--;
        }
    }
    cout << bit.to_ullong();
}