#include<bits/stdc++.h>
using namespace std;

const int MAX = 2'000'000;
const int MAX_LEN = MAX*3;
int _size=1, cnt[MAX_LEN];

void update(int nodeNum) {
    while(nodeNum>1) {
        nodeNum/=2;
        cnt[nodeNum] = cnt[nodeNum*2]+cnt[nodeNum*2+1];
    }
}

int search(int nodeNum, int nodeL, int nodeR, int pos) {
    if(nodeL==nodeR) {
        cnt[nodeNum]--;
        update(nodeNum);
        return nodeL;
    }
    int mid = (nodeL+nodeR)/2;
    if(pos<=cnt[nodeNum*2]) return search(nodeNum*2, nodeL, mid, pos);
    return search(nodeNum*2+1, mid+1, nodeR, pos-cnt[nodeNum*2]);
}

void insert(int val) {
    int nodeNum = val+_size/2;
    cnt[nodeNum]++;
    update(nodeNum);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(_size<MAX) _size<<=1;
    _size<<=1;

    while(n--) {
        int q, x; cin >> q >> x;
        if(q==1) {
            insert(x);
        } else {
            cout << search(1, 0, _size/2-1, x) << '\n';
        }
    }
}