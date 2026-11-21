#include<bits/stdc++.h>
using namespace std;

const int INF = 1'000'000'001;
const int MAX = 100'001;

/** 
 * subTreeCnt[i] : i에서 시작하는 부트리의 크기
 * songToSegIdx[i] : i번 노래가 할당된 세그먼트 트리 위치
 * singer[i] : i번 노래를 부른 가수
 */
int n, k, j, cnt;
int subTreeCnt[MAX], songToSegIdx[MAX], singer[MAX], _size;
long long lazy[MAX*4];
vector<vector<int>> conn(MAX), singerToSong(MAX);

struct query {
    int t, p, s;
    bool operator<(const query q) const {
        return t < q.t;
    }
};

struct mid {
    int val, queryIdx;
    bool operator<(const mid m) const {
        return val < m.val;
    }
};

int dfs(int cur) {
    subTreeCnt[cur]=1;
    songToSegIdx[cur] = cnt++;
    for(int next:conn[cur]) {
        subTreeCnt[cur] += dfs(next);
    }
    return subTreeCnt[cur];
}

void init() {
    _size=1;
    while(_size<n) _size<<=1;
    _size<<=1;
    dfs(0);
}

void updateRange(int L, int R, long long val, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum] += val;
    } else {
        int mid = (nodeL+nodeR)/2;
        updateRange(L, R, val, nodeNum*2, nodeL, mid);
        updateRange(L, R, val, nodeNum*2+1, mid+1, nodeR);
    }
}

long long pointQuery(int pos) {
    pos += _size/2;

    long long ret=0;
    while(pos) {
        ret += lazy[pos];
        pos>>=1;
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k >> j;
    for(int i=1;i<n;i++) {
        int parent; cin >> parent;
        conn[parent-1].push_back(i);
    }
    for(int i=0;i<n;i++) {
        cin >> singer[i];
        singer[i]--;
        singerToSong[singer[i]].push_back(i);
    }
    init();

    vector<query> queries(k);
    for(int i=0;i<k;i++) {
        cin >> queries[i].t >> queries[i].p >> queries[i].s;
        queries[i].p--;
    }
    sort(queries.begin(), queries.end());

    vector<int> left(n, 1), right(n, INF), uniq;
    for(int i=0;i<n;i++) {
        if(singerToSong[singer[i]][0]==i) {
            uniq.push_back(i);
        }
    }
    while(true) {
        vector<mid> mids;
        for(int i : uniq) {
            if(left[i]<right[i]) {
                mids.push_back({(left[i]+right[i])/2, i});
            }
        }
        if(mids.empty()) break;
        sort(mids.begin(), mids.end());

        memset(lazy, 0, sizeof lazy);

        int idx=0;
        for(int i=0;i<k;i++) {
            while(idx<mids.size() && (i>=k-1 || mids[idx].val<queries[i].t)) {
                int queryIdx = mids[idx].queryIdx;
                int midVal = mids[idx].val;
                if(i<k && queries[i].t<=midVal) {
                    updateRange(songToSegIdx[queries[i].p], songToSegIdx[queries[i].p] + subTreeCnt[queries[i].p]-1, queries[i].s/subTreeCnt[queries[i].p]);
                    i++;
                }

                long long sum=0;
                long long goal = j * singerToSong[singer[queryIdx]].size();
                for(int song : singerToSong[singer[queryIdx]]) {
                    sum += pointQuery(songToSegIdx[song]);
                    if(sum>goal) break;
                }

                if(sum>goal) right[queryIdx] = midVal;
                else left[queryIdx] = midVal+1;
                idx++;
            }
            if(i<k) updateRange(songToSegIdx[queries[i].p], songToSegIdx[queries[i].p] + subTreeCnt[queries[i].p]-1, queries[i].s/subTreeCnt[queries[i].p]);
        }
    }
    for(int i=0;i<n;i++) {
        int res = left[singerToSong[singer[i]][0]];
        cout << (res==INF ? -1 : res) << '\n';
    }
}