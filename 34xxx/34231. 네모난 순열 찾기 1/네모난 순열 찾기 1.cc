#include<bits/stdc++.h>
using namespace std;

int A[15][15];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> A[i][j];

    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            for(int k=i;k<n;k++) {
                for(int l=j;l<n;l++) {
                    set<int> nums;
                    for(int r=i;r<=k;r++) for(int c=j;c<=l;c++) nums.insert(A[r][c]);
                    if(nums.size() == (k-i+1)*(l-j+1) && *nums.begin()==1 && *(prev(nums.end()))==nums.size()) cnt++;
                }
            }
        }
    }
    cout << cnt;
}