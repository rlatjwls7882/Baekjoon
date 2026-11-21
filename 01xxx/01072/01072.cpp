#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll X, Y; cin >> X >> Y;

    ll first=Y*100/X;
    if(first>=99) {
        cout << -1;
    } else {
        ll left=1, right=X;
        while(left<right) {
            ll mid = (left+right)/2;
            if((Y+mid)*100/(X+mid)!=first) {
                right=mid;
            } else {
                left=mid+1;
            }
        }
        cout << left;
    }
}