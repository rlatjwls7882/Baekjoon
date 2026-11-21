#include<bits/stdc++.h>
using namespace std;

typedef pair<int, int> P;

int res[1'000'000][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        vector<P> v;
        for(int i=0;i<n;i++) {
            int a; cin >> a;
            v.push_back({a, i});
        }
        sort(v.begin(), v.end(), greater<P>());

        long long sum=0;
        for(int i=0;i<(n-1)/2;i++) {
            sum += v[i].first;
            res[v[i].second][0] = v[i].first;
            res[v[i].second][1] = 0;
        }

        bool equal = n%2==0;
        for(int i=(n-1)/2;i<n;i++) {
            if(equal && v[i].first%2==0) {
                res[v[i].second][0] = res[v[i].second][1] = v[i].first/2;
                equal=false;
            } else {
                res[v[i].second][0] = (v[i].first-1)/2;
                res[v[i].second][1] = v[i].first - (v[i].first-1)/2;
                sum += res[v[i].second][0] - res[v[i].second][1];
            }
        }
        if(sum>0) {
            cout << "YES\n";
            for(int i=0;i<2;i++) {
                for(int j=0;j<n;j++) cout << res[j][i] << ' ';
                cout << '\n';
            }
        } else {
            cout << "NO\n";
        }
    }
}