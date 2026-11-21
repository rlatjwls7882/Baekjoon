#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n; cin >> n;
    
    int cnt=0;
    int last = to_string(n).length();
    while(true) {
        n*=2;
        int next = to_string(n).length();
        if(last == next) cnt++;
        else break;
    }
    cout << cnt;
}