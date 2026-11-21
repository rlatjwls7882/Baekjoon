#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

int n, p, q, w, h;
int bucket[450], arr[MAX];
int sqrtN, cx=1, cy=1, cnt[MAX];
pair<int, int> xToY[MAX], yToX[MAX];

void update(int i, int v) {
    bucket[i/450]+=v;
    arr[i]+=v;
}

int query(int a, int b) {
    int ret=0;
    while(a<=b && a%450) ret+=arr[a++];
    while(a+449<=b) ret+=bucket[a/450], a+=450;
    while(a<=b) ret+=arr[b--];
    return ret;
}

void addX() {
    if(cy<=xToY[cx].first && xToY[cx].first<=cy+h) {
        update(cnt[xToY[cx].second], -1);
        cnt[xToY[cx].second]--;
        update(cnt[xToY[cx].second], 1);
    }
    cx++;
    if(cy<=xToY[cx+w].first && xToY[cx+w].first<=cy+h) {
        update(cnt[xToY[cx+w].second], -1);
        cnt[xToY[cx+w].second]++;
        update(cnt[xToY[cx+w].second], 1);
    }
}

void minusX() {
    if(cy<=xToY[cx+w].first && xToY[cx+w].first<=cy+h) {
        update(cnt[xToY[cx+w].second], -1);
        cnt[xToY[cx+w].second]--;
        update(cnt[xToY[cx+w].second], 1);
    }
    cx--;
    if(cy<=xToY[cx].first && xToY[cx].first<=cy+h) {
        update(cnt[xToY[cx].second], -1);
        cnt[xToY[cx].second]++;
        update(cnt[xToY[cx].second], 1);
    }
}

void addY() {
    if(cx<=yToX[cy].first && yToX[cy].first<=cx+w) {
        update(cnt[yToX[cy].second], -1);
        cnt[yToX[cy].second]--;
        update(cnt[yToX[cy].second], 1);
    }
    cy++;
    if(cx<=yToX[cy+h].first && yToX[cy+h].first<=cx+w) {
        update(cnt[yToX[cy+h].second], -1);
        cnt[yToX[cy+h].second]++;
        update(cnt[yToX[cy+h].second], 1);
    }
}

void minusY() {
    if(cx<=yToX[cy+h].first && yToX[cy+h].first<=cx+w) {
        update(cnt[yToX[cy+h].second], -1);
        cnt[yToX[cy+h].second]--;
        update(cnt[yToX[cy+h].second], 1);
    }
    cy--;
    if(cx<=yToX[cy].first && yToX[cy].first<=cx+w) {
        update(cnt[yToX[cy].second], -1);
        cnt[yToX[cy].second]++;
        update(cnt[yToX[cy].second], 1);
    }
}

struct element {
    int x, y, a, b, idx;
    bool operator<(const element e) const {
        if(x/sqrtN!=e.x/sqrtN) return x/sqrtN<e.x/sqrtN;
        if(y/sqrtN!=e.y/sqrtN) return y/sqrtN<e.y/sqrtN;
        if(y/sqrtN%2) return x<e.x;
        return x>e.x;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> p >> q >> w >> h;
    sqrtN = sqrt(n);

    vector<int> colors;
    vector<tuple<int, int, int>> v;
    while(p--) {
        int x, y, c; cin >> x >> y >> c;
        colors.push_back(c);
        v.push_back({x, y, c});
    }
    sort(colors.begin(), colors.end());
    colors.erase(unique(colors.begin(), colors.end()), colors.end());
    for(auto [x, y, c]:v) {
        c = lower_bound(colors.begin(), colors.end(), c)-colors.begin()+1;
        xToY[x] = {y, c};
        yToX[y] = {x, c};
    }
    bucket[0]=arr[0]=colors.size();

    vector<element> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].x >> queries[i].y >> queries[i].a >> queries[i].b;
        queries[i].idx=i;
    }
    sort(queries.begin(), queries.end());

    for(int i=1;i<=h+1;i++) {
        if(cx<=yToX[i].first && yToX[i].first<=cx+w) {
            update(cnt[yToX[i].second], -1);
            cnt[yToX[i].second]++;
            update(cnt[yToX[i].second], 1);
        }
    }
    vector<int> res(q);
    for(auto [x, y, a, b, idx]:queries) {
        while(cx<x) addX();
        while(cy<y) addY();
        while(cx>x) minusX();
        while(cy>y) minusY();
        res[idx] = query(a, b);
    }
    for(int e:res) cout << e << '\n';
}