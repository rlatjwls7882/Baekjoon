#include<bits/stdc++.h>
using namespace std;

struct Line {
    int pos, c;
    bool operator<(const Line a) const {
        if(this->pos==a.pos) return this->c < a.c;
        return this->pos < a.pos;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<Line> v;
    while(N-->0) {
        int s, e; cin >> s >> e;
        v.push_back({s, 1});
        v.push_back({e, -1});
    }
    sort(v.begin(), v.end());
    
    int maxLen=0, len=0;
    for(Line l:v) {
        len += l.c;
        maxLen = max(maxLen, len);
    }
    cout << maxLen;
}