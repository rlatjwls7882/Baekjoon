#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1e9+7;
const int MAX = 400'000*3;
typedef pair<int, int> P;
long long _size=1, arr[MAX];

bool comp(P a, P b) {
    return a.second > b.second;
}

long long getCnt(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return getCnt(L, R, nodeNum*2, nodeL, mid) + getCnt(L, R, nodeNum*2+1, mid+1, nodeR);
}

void update(int x) {
    int nodeNum = _size/2+x;
    arr[nodeNum]++;
    while(nodeNum>1) {
        nodeNum>>=1;
        arr[nodeNum] = arr[nodeNum*2] + arr[nodeNum*2+1];
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<P> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].first >> v[i].second;
        v[i].first += 200'000;
    }
    sort(v.begin(), v.end(), comp);

    while(_size<400'000) _size<<=1;
    _size<<=1;

    vector<P> tmp; // y가 같은 별들 임시로 모아둘 장소
    long long totalCnt=0;
    for(int i=0;i<n;i++) {
        while(!tmp.empty() && tmp.back().second>v[i].second) {
            update(tmp.back().first);
            tmp.pop_back();
        }
        totalCnt += getCnt(0, v[i].first-1, 1, 0, _size/2-1) * getCnt(v[i].first+1, 400'000, 1, 0, _size/2-1);
        totalCnt %= MOD;
        tmp.push_back(v[i]);
    }
    cout << totalCnt;
}