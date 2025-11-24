#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    vector<long long> v;
    for(long long i=1;v.size()<727'272;i*=7) {
        int sz=v.size();
        v.push_back(i);
        for(int j=0;j<sz;j++) v.push_back(v[j]+i);
        v.push_back(2*i);
        for(int j=0;j<sz;j++) v.push_back(v[j]+2*i);
    }

    long long c; cin >> c;
    cout << lower_bound(v.begin(), v.end(), c)-v.begin()+1;
}