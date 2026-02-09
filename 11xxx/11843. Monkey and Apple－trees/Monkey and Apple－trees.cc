#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

struct SparseSeg {
    struct Node {
        int l=-1, r=-1, val=0, lazy=0;
    };
    vector<Node> arr = vector<Node>(1);
    void addNode(int nodeNum) {
        if(arr[nodeNum].l==-1) {
            arr[nodeNum].l=arr.size();
            arr.push_back({});
        }
        if(arr[nodeNum].r==-1) {
            arr[nodeNum].r=arr.size();
            arr.push_back({});
        }
    }
    void updateLazy(int nodeNum, int nodeL, int nodeR) {
        if(arr[nodeNum].lazy) {
            arr[nodeNum].val=nodeR-nodeL+1;
            if(nodeL!=nodeR) {
                addNode(nodeNum);
                arr[arr[nodeNum].l].lazy=arr[nodeNum].lazy;
                arr[arr[nodeNum].r].lazy=arr[nodeNum].lazy;
            }
        }
    }

    void update(int L, int R, int nodeNum, int nodeL, int nodeR) {
        updateLazy(nodeNum, nodeL, nodeR);
        if(R<nodeL || nodeR<L) return;
        if(L<=nodeL && nodeR<=R) {
            arr[nodeNum].lazy=1;
            updateLazy(nodeNum, nodeL, nodeR);
            return;
        }

        int mid=nodeL+nodeR>>1;
        addNode(nodeNum);
        update(L, R, arr[nodeNum].l, nodeL, mid);
        update(L, R, arr[nodeNum].r, mid+1, nodeR);
        int v1 = arr[nodeNum].l!=-1 ? arr[arr[nodeNum].l].val : 0;
        int v2 = arr[nodeNum].r!=-1 ? arr[arr[nodeNum].r].val : 0;
        arr[nodeNum].val=v1+v2;
    }

    int sum(int L, int R, int nodeNum, int nodeL, int nodeR) {
        if(nodeNum==-1 || R<nodeL || nodeR<L) return 0;
        updateLazy(nodeNum, nodeL, nodeR);
        if(L<=nodeL && nodeR<=R) return arr[nodeNum].val;
        int mid = nodeL+nodeR>>1;
        return sum(L, R, arr[nodeNum].l, nodeL, mid)+sum(L, R, arr[nodeNum].r, mid+1, nodeR);
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int m; cin >> m;

    SparseSeg ss;
    int c=0;
    while(m--) {
        int d, x, y; cin >> d >> x >> y;
        if(d==1) {
            c = ss.sum(x+c, y+c, 0, 1, 1e9);
            cout << c << '\n';
        }
        else ss.update(x+c, y+c, 0, 1, 1e9);
    }
}