#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, N; cin >> M >> N;
    string s[M];
    for(int i=0;i<M;i++) {
        cin >> s[i];
    }

    int out[M][N];
    int maxVal=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            out[j][i]=0;
            for(int k=-1;k<=1;k++) {
                int beforeJ = j+k;
                if(i-1<0 || beforeJ<0 || beforeJ>=M) continue;
                out[j][i] = max(out[j][i], out[beforeJ][i-1]);
            }
            maxVal = max(maxVal, out[j][i]);
            out[j][i] += s[j][i]-'0';
        }
    }
    cout << maxVal;
}