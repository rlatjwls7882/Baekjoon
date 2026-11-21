#include<bits/stdc++.h>

using namespace std;
typedef pair<int, int> p;

bool comp(p a, p b) {
    if(a.first==b.first) return a.second<b.second;
    return a.first<b.first;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<p> v;
    for(int i=0;i<N;i++) {
        int s, e; cin >> s >> e;
        v.push_back(p(s, +1));
        v.push_back(p(e, -1));
    }
    sort(v.begin(), v.end(), comp);

    int _max=0, cur=0;
    for(p val:v) {
        cur += val.second;
        _max = max(_max, cur);
    }
    cout << _max;
}