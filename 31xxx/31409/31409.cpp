#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int res[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    for(int i=1;i<=n;i++) cin >> res[i];

    int cnt=0;
    for(int i=1;i<=n;i++) {
        if(res[i]==i) {
            res[i] = i%n+1;
            cnt++;
        }
    }

    cout << cnt << '\n';
    for(int i=1;i<=n;i++) cout << res[i] << ' ';
}