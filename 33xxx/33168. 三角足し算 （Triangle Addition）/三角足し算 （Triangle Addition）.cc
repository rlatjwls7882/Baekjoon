#include<bits/stdc++.h>
using namespace std;

int arr[10][10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> arr[0][i];

    for(int i=1;i<n;i++) {
        for(int j=0;j<n-i;j++) {
            arr[i][j] = arr[i-1][j]+arr[i-1][j+1];
            cout << arr[i][j] << ' ';
        }
        cout << '\n';
    }
}