#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const int MAX = 100'001;

ll maxH[MAX], minH[MAX], maxV[MAX], minV[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int r, c, n; cin >> r >> c >> n;

    int idx=0;
    ll maxSize=0;
    fill(minH, minH+MAX, MAX);
    fill(minV, minV+MAX, MAX);
    while(n--) {
        ll a, v, h; cin >> a >> v >> h;
        minH[a] = min(minH[a], h);
        maxH[a] = max(maxH[a], h);
        minV[a] = min(minV[a], v);
        maxV[a] = max(maxV[a], v);

        ll size = (maxH[a]-minH[a]+1)*(maxV[a]-minV[a]+1);
        if(maxSize<size || maxSize==size && idx>a) {
            maxSize = size;
            idx=a;
        }
    }
    cout << idx << ' ' << maxSize;
}