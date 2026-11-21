#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string a[N];
    for(int i=0;i<N;i++) {
        cin >> a[i];
    }

    string b[N];
    for(int i=0;i<N;i++) {
        cin >> b[i];
    }

    int cnt=0;
    for(int i=0;i<N-2;i++) {
        for(int j=0;j<M-2;j++) {
            if(a[i][j]!=b[i][j]) {
                for(int k=i;k<i+3;k++) {
                    for(int l=j;l<j+3;l++) {
                        if(a[k][l]=='1') a[k][l]='0';
                        else a[k][l]='1';
                    }
                }
                cnt++;
            }
        }
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(a[i][j]!=b[i][j]) {
                cout << -1;
                return 0;
            }
        }
    }
    cout << cnt;
}