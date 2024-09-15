#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    sort(A, A+N);

    int left=0, right=N-1, cnt=0;
    while(left<right) {
        if(A[left]+A[right]>=M) {
            cnt++;
            left++;
            right--;
        } else {
            left++;
        }
    }
    cout << cnt;
}