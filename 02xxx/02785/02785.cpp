#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> v(n);
    for(int i=0;i<n;i++) cin >> v[i];
    sort(v.begin(), v.end());

    int cnt=n-1, total=n;
    for(int i=0;i<n;i++) {
        if(total-v[i]-1>0) {
            total -= v[i]+1;
            cnt--;
        } else {
            break;
        }
    }
    cout << cnt;
}