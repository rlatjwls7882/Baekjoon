#include<bits/stdc++.h>
using namespace std;

int a[1000][1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> a[i][j];

    if(n==2) {
        cout << "1 1";
    } else {
        int a1 = (a[0][1]-a[1][2]+a[0][2])/2;
        cout << a1;
        for(int i=1;i<n;i++) cout << ' ' << a[0][i]-a1;
    }
}