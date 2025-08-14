#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> A(n);
    for(int i=0;i<n;i++) cin >> A[i];
    sort(A.begin(), A.end());

    int m; cin >> m;
    while(m--) {
        int val; cin >> val;

        int left=0, right=A.size()-1;
        while(left<right) {
            int mid = (left+right)/2;
            if(A[mid]<val) left=mid+1;
            else right=mid;
        }
        cout << (A[left]==val ? "1\n" : "0\n");
    }
}