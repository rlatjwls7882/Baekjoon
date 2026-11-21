#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int arr[N];
    int left=0, right=1000000000;
    for(int i=0;i<N;i++) {
        cin >> arr[i];
        left = max(left, arr[i]);
    }

    while(left<right) {
        int mid = (left+right)/2;
        int cnt=0, cur=mid+1;
        for(int i=0;i<N;i++) {
            if(cur+arr[i]>mid) {
                cnt++;
                cur=0;
            }
            cur+=arr[i];
        }

        if(cnt>M) left=mid+1;
        else right=mid;
    }
    cout << left;
}