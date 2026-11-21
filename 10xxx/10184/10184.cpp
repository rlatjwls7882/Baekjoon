#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int X, Y; cin >> X >> Y;
        vector<pair<string, double>> purchase(X);
        for(int i=0;i<X;i++) cin >> purchase[i].first >> purchase[i].second;
        map<string, pair<double, bool>> coupon; // {UCP codes , {discount, used}}
        while(Y-->0) {
            string s; double percent; cin >> s >> percent;
            coupon[s].first = percent;
            coupon[s].second = false;
        }

        double total=0;
        for(auto p:purchase) {
            if(coupon.count(p.first)) {
                total += p.second*(1-coupon[p.first].first);
                coupon[p.first].second=true;
            } else {
                total += p.second;
            }
        }

        vector<string> invalid;
        for(auto e:coupon) {
            if(!e.second.second) {
                invalid.push_back(e.first);
            }
        }

        cout << setprecision(2) << fixed << total << '\n';
        if(invalid.size()) {
            cout << "INVALID COUPONS\n";
            for(auto e:invalid) cout << e << '\n';
        }
    }
}