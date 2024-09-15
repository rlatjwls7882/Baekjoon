#include<bits/stdc++.h>
#define MAX 300000

using namespace std;

int _size=1;
int arr[MAX] = {0, };
bool isZero[MAX] = {false, };

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = arr[i*2]+arr[i*2+1];
        if(isZero[i*2] || isZero[i*2+1]) isZero[i]=true;
        else isZero[i]=false;
    }
}

void update(int i, int val) {
    i+=_size/2;
    if(val==0) {
        isZero[i]=true;
        arr[i]=0;
    } else {
        isZero[i]=false;
        if(val<0) {
            arr[i]=1;
        } else {
            arr[i]=0;
        }
    }
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
        if(isZero[i*2] || isZero[i*2+1]) isZero[i]=true;
        else isZero[i]=false;
    }
}

int minusCnt(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return minusCnt(L, R, nodeNum*2, nodeL, mid)+minusCnt(L, R, nodeNum*2+1, mid+1, nodeR)%2;
}

bool findZero(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return false;
    if(L<=nodeL && nodeR<=R) return isZero[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return findZero(L, R, nodeNum*2, nodeL, mid)+findZero(L, R, nodeNum*2+1, mid+1, nodeR)%2;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        _size=1;
        memset(&arr, 0, sizeof(arr));
        memset(&isZero, false, sizeof(isZero));

        int N, K; cin >> N >> K;
        if(cin.fail()) {
            break;
        }
        while(_size<=N) {
            _size<<=1;
        }
        _size<<=1;

        for(int i=_size/2;i<_size/2+N;i++) {
            cin >> arr[i];
            if(arr[i]==0) isZero[i]=true;
            if(arr[i]<0) arr[i]=1;
            else arr[i]=0;
        }
        construct();

        while(K-->0) {
            char ch; int a, b; cin >> ch >> a >> b;
            if(ch=='C') {
                update(a-1, b);
            } else {
                if(findZero(a-1, b-1, 1, 0, _size/2-1)) {
                    cout << 0;
                } else {
                    if(minusCnt(a-1, b-1, 1, 0, _size/2-1)%2==0) {
                        cout << '+';
                    } else {
                        cout << '-';
                    }
                }
            }
        }
        cout << '\n';
    }
}