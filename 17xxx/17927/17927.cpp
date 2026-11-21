#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD = 1e9+7;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, l; cin >> n >> l;
    vector<int> arr(l);
    for(int i=0;i<l;i++) {
        cin >> arr[i];
        if(i && arr[i-1]>=arr[i]) {
            cout << 0;
            return 0;
        }
    }

    if(arr.back()!=n) {
        cout << 0;
        return 0;
    }

    ll ret=1, cnt=0;
    for(int i=n;i>=1;i--) {
        auto low = lower_bound(arr.begin(), arr.end(), i);
        if(*low!=i) ret = ret*(arr.end()-low+cnt++)%MOD;
    }
    cout << ret;
}