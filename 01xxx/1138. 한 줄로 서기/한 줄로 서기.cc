#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    for(int t=0;t<N;t++) {
        for(int i=0;i<N;i++) {
            if(arr[i]==0) {
                cout << i+1 << ' ';
                for(int j=0;j<=i;j++) {
                    arr[j]--;
                }
                break;
            }
        }
    }
}