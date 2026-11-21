#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int a[N];
    for(int i=0;i<N;i++) {
        cin >> a[i];
    }
    sort(a, a+N);

    int cnt=0;
    for(int i=0;i<(N+1)/2;i++) {
        while(a[i]!=0) {
            a[i]/=2;
            cnt++;
        }
    }
    cout << cnt-((N+1)/2-1);
}