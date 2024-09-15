#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n, d; cin >> n >> d;
        int arr[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                cin >> arr[i][j];
            }
        }
        d = (d+360)%360;
        d /= 45;

        while(d-->0) {
            int tmp[n];
            for(int i=0;i<n;i++) {
                tmp[i]=arr[i][n/2];
            }
            for(int i=0;i<n;i++) {
                arr[i][n/2]=arr[i][i];
            }
            for(int i=0;i<n;i++) {
                arr[i][i]=arr[n/2][i];
            }
            for(int i=0;i<n;i++) {
                arr[n/2][i]=arr[n-1-i][i];
            }
            for(int i=0;i<n;i++) {
                arr[i][n-1-i]=tmp[i];
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                cout << arr[i][j] << ' ';
            }
            cout << '\n';
        }
    }
}