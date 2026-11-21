#include<bits/stdc++.h>
using namespace std;

int arr[100000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> arr[i];

    for(int i=0;i<n-1;i++) {
        if(arr[i]<=arr[i+1] || i+2<n && arr[i]>=arr[i+1] && arr[i+1]>=arr[i+2]) {
            cout << "YES";
            return 0;
        }
    }
    cout << "NO";
}