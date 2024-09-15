#include<bits/stdc++.h>
#define MAX 300000
#define INF 1000000001

using namespace std;

int _size=1;
int idx[MAX];
int arr[MAX];

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        if(arr[i*2]<=arr[i*2+1]) {
            arr[i]=arr[i*2];
            idx[i]=idx[i*2];
        } else {
            arr[i]=arr[i*2+1];
            idx[i]=idx[i*2+1];
        }
    }
}

void update(int i, int val) {
    i+=_size/2;
    arr[i]=val;
    while(i>1) {
        i/=2;
        if(arr[i*2]<=arr[i*2+1]) {
            arr[i]=arr[i*2];
            idx[i]=idx[i*2];
        } else {
            arr[i]=arr[i*2+1];
            idx[i]=idx[i*2+1];
        }
    }
}

pair<int, int> findMin(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return make_pair(INF, 0);
    if(L<=nodeL && nodeR<=R) return make_pair(arr[nodeNum], idx[nodeNum]);
    
    int mid = (nodeL+nodeR)/2;
    pair<int, int> a = findMin(L, R, nodeNum*2, nodeL, mid);
    pair<int, int> b = findMin(L, R, nodeNum*2+1, mid+1, nodeR);
    if(a.first<b.first || a.first==b.first&&a.second<b.second) return a;
    else return b;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    while(_size<=N) {
        _size*=2;
    }
    _size*=2;

    fill(arr, arr+_size, INF);
    for(int i=_size/2;i<_size/2+N;i++) {
        cin >> arr[i];
        idx[i]=i-_size/2+1;
    }
    construct();

    int M; cin >> M;
    while(M-->0) {
        int a, b, c; cin >> a >> b >> c;
        if(a==1) {
            update(b-1, c);
        } else {
            cout << findMin(b-1, c-1, 1, 0, _size/2-1).second << '\n';
        }
    }
}