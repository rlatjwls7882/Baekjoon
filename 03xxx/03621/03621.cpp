#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, d; cin >> n >> d;
    int total[n] = {0, };
    for(int i=0;i<n;i++) {
        int idx; cin >> idx;
        total[idx]++;
    }

    int cnt=0;
    for(int i=0;i<n;i++) {
        cnt += max(0, (total[i]-2)/(d-1));
    }
    cout << cnt;
}