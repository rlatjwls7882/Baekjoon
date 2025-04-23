#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;

int _size=1, arr[MAX*4], lazy[MAX*4];

struct egg {
    int x, y;
};

struct rect {
    int x, y1, y2, val;
};

void updateLazy(int nodeNum, int nodeL, int nodeR) {
    if(lazy[nodeNum]) {
        arr[nodeNum] += lazy[nodeNum];
        if(nodeL!=nodeR) {
            lazy[nodeNum*2] += lazy[nodeNum];
            lazy[nodeNum*2+1] += lazy[nodeNum];
        }
        lazy[nodeNum]=0;
    }
}

void updateRange(int L, int R, int nodeNum, int nodeL, int nodeR, int val) {
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum] += val;
        return;
    }
    int mid = (nodeL+nodeR)/2;
    updateRange(L, R, nodeNum*2, nodeL, mid, val);
    updateRange(L, R, nodeNum*2+1, mid+1, nodeR, val);
}

int search(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeNum, nodeL, nodeR);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return search(L, R, nodeNum*2, nodeL, mid) + search(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(_size<MAX) _size<<=1;
    _size<<=1;

    int t; cin >> t;
    while(t--) {
        int n, m; cin >> n >> m;
        vector<egg> eggs(n);
        for(int i=0;i<n;i++) cin >> eggs[i].x >> eggs[i].y;
        sort(eggs.begin(), eggs.end(), [](egg a, egg b) { return a.x < b.x; });

        vector<rect> rects;
        for(int i=0;i<m;i++) {
            int x1, x2, y1, y2; cin >> x1 >> x2 >> y1 >> y2;
            rects.push_back({x1, y1, y2, 1});
            rects.push_back({x2+1, y1, y2, -1});
        }
        sort(rects.begin(), rects.end(), [](rect a, rect b) { return a.x < b.x; });

        int eggIdx=0, total=0;
        for(rect r : rects) {
            while(eggIdx<n && eggs[eggIdx].x<r.x) {
                total += search(eggs[eggIdx].y, eggs[eggIdx].y);
                eggIdx++;
            }
            updateRange(r.y1, r.y2, 1, 0, _size/2-1, r.val);
        }
        cout << total << '\n';
    }
}