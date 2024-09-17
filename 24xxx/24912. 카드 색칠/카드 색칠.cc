#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    for(int i=0;i<N;i++) {
        if(arr[i]==0) {
            if(i-1<0) {
                arr[i]=1;
            } else if(arr[i-1]==1) {
                if(i+1<N && arr[i+1]==2) {
                    arr[i]=3;
                } else {
                    arr[i]=2;
                }
            } else if(arr[i-1]==2) {
                if(i+1<N && arr[i+1]==1) {
                    arr[i]=3;
                } else {
                    arr[i]=1;
                }
            } else {
                if(i+1<N && arr[i+1]==1) {
                    arr[i]=2;
                } else {
                    arr[i]=1;
                }
            }
        }
        if(i-1>=0 && arr[i-1]==arr[i]) {
            cout << -1;
            return 0;
        }
    }

    for(int i=0;i<N;i++) {
        cout << arr[i] << ' ';
    }
}