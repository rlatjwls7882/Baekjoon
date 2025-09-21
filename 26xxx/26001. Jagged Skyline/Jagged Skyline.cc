#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll w, h; cin >> w >> h;

    vector<int> v(w);
    for(int i=0;i<w;i++) v[i]=i+1;
    shuffle(v.begin(), v.end(), mt19937(chrono::steady_clock::now().time_since_epoch().count()));

    ll ans=0, ans_x=1;
    for(int i=0;i<w && ans<h;i++) {
        cout << "? " << v[i] << ' ' << ans+1 << '\n' << flush;
        string input; cin >> input;
        if(input[0]=='s') continue;

        ll left = ans+1, right = h;
        while(left<right) {
            ll mid = (left+right+1)/2;
            cout << "? " << v[i] << ' ' << mid << '\n' << flush;
            cin >> input;
            if(input[0]=='b') left=mid;
            else right=mid-1;
        }
        ans = left;
        ans_x = v[i];
    }
    cout << "! " << ans_x << ' ' << ans << '\n' << flush;
}