#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<vector<ll>> type;
    for(int i=0;i<=N;i++) {
        type.push_back(vector<ll>());
    }

    for(int i=0;i<N;i++) {
        ll a; int b; cin >> a >> b;
        type[b].push_back(a);
    }

    ll sum=0;
    for(int i=1;i<=N;i++) {
        int size = type[i].size();
        if(size>=2) {
            sort(type[i].begin(), type[i].end());
            sum += type[i][1]-type[i][0] + type[i][size-1]-type[i][size-2];
            for(int j=1;j<size-1;j++) {
                sum += min(type[i][j]-type[i][j-1], type[i][j+1]-type[i][j]);
            }
        }
    }
    cout << sum;
}