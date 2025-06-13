#include<bits/stdc++.h>
using namespace std;

const int MAX = 300'001;
const int INF = 0x3f3f3f3f;

int n, m, q, _size, lazy[MAX*4], p[MAX];
vector<vector<int>> group(MAX);

struct query {
    int l, r, a;
};

void init() {
    _size=1;
    while(_size<m) _size<<=1;
    _size<<=1;
    memset(lazy, 0, sizeof lazy);
}

void updateRange(int L, int R, int val, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum] = min(lazy[nodeNum]+val, INF);
    } else {
        int mid = (nodeL+nodeR)/2;
        updateRange(L, R, val, nodeNum*2, nodeL, mid);
        updateRange(L, R, val, nodeNum*2+1, mid+1, nodeR);
    }
}

int findRange(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;

    if(lazy[nodeNum] && nodeL!=nodeR) {
        lazy[nodeNum*2] = min(lazy[nodeNum*2]+lazy[nodeNum], INF);
        lazy[nodeNum*2+1] = min(lazy[nodeNum*2+1]+lazy[nodeNum], INF);
        lazy[nodeNum]=0;
    }

    if(L<=nodeL && nodeR<=R) return lazy[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return min(findRange(L, R, nodeNum*2, nodeL, mid) + findRange(L, R, nodeNum*2+1, mid+1, nodeR), INF);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<m;i++) {
        int o; cin >> o;
        group[o-1].push_back(i);
    }
    for(int i=0;i<n;i++) cin >> p[i];

    cin >> q;
    vector<query> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].l >> queries[i].r >> queries[i].a;
        queries[i].l--;
        queries[i].r--;
    }

    vector<int> left(n), right(n, q);
    while(true) {
        bool chk=false;
        vector<vector<int>> mids(q);
        for(int i=0;i<n;i++) {
            if(left[i]<right[i]) {
                chk=true;
                mids[(left[i]+right[i])/2].push_back(i);
            }
        }
        if(!chk) break;

        init();
        for(int mid=0;mid<q;mid++) {
            if(queries[mid].l <= queries[mid].r) {
                updateRange(queries[mid].l, queries[mid].r, queries[mid].a);
            } else {
                updateRange(queries[mid].l, m-1, queries[mid].a);
                updateRange(0, queries[mid].r, queries[mid].a);
            }

            for(int e : mids[mid]) {
                int sum=0;
                for(int sample : group[e]) {
                    sum = min(sum+findRange(sample, sample), INF);
                }
                if(sum>=p[e]) right[e] = mid;
                else left[e] = mid+1;
            }
        }
    }
    for(int i=0;i<n;i++) {
        if(left[i]==q) cout << "NIE\n";
        else cout << left[i]+1 << '\n';
    }
}