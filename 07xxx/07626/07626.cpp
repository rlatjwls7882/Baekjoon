#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 400000;

struct pos {
    int x, y1, y2, val;
};

int n;
vector<pos> v;
vector<int> yList;
int _size, yLen[MAX*4], arr[MAX*4], cnt[MAX*4];

void construct() {
    cin >> n;
    for(int i=0;i<n;i++) {
        int x1, x2, y1, y2; cin >> x1 >> x2 >> y1 >> y2;
        v.push_back({x1, y1, y2, 1});
        v.push_back({x2, y1, y2, -1});
        yList.push_back(y1);
        yList.push_back(y2);
    }
    yList.erase(unique(yList.begin(), yList.end()), yList.end());
    sort(yList.begin(), yList.end());
    sort(v.begin(), v.end(), [](pos a, pos b){ return a.x < b.x; });

    _size=1;
    while(_size<MAX) _size<<=1;
    _size<<=1;
    for(int i=1;i<yList.size();i++) yLen[i-1+_size/2] = yList[i]-yList[i-1];
    for(int i=_size/2-1;i>0;i--) yLen[i] = yLen[i*2] + yLen[i*2+1];
}

void updateRange(int L, int R, int nodeNum, int nodeL, int nodeR, int val) {
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        cnt[nodeNum] += val;
    } else {
        int mid = (nodeL+nodeR)/2;
        updateRange(L, R, nodeNum*2, nodeL, mid, val);
        updateRange(L, R, nodeNum*2+1, mid+1, nodeR, val);
    }
    if(cnt[nodeNum]) arr[nodeNum] = yLen[nodeNum];
    else if(nodeL==nodeR) arr[nodeNum] = 0;
    else arr[nodeNum] = arr[nodeNum*2] + arr[nodeNum*2+1];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    construct();

    long long total=0, last=0;
    for(pos p : v) {
        p.y1 = lower_bound(yList.begin(), yList.end(), p.y1) - yList.begin();
        p.y2 = lower_bound(yList.begin(), yList.end(), p.y2) - yList.begin();
        total += (p.x-last)*arr[1];
        updateRange(p.y1, p.y2-1, 1, 0, _size/2-1, p.val);
        last = p.x;
    }
    cout << total;
}