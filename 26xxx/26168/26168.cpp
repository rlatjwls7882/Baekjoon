#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    long long A[n+1];
    A[0]=1000000000000000001;
    for(int i=1;i<=n;i++) cin >> A[i];
    sort(A, A+n+1);

    while(m-->0) {
        int x; cin >> x;
        if(x==1) {
            long long k; cin >> k;
            int left=0, right=n;
            while(left<right) {
                int mid = (left+right)/2;
                if(A[mid]>=k) right=mid;
                else left=mid+1;
            }
            cout << n-left << '\n';
        } else if(x==2) {
            long long k; cin >> k;
            int left=0, right=n;
            while(left<right) {
                int mid = (left+right)/2;
                if(A[mid]>k) right=mid;
                else left=mid+1;
            }
            cout << n-left << '\n';
        } else {
            long long i, j; cin >> i >> j;
            int left=0, right=n;
            while(left<right) {
                int mid = (left+right)/2;
                if(A[mid]>=i) right=mid;
                else left=mid+1;
            }
            int tmp = left;

            left=0; right=n;
            while(left<right) {
                int mid = (left+right+1)/2;
                if(A[mid]>j) right=mid-1;
                else left=mid;
            }
            cout << left+1-tmp << '\n';
        }
    }
}