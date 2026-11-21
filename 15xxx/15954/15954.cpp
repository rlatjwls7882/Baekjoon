#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long n, k; cin >> n >> k;
    vector<int> arr(n+1), preSum(n+1);
    for(int i=1;i<=n;i++) cin >> arr[i], preSum[i] = preSum[i-1]+arr[i];

    long double minVar = 1000000000000;
    for(int start=0;start<=n;start++) {
        for(int end=start+k;end<=n;end++) {
            long double avg = (preSum[end] - preSum[start])/(long double)(end-start);
            long double curVar=0;
            for(int i=start+1;i<=end;i++) curVar += pow(arr[i]-avg, 2);
            curVar = sqrt(curVar/(long double)(end-start));
            minVar = min(minVar, curVar);
        }
    }
    cout << setprecision(7) << fixed << minVar;
}