#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int cnt=(2*N+1)*(2*N+1);
    for(int a=1;a<=N;a++) {
        for(int b=-N;b<=N;b++) {
            if(-N<=1-(a+b) && 1-(a+b)<=N) {
                cnt++;
            }
            if(-N<=1-(-a+b) && 1-(-a+b)<=N) {
                cnt++;
            }
        }
    }
    cout << cnt;
}