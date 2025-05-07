#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;

int _size;
vector<int> arr[MAX*4];

void init() {
    int n; cin >> n;
    _size=1;
    while(_size<n) _size<<=1;
    _size<<=1;

    for(int i=0;i<n;i++) {
        int A; cin >> A;
        arr[_size/2+i].push_back(A);
    }

    for(int i=_size/2-1;i>0;i--) {
        int l=0, r=0;
        while(l<arr[i*2].size() || r<arr[i*2+1].size()) {
            if(l==arr[i*2].size() || r<arr[i*2+1].size() && arr[i*2][l] > arr[i*2+1][r]) {
                arr[i].push_back(arr[i*2+1][r++]);
            } else {
                arr[i].push_back(arr[i*2][l++]);
            }
        }
    }
}

int getCnt(int L, int R, int nodeNum, int nodeL, int nodeR, int val) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) {
        return arr[nodeNum].end() - upper_bound(arr[nodeNum].begin(), arr[nodeNum].end(), val);
    }
    int mid = (nodeL+nodeR)/2;
    return getCnt(L, R, nodeNum*2, nodeL, mid, val) + getCnt(L, R, nodeNum*2+1, mid+1, nodeR, val);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    init();

    int lastAns=0;
    int m; cin >> m;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        int i = a^lastAns;
        int j = b^lastAns;
        int k = c^lastAns;
        lastAns = getCnt(i-1, j-1, 1, 0, _size/2-1, k);
        cout << lastAns << '\n';
    }
}