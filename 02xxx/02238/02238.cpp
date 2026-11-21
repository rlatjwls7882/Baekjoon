#include<bits/stdc++.h>
using namespace std;
typedef pair<string, int> P;


int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int U, N; cin >> U >> N;

    int cnt[10001] = {0, };
    vector<P> v;
    for(int i=0;i<N;i++) {
        string s; int p; cin >> s >> p;
        v.push_back(P(s, p));
        cnt[p]++;
    }

    int idx=0;
    for(int i=1;i<N;i++) {
        if(cnt[v[idx].second]>cnt[v[i].second] || cnt[v[idx].second]==cnt[v[i].second] && v[idx].second>v[i].second) {
            idx=i;
        }
    }
    cout << v[idx].first << ' ' << v[idx].second;
}