#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    bool chk[N] = {true, false, };
    for(int i=0;i<N-1;i++) {
        if(chk[i]) {
            for(int j=i+1;j<=i+K && j<N;j++) {
                if((j-i)*(1+abs(arr[j]-arr[i]))<=K) {
                    chk[j] = true;
                    if(j==N-1) {
                        cout << "YES";
                        return 0;
                    }
                }
            }
        }
    }
    cout << "NO";
}