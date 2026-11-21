#include<bits/stdc++.h>
using namespace std;

int a[100'000];

int getMinMax(int l, int r) {
    int minVal=100'000, maxVal=0;
    for(int i=l;i<=r;i++) {
        minVal = min(minVal, a[i]);
        maxVal = max(maxVal, a[i]);
    }
    return minVal+maxVal;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    for(int sz=1;sz*sz<=n;sz++) {
        if(n%sz==0) {
            vector<int> v;
            for(int i=0;i<n;i+=sz) {
                v.push_back(getMinMax(i, i+sz-1));
                if(v.front()!=v.back()) break;
            }
            if(v.front()==v.back()) {
                cout << 1;
                return 0;
            }

            if(sz!=1) {
                v = {};
                for(int i=0;i<n;i+=n/sz) {
                    v.push_back(getMinMax(i, i+n/sz-1));
                    if(v.front()!=v.back()) break;
                }
                if(v.front()==v.back()) {
                    cout << 1;
                    return 0;
                }
            }
        }
    }
    cout << 0;
}