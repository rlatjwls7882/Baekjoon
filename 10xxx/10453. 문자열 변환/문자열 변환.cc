#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        string a, b; cin >> a >> b;

        long long cnt=0, idx=0;
        for(int i=0;i<a.length();i++) {
            while(idx<b.length() && b[idx]!='a') idx++;
            if(a[i]=='a') {
                cnt += abs(i-idx);
                idx++;
            }
        }
        cout << cnt << '\n';
    }
}