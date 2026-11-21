#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, N; cin >> M >> N;

    string s[M*5+1];
    for(int i=0;i<M*5+1;i++) {
        cin >> s[i];
    }

    int cnt[5] = {0, };
    for(int i=0;i<M*5;i+=5) {
        for(int j=1;j<=N*5;j+=5) {
            for(int k=i+4;k>=i;k--) {
                if(s[k][j]!='.') {
                    cnt[k-i]++;
                    break;
                }
            }
        }
    }
    for(int i=0;i<5;i++) {
        cout << cnt[i] << " ";
    }
}