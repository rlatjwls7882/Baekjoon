#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int n, m, _size=1, c[MAX], arr[MAX*4], increasingCnt[MAX], decreasingCnt[MAX];
vector<int> vals;

int search(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = nodeL+nodeR>>1;
    return max(search(L, R, nodeNum*2, nodeL, mid), search(L, R, nodeNum*2+1, mid+1, nodeR));
}

void update(int idx, int val) {
    idx += _size/2;
    arr[idx] = max(arr[idx], val);
    while(idx>1) {
        idx>>=1;
        arr[idx] = max(arr[idx*2], arr[idx*2+1]);
    }
}

void construct(int x) {
    memset(arr, 0, sizeof arr);
    for(int i=0;i<n;i++) {
        increasingCnt[i] = search(0, upper_bound(vals.begin(), vals.end(), c[i]+x)-vals.begin()-1)+1;
        update(lower_bound(vals.begin(), vals.end(), c[i])-vals.begin(), increasingCnt[i]);
    }

    memset(arr, 0, sizeof arr);
    for(int i=n-1;i>=0;i--) {
        decreasingCnt[i] = search(0, upper_bound(vals.begin(), vals.end(), c[i]+x)-vals.begin()-1)+1;
        update(lower_bound(vals.begin(), vals.end(), c[i])-vals.begin(), decreasingCnt[i]);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) {
        cin >> c[i];
        vals.push_back(c[i]);
    }
    sort(vals.begin(), vals.end());
    vals.erase(unique(vals.begin(), vals.end()), vals.end());
    while(_size<vals.size()) _size<<=1;
    _size<<=1;

    int left=0, right=1e9;
    while(left<right) {
        int mid = left+right>>1;
        construct(mid);

        bool chk=false;
        for(int i=0;i<n;i++) {
            if(n-(increasingCnt[i]+decreasingCnt[i]-1)<=m) {
                chk=true;
                break;
            }
        }
        if(chk) right=mid;
        else left=mid+1;
    }
    cout << left;
}