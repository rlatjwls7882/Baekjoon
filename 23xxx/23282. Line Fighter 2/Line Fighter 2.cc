#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef pair<ll, ll> P;

struct element {
    ll a, b;
    double x=INT_MIN;
};

double meetX(element a, element b) {
    return (double)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    vector<P> v(n);
    for(int i=0;i<n;i++) cin >> v[i].first >> v[i].second;

    sort(v.begin(), v.end(), greater<P>());
    vector<element> minStk;
    for(int i=0;i<n;i++) {
        element cur = {v[i].first, v[i].second};
        while(!minStk.empty() && minStk.back().a==cur.a) minStk.pop_back();
        while(!minStk.empty()) {
            cur.x = meetX(minStk.back(), cur);
            if(cur.x>minStk.back().x) break;
            minStk.pop_back();
        }
        minStk.push_back(cur);
    }

    sort(v.begin(), v.end());
    vector<element> maxStk;
    for(int i=0;i<n;i++) {
        element cur = {v[i].first, v[i].second};
        while(!maxStk.empty() && maxStk.back().a==cur.a) maxStk.pop_back();
        while(!maxStk.empty()) {
            cur.x = meetX(maxStk.back(), cur);
            if(cur.x>maxStk.back().x) break;
            maxStk.pop_back();
        }
        maxStk.push_back(cur);
    }

    cout << fixed << setprecision(4);
    while(q--) {
        double x; int a; cin >> x >> a;
        if(a==1) {
            int left=0, right=maxStk.size()-1;
            while(left<right) {
                int mid = left+right+1>>1;
                if(x<maxStk[mid].x) right=mid-1;
                else left=mid;
            }
            cout << maxStk[left].a*x+maxStk[left].b << '\n';
        } else {
            int left=0, right=minStk.size()-1;
            while(left<right) {
                int mid = left+right+1>>1;
                if(x<minStk[mid].x) right=mid-1;
                else left=mid;
            }
            cout << minStk[left].a*x+minStk[left].b << '\n';
        }
    }
}