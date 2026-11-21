#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        long long cnt=0;
        for(int i=1;;i*=2) {
            if(0<=N && N<=i) {
                cnt += i/2 + N;
                break;
            }
            cnt += i/2 + i;

            if(-i<=N && N<=0) {
                cnt += i + -N;
                break;
            }
            cnt += i + i;
        }
        cout << cnt << '\n';
    }
}