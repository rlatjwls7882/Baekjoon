#include<bits/stdc++.h>
using namespace std;

struct tap {
    long long t, a, b;
    bool operator<(const tap t) const {
        return this->t < t.t;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int k; cin >> k;

    vector<tap> v(k);
    long long minFlow=0, maxFlow=0, commonVal=0;
    for(int i=0;i<k;i++) {
        cin >> v[i].t >> v[i].a >> v[i].b;
        minFlow += v[i].a;
        maxFlow += v[i].b;
        commonVal += v[i].a*v[i].t;
    }
    sort(v.begin(), v.end());

    int r; cin >> r;
    while(r-->0) {
        long long taf, phi; cin >> taf >> phi;

        if(!(minFlow<=phi && phi<=maxFlow)) {
            cout << "no\n";
            continue;
        }

        // (x1*t1 + x2*t2 + ... + xn*tn) / (x1+x2+...+xn) == taf
        // (x1*t1 + x2*t2 + ... + xn*tn) == taf * phi
        // (a1*t1 + a2*t2 + ... + an*tn) <= (x1*t1 + x2*t2 + ... + xn*tn) <= (b1*t1 + b2*t2 + ... + bn*tn)
        // minVal <= taf * phi <= maxVal
        long long minVal = commonVal, maxVal = commonVal;
        long long remain = phi - minFlow;
        for(int i=0;i<k && remain;i++) {
            minVal += min(remain, v[i].b-v[i].a)*v[i].t;
            remain -= min(remain, v[i].b-v[i].a);
        }

        remain = phi - minFlow;
        for(int i=k-1;i>=0 && remain;i--) {
            maxVal += min(remain, v[i].b-v[i].a)*v[i].t;
            remain -= min(remain, v[i].b-v[i].a);
        }

        if(minVal<=taf*phi && taf*phi<=maxVal) cout << "yes\n";
        else cout << "no\n";
    }
}