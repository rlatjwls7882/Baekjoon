#include<bits/stdc++.h>
using namespace std;

const int MAX = 30000;
int _size=1, arr[MAX*3], cnt[MAX*3];

struct vertical_line {
    int x, y1, y2, val;
};

void updateRange(int L, int R, int nodeNum, int nodeL, int nodeR, int val) {
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        cnt[nodeNum] += val;
    } else {
        int mid = (nodeL+nodeR)/2;
        updateRange(L, R, nodeNum*2, nodeL, mid, val);
        updateRange(L, R, nodeNum*2+1, mid+1, nodeR, val);
    }
    if(cnt[nodeNum]) arr[nodeNum] = (nodeR-nodeL+1);
    else if(nodeL==nodeR) arr[nodeNum]=0;
    else arr[nodeNum] = arr[nodeNum*2] + arr[nodeNum*2+1];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    while(_size<MAX) _size<<=1;
    _size<<=1;

    vector<vertical_line> v;
    while(n--) {
        int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
        v.push_back({x1, y1, y2, 1});
        v.push_back({x2, y1, y2, -1});
    }
    sort(v.begin(), v.end(), [](auto a, auto b){ return a.x < b.x; });

    long long total=0, last=0;
    for(auto l:v) {
        total += arr[1]*(l.x-last);
        updateRange(l.y1, l.y2-1, 1, 0, _size/2-1, l.val);
        last = l.x;
    }
    cout << total;
}