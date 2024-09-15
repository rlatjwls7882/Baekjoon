#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int arr[M];
    for(int i=0;i<M;i++) {
        cin >> arr[i];
    }

    int left=1, right=1000000000;
    while(left<right) {
        int mid = (left+right)/2;
        int cnt=0;
        for(int i=0;i<M;i++) {
            cnt += (arr[i]+mid-1)/mid;
        }

        if(cnt>N) left=mid+1;
        else right=mid;
    }
    cout << left;
}