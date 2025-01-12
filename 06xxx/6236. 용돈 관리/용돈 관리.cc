#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;

    vector<int> v(N);
    int left=0, right=1000000000;
    for(int i=0;i<N;i++) {
        cin >> v[i];
        left = max(left, v[i]);
    }

    while(left<right) {
        int mid = (left+right)/2;
        int cnt=0, remain=0;
        for(int i=0;i<N;i++) {
            if(remain<v[i]) {
                remain=mid;
                cnt++;
            }
            remain -= v[i];
        }
        if(cnt<=M) right=mid;
        else left=mid+1;
    }
    cout << left;
}