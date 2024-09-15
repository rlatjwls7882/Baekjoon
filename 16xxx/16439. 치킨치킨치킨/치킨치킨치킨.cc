#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int a[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> a[i][j];
        }
    }

    int total=0;
    for(int i=0;i<M;i++) {
        for(int j=i;j<M;j++) {
            for(int k=j;k<M;k++) {
                int sum=0;
                for(int l=0;l<N;l++) {
                    sum += max(max(a[l][i], a[l][j]), a[l][k]);
                }
                total = max(total, sum);
            }
        }
    }
    cout << total;
}