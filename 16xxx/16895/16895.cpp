#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int ret=0;
    vector<int> p(n);
    for(int i=0;i<n;i++) {
        cin >> p[i];
        ret ^= p[i];
    }

    int cnt=0;
    if(ret) {
        for(int i=0;i<n;i++) {
            if((ret^p[i])<=p[i]) cnt++;
        }
    }
    cout << cnt;
}