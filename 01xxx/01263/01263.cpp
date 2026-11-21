#include<bits/stdc++.h>
using namespace std;

struct work {
    int T, S;
    bool operator<(const work a) const {
        return S < a.S;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    vector<work> v(N);
    for(int i=0;i<N;i++) cin >> v[i].T >> v[i].S;
    sort(v.begin(), v.end());

    int curT=0, minDiff=INT_MAX;
    for(int i=0;i<N;i++) {
        curT += v[i].T;
        if(v[i].S<curT) {
            cout << -1;
            return 0;
        }
        minDiff = min(minDiff, v[i].S-curT);
    }
    cout << minDiff;
}