#include<bits/stdc++.h>
using namespace std;

int _size=1;
long long arr[300000] = {0, };

struct Query2 {
    int k, i, j, idx;
};

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

void update(int i, int v) {
    i += _size/2;
    arr[i]=v;
    while(i>1) {
        i/=2;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

long long search(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return search(L, R, nodeNum*2, nodeL, mid) + search(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    while(_size<N) {
        _size<<=1;
    }
    _size<<=1;

    for(int i=_size/2;i<_size/2+N;i++) {
        cin >> arr[i];
    }
    construct();

    int M; cin >> M;
    vector<pair<int, int>> query1;
    vector<Query2> query2;
    while(M-->0) {
        int x; cin >> x;
        if(x==1) {
            int i, v; cin >> i >> v;
            query1.push_back({i, v});
        } else {
            int k, i, j; cin >> k >> i >> j;
            query2.push_back({k, i, j, (int)query2.size()});
        }
    }
    sort(query2.begin(), query2.end(), [](Query2 a, Query2 b) {return a.k < b.k;});

    int cnt=0;
    vector<pair<long long, int>> res;
    for(int i=0;i<query2.size();i++) {
        while(query2[i].k>cnt) {
            update(query1[cnt].first-1, query1[cnt].second);
            cnt++;
        }
        res.push_back({search(query2[i].i-1, query2[i].j-1, 1, 0, _size/2-1), query2[i].idx});
    }

    sort(res.begin(), res.end(), [](pair<long long, int> a, pair<long long, int> b) {return a.second < b.second;});
    for(int i=0;i<res.size();i++) {
        cout << res[i].first << '\n';
    }
}