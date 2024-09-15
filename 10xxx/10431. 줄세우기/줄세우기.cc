#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int P; cin >> P;
    while(P-->0) {
        int T; cin >> T;
        int arr[20];
        for(int i=0;i<20;i++) {
            cin >> arr[i];
        }

        int cnt=0;
        for(int i=1;i<20;i++) {
            for(int j=0;j<i;j++) {
                if(arr[j]>arr[i]) {
                    int tmp=arr[i];
                    for(int k=i;k>j;k--) {
                        arr[k]=arr[k-1];
                        cnt++;
                    }
                    arr[j]=tmp;
                    break;
                }
            }
        }
        cout << T << ' ' << cnt << '\n';
    }
}