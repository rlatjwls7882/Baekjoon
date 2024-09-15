#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n, m; cin >> n >> m;
        int A[n];
        for(int i=0;i<n;i++) {
            cin >> A[i];
        }
        sort(A, A+n);

        int B[m];
        for(int i=0;i<m;i++) {
            cin >> B[i];
        }
        sort(B, B+m);

        int Al=0, Bl=0, cnt=0;
        while(Al<n) {
            while(Bl<m && A[Al]>B[Bl]) Bl++;
            cnt += Bl;
            Al++;
        }
        cout << cnt << '\n';
    }
}