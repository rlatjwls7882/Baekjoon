#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 300'000;
int _size, arrMin[MAX], arrMax[MAX];

void init(int n) {
    _size=1;
    while(_size<n) _size<<=1;
    _size<<=1;
    fill(arrMin, arrMin+_size, INF);
    memset(arrMax, 0, sizeof arrMax);
    for(int i=_size/2;i<_size/2+n;i++) {
        arrMin[i] = i-_size/2;
        arrMax[i] = i-_size/2;
    }
    for(int i=_size/2-1;i>0;i--) {
        arrMin[i] = min(arrMin[i*2], arrMin[i*2+1]);
        arrMax[i] = max(arrMax[i*2], arrMax[i*2+1]);
    }
}

void update(int a, int b) {
    a += _size/2;
    b += _size/2;
    swap(arrMin[a], arrMin[b]);
    swap(arrMax[a], arrMax[b]);

    while(a>1) {
        a>>=1;
        arrMin[a] = min(arrMin[a*2], arrMin[a*2+1]);
        arrMax[a] = max(arrMax[a*2], arrMax[a*2+1]);
    }
    while(b>1) {
        b>>=1;
        arrMin[b] = min(arrMin[b*2], arrMin[b*2+1]);
        arrMax[b] = max(arrMax[b*2], arrMax[b*2+1]);
    }
}

int findMax(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arrMax[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return max(findMax(L, R, nodeNum*2, nodeL, mid), findMax(L, R, nodeNum*2+1, mid+1, nodeR));
}

int findMin(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return INF;
    if(L<=nodeL && nodeR<=R) return arrMin[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return min(findMin(L, R, nodeNum*2, nodeL, mid), findMin(L, R, nodeNum*2+1, mid+1, nodeR));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, k; cin >> n >> k;
        init(n);
        while(k--) {
            int q, a, b; cin >> q >> a >> b;
            if(q==0) {
                update(a, b);
            } else {
                if(a==findMin(a, b, 1, 0, _size/2-1) && b==findMax(a, b, 1, 0, _size/2-1)) cout << "YES\n";
                else cout << "NO\n";
            }
        }
    }
}