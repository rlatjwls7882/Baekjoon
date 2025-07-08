#include<bits/stdc++.h>
using namespace std;

const int MAX = 1e5+1;

int _size=1, arr[MAX*4];

void findMin(int cur) {
    if(arr[cur*2]==-1) {
        arr[cur] = arr[cur*2+1];
        return;
    }
    if(arr[cur*2+1]==-1) {
        arr[cur] = arr[cur*2];
        return;
    }
    cout << "? " << arr[cur*2] << ' ' << arr[cur*2+1] << '\n' << flush;
    char ret; cin >> ret;
    if(ret=='<') arr[cur] = arr[cur*2];
    else arr[cur] = arr[cur*2+1];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    while(_size<n) _size<<=1;
    _size<<=1;

    memset(arr, -1, sizeof arr);
    for(int i=_size/2;i<_size/2+n;i++) arr[i] = i-_size/2;

    // 세그먼트 트리로 최소값 위치 찾기
    for(int i=_size/2-1;i>0;i--) {
        findMin(i);
    }

    // 최솟값 제거 후 다시 최소값 찾기
    int cur = _size/2+arr[1];
    arr[cur]=-1;
    while(cur>1) {
        cur/=2;
        findMin(cur);
    }
    cout << "! " << arr[1];
}