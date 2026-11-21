#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll n, l, k, p, w[100'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> l;
    for(int i=1;i<=n;i++) {
        int tmp; cin >> tmp;
    }
    ll total=0;
    for(int i=1;i<=n;i++) {
        cin >> w[i];
        total += w[i];
    }
    cin >> k >> p;

    vector<ll> fix(n+1), notFix(1);
    for(int i=1;i<=n;i++) {
        fix[i] += fix[i-1];
        if(i==k) continue;
        if(w[i]<=l-total) notFix.push_back(w[i]);
        else fix[i] += w[i];
    }
    sort(notFix.begin(), notFix.end());
    for(int i=1;i<notFix.size();i++) notFix[i] += notFix[i-1];

    if(w[k]>l-total) {
        ll left = p-fix[k-1];
        ll right = l-(p+w[k])-(fix[n]-fix[k]);
        int idx = upper_bound(notFix.begin(), notFix.end(), left) - notFix.begin()-1;
        if(left<0 || right-(notFix.back()-notFix[idx])<0) cout << "NO";
        else cout << "YES";
    } else {
        for(int i=0;i<fix.size();i++) {
            ll left = p-fix[i];
            ll right = l-(p+w[k])-(fix[n]-fix[i]);
            int idx = upper_bound(notFix.begin(), notFix.end(), left) - notFix.begin()-1;
            if(left>=0 && right-(notFix.back()-notFix[idx])>=0) {
                cout << "YES";
                return 0;
            }
        }
        cout << "NO";
    }
}