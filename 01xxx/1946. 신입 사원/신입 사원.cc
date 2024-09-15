#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;

    while(T-->0) {
        int N; cin >> N;
        vector<pair<int, int>> v;

        while(N-->0) {
            int a, b; cin >> a >> b;
            v.push_back(make_pair(a, b));
        }
        sort(v.begin(), v.end());

        int cnt=1, max2=v[0].second;
        for(P pair:v) {
            if(max2>pair.second) {
                cnt++;
                max2 = min(max2, pair.second);
            }
        }
        cout << cnt << '\n';
    }
}