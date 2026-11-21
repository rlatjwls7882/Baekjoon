#include<bits/stdc++.h>
using namespace std;

int arr[1000000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K; cin >> N >> K;
    for(int i=0;i<N;i++) cin >> arr[i];

    int minSize=INT_MAX, left=0, right=0, cnt=0;
    while(left<N) {
        while(right<N && cnt<K) {
            if(arr[right++]==1) cnt++;
        }
        if(cnt==K) minSize = min(minSize, right-left);
        if(arr[left++]==1) cnt--;
    }
    if(minSize==INT_MAX) cout << -1;
    else cout << minSize;
}