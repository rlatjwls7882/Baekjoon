#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int arr[N][2];
    for(int i=0;i<N;i++) {
        cin >> arr[i][0] >> arr[i][1];
    }

    int idx=0, t=0;
    for(;idx<N;t++) {
        if(t%(arr[idx][0]+arr[idx][1])>=arr[idx][1]) {
            idx++;
        }
    }
    cout << t;
}