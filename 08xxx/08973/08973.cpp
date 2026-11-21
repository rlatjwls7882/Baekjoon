#include<bits/stdc++.h>
using namespace std;

int arr[2][2000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<2;i++) for(int j=0;j<n;j++) cin >> arr[i][j];

    int b=0, e=0, res=INT_MIN;
    for(int i=0;i<n;i++) {
        for(int j=0;i+j<n;j++) {
            int cur=0;
            for(int k=0;k<n-i-j;k++) cur += arr[0][i+k]*arr[1][n-1-(j+k)];
            if(cur>res) {
                res=cur;
                b=i;
                e=j;
            }
        }
    }
    cout << b << ' ' << e << '\n' << res;
}