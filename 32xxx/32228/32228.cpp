#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int total=1;
    for(int i=2;i*i<=M;i++) {
        int cnt=0;
        while(M%i==0) {
            M/=i;
            cnt++;
        }
        if(cnt) total *= (i-1)*pow(i, cnt-1);
    }
    cout << total*max(1, (M-1));
}