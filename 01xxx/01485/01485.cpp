#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<ll, ll> P;

ll calcDist(P a, P b) {
    return (ll)(pow(a.first-b.first, 2)+pow(a.second-b.second, 2));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        vector<P> v;
        for(int i=0;i<4;i++) {
            ll a, b; cin >> a >> b;
            v.push_back(P(a, b));
        }
        sort(v.begin(), v.end());

        // 이웃한 변의 길이가 같고, 대각선의 길이가 같은지 확인
        if(calcDist(v[0], v[1])==calcDist(v[0], v[2])&&calcDist(v[0], v[2])==calcDist(v[1], v[3])&&calcDist(v[1], v[3])==calcDist(v[1], v[3])&&calcDist(v[0], v[3])==calcDist(v[1], v[2])) cout << "1\n";
        else cout << "0\n";
    }
}