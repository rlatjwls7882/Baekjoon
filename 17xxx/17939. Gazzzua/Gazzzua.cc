#include<bits/stdc++.h>
using namespace std;

int cnt[1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int sum=0;
    while(n--) {
        int cur; cin >> cur;
        cnt[cur]++;
        for(int i=1;i<cur;i++) {
            sum += cnt[i];
            cnt[i+1] += cnt[i];
            cnt[i]=0;
        }
    }
    cout << sum;
}