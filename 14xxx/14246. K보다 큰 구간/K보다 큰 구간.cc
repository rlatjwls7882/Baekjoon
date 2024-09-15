#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    int k; cin >> k;

    int sum=0;
    long long cnt=0;
    int first=0, last=0;
    while(last<=n) {
        if(sum<=k) {
            if(last==n) {
                break;
            }
            sum += arr[last++];
        } else {
            cnt += n-last+1;
            sum -= arr[first++];
        }
    }
    cout << cnt;
}