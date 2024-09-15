#include<bits/stdc++.h>
#define MAX 300000
#define INF 1000000000

using namespace std;

int _size=1;
int arr[MAX];
int idx[MAX];

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
    i += _size/2;
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
        int a; cin >> a;
        if(a==2) {
            cout << idx[1] << '\n';
        } else {
            int b, c; cin >> b >> c;
            update(b-1, c);
        }
    }
}