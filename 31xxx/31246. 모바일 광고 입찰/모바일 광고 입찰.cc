#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int cnt=0;
    vector<int> v;
    while(N-->0) {
        int a, b; cin >> a >> b;
        if(a>=b) cnt++;
        else v.push_back(b-a);
    }

    sort(v.begin(), v.end());
    if(cnt>=K) cout << 0;
    else cout << v[K-cnt-1];
}