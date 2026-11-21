#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, k, m; cin >> n >> k >> m;
    vector<long long> v;
    long long maxSize=0;
    while(n-->0) {
        long long len; cin >> len;
        if(len>=2*k) {
            maxSize = max(maxSize, len-2*k);
            v.push_back(len-2*k);
        } else if(len>k) {
            maxSize = max(maxSize, len-k);
            v.push_back(len-k);
        }
    }

    long long left=1, right=maxSize;
    while(left<right) {
        long long mid = (left+right+1)/2;
        long long cnt=0;
        for(int len:v) cnt += len/mid;

        if(cnt>=m) left=mid;
        else right=mid-1;
    }

    long long sum=0;
    for(int len:v) sum += len;

    if(sum<m) cout << -1;
    else cout << left;
}