#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    while(Q-->0) {
        int a, b, c; cin >> a >> b >> c;
        if(a==1) {
            arr[b-1]=c;
        } else {
            cout << abs(arr[b-1]-arr[c-1]) << '\n';
        }
    }
}