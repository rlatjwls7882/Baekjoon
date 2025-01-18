#include<bits/stdc++.h>
using namespace std;

int T[100000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    for(int i=0;i<N;i++) cin >> T[i];

    long long left=1, right=1000000000000000000;
    while(left<right) {
        long long mid = (left+right)/2;
        long long cnt=0;
        for(int i=0;i<N;i++) {
            cnt += mid/T[i];
            if(cnt>=M) break;
        }
        if(cnt>=M) right=mid;
        else left=mid+1;
    }
    cout << left;
}