#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, C; cin >> N >> C;
    int x[N];
    for(int i=0;i<N;i++) {
        cin >> x[i];
    }
    sort(x, x+N);

    int left=1, right=x[N-1]-x[0];
    while(left<right) {
        int mid = (left+right+1)/2;

        int cnt=0, last=-1000000000;
        for(int i=0;i<N;i++) {
            if(x[i]-last >= mid) {
                cnt++;
                last=x[i];
            }
        }

        if(cnt>=C) left=mid;
        else right=mid-1;
    }
    cout << left;
}