#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N][2];
    for(int i=0;i<N;i++) {
        cin >> arr[i][0] >> arr[i][1];
    }

    int Q; cin >> Q;
    while(Q-->0) {
        double k; cin >> k;

        int left=0, right=N-1;
        while(left+1<right) {
            int mid = (left+right)/2;
            if(arr[mid][0]<k) {
                left=mid;
            } else {
                right=mid;
            }
        }

        if(arr[left][1]==arr[right][1]) cout << "0\n";
        else if(arr[left][1]<arr[right][1]) cout << "1\n";
        else cout << "-1\n";
    }
}