#include<bits/stdc++.h>
#define MAX 300000

using namespace std;

int _size=1;
int odd[MAX] = {0, };
int even[MAX] = {0, };

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        odd[i] = odd[i*2]+odd[i*2+1];
        even[i] = even[i*2]+even[i*2+1];
    }
}

void update(int idx, int val) {
    idx+=_size/2;
    if(val%2==0&&even[idx]==1 || val%2==1&&odd[idx]==1) return;
    
    even[idx]=odd[idx]=0;
    if(val%2==0) even[idx]=1;
    else odd[idx]=1;
    while(idx>1) {
        idx/=2;
        even[idx] = even[idx*2]+even[idx*2+1];
        odd[idx] = odd[idx*2]+odd[idx*2+1];
    }
}

int findEven(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return even[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return findEven(L, R, nodeNum*2, nodeL, mid) + findEven(L, R, nodeNum*2+1, mid+1, nodeR);
}

int findOdd(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return odd[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return findOdd(L, R, nodeNum*2, nodeL, mid) + findOdd(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    while(_size<=N) {
        _size*=2;
    }
    _size*=2;

    for(int i=_size/2;i<_size/2+N;i++) {
        int val; cin >> val;
        if(val%2==0) even[i]++;
        else odd[i]++;
    }
    construct();

    int M; cin >> M;
    while(M-->0) {
        int a, b, c; cin >> a >> b >> c;
        if(a==1) {
            update(b-1, c);
        } else if(a==2) {
            cout << findEven(b-1, c-1, 1, 0, _size/2-1) << '\n';
        } else {
            cout << findOdd(b-1, c-1, 1, 0, _size/2-1) << '\n';
        }
    }
}