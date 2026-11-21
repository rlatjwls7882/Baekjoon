#include<bits/stdc++.h>

using namespace std;
typedef pair<int, int> P;

bool comp(P a, P b) {
    if(a.first==b.first) return a.second<b.second;
    return a.first<b.first;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<P> v;
    while(N-->0) {
        string a, b; cin >> a >> b;
        v.push_back(P(stoi(a.substr(0, 2)+a.substr(3, 2)+a.substr(6, 2)+a.substr(9, 3)), +1));
        v.push_back(P(stoi(b.substr(0, 2)+b.substr(3, 2)+b.substr(6, 2)+b.substr(9, 3)), -1));
    }
    sort(v.begin(), v.end(), comp);

    int _max=0, cur=0;
    for(P val:v) {
        cur += val.second;
        _max = max(_max, cur);
    }
    cout << _max;
}