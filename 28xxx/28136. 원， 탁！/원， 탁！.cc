#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        if(arr[i]>=arr[(i+1)%N]) {
            cnt++;
        }
    }
    cout << cnt;
}