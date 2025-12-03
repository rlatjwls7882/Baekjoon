#include<bits/stdc++.h>
using namespace std;

int b[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> b[i];

    int res=0;
    for(int i=0;i<n;i++) {
        int cnt=0, last=0;
        for(int j=0;j<n;j++) {
            if(b[j]==b[i]) continue;
            if(last!=b[j]) {
                cnt=1;
                last=b[j];
            } else {
                cnt++;
            }
            res = max(res, cnt);
        }
    }
    cout << res;
}