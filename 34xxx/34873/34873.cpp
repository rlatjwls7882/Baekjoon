#include<bits/stdc++.h>
using namespace std;

int cnt[200'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<2*n;i++) {
        int a; cin >> a;
        if(++cnt[a]>2) {
            cout << "No";
            return 0;
        }
    }
    cout << "Yes";
}