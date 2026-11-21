#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    sort(A, A+N);

    int cnt=0;
    for(int i=0;i<N;i++) {
        if(cnt<A[i]) {
            cnt++;
        } else if(cnt==A[i]) {
            cnt++;
            break;
        } else {
            break;
        }
    }
    cout << cnt;
}