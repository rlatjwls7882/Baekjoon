#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int arr[M+1] = {0, };
    for(int i=0;i<N;i++) {
        for(int j=1;j<=M;j++) {
            int tmp; cin >> tmp;
            arr[j] = tmp + max(arr[j-1], arr[j]);
        }
    }
    cout << arr[M];
}