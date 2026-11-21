#include<bits/stdc++.h>
#define MAX 262144
using namespace std;

int _size=1;
int arr[MAX];

int _find(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return _find(L, R, nodeNum*2, nodeL, mid) + _find(L, R, nodeNum*2+1, mid+1, nodeR);
}

void update(int nodeNum) {
    arr[nodeNum]++;
    while(nodeNum>1) {
        nodeNum/=2;
        arr[nodeNum] = arr[nodeNum*2]+arr[nodeNum*2+1];
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    vector<vector<int>> x(n);
    for(int i=0;i<2*n;i++) {
        int tmp; cin >> tmp;
        x[tmp-1].push_back(i);
    }

    vector<pair<int, int>> v;
    for(int i=0;i<n;i++) v.push_back({x[i][0], x[i][1]});
    sort(v.begin(), v.end());

    while(_size<n*2) _size<<=1;
    _size<<=1;

    int cnt=0;
    for(int i=0;i<n;i++) {
        cnt += _find(v[i].first, v[i].second, 1, 0, _size/2-1);
        update(_size/2+v[i].second);
    }
    cout << cnt;
}