#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int cur=N;
    for(int i=N-1;i>=0;i--) {
        if(arr[i]==cur) cur--;
    }
    cout << cur;
}