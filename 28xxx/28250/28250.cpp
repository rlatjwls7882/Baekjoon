#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll cnt[3];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int num; cin >> num;
        cnt[min(num, 2)]++;
    }
    cout << cnt[0]*(cnt[0]-1)/2 + cnt[0]*cnt[1]*2 + cnt[0]*cnt[2];
}