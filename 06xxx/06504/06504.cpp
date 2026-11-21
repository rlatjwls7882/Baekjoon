#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    vector<int> fibo = {1, 2};
    while(fibo.back()<=25000) fibo.push_back(fibo[fibo.size()-2]+fibo.back());

    int t; cin >> t;
    while(t--) {
        int x; cin >> x;
        int ret=0;
        for(int i=fibo.size()-1;i>=1;i--) {
            if(x>=fibo[i]) {
                x -= fibo[i];
                ret += fibo[i-1];
            }
        }
        cout << ret << '\n';
    }
}