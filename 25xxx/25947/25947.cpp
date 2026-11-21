#include<bits/stdc++.h>
using namespace std;

int arr[100'000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, b, a; cin >> n >> b >> a;
    for(int i=0;i<n;i++) cin >> arr[i];
    sort(arr, arr+n);

    int cnt=0, sum=0;
    for(int i=0;i<n;i++) {
        sum+=arr[i]/2;
        if(i>=a) sum+=arr[i-a]/2;
        if(sum>b) break;
        cnt++;
    }
    cout << cnt;
}