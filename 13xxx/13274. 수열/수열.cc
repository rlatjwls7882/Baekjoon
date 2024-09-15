#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    ll arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N);

    while(K-->0) {
        int L, R, X; cin >> L >> R >> X;
        for(int i=L-1;i<R;i++) {
            arr[i] += X;
        }

        if(X>0) {
            sort(arr+L-1, arr+N);
        } else {
            sort(arr, arr+R);
        }
    }

    for(int i=0;i<N;i++) {
        cout << arr[i] << " ";
    }
}