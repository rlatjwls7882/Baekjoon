#include<bits/stdc++.h>
using namespace std;

struct Case {
    long long mandoo, k;
    bool operator<(const Case c) const {
        if(mandoo==c.mandoo) return k > c.k;
        return mandoo > c.mandoo;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long d, n, m, k; cin >> d >> n >> m >> k;
    long long remain1 = d-(n-n/d*d), remain2 = d-(m-m/d*d);

    vector<Case> cases;
    cases.push_back({n/d + m/d + k/d, k});
    if(k-remain2>=0) cases.push_back({n/d + (m+remain2)/d + (k-remain2)/d, k-remain2});
    if(k-remain1>=0) cases.push_back({(n+remain1)/d + m/d + (k-remain1)/d, k-remain1});
    if(k-remain1-remain2>=0) cases.push_back({(n+remain1)/d + (m+remain2)/d + (k-remain1-remain2)/d, k-remain1-remain2});

    sort(cases.begin(), cases.end());
    cout << cases.front().k;
}