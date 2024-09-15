#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

map<int, int> firstAppear;

bool comp(P a, P b) {
    if(a.second!=b.second) return a.second>b.second;
    return firstAppear[a.first]<firstAppear[b.first];
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, C; cin >> N >> C;

    map<int, int> m;
    for(int i=0;i<N;i++) {
        int a; cin >> a;
        if(!m.count(a)) firstAppear[a]=i;
        m[a]++;
    }

    vector<P> v(m.begin(), m.end());
    sort(v.begin(), v.end(), comp);

    for(P val:v) {
        while(val.second-->0) {
            cout << val.first << ' ';
        }
    }
}