#include<bits/stdc++.h>
using namespace std;

bool comp(int a, int b) {
    if(a%10==0 && b%10==0) return a<b;
    if(a%10==0) return true;
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    sort(A, A+N, comp);

    int cnt=0;
    for(int i=0;i<N;i++) {
        if(A[i]==10) {
            cnt++;
        } else if(A[i]%10==0 && A[i]/10<=M+1) {
            int tmp = min(A[i]/10, M+1);
            cnt += tmp;
            M -= tmp-1;
        } else if(M) {
            int tmp = min(A[i]/10, M);
            cnt += tmp;
            M -= tmp;
        }
    }
    cout << cnt;
}