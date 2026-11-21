#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;
    string tile[N];
    for(int i=0;i<N;i++) {
        cin >> tile[i];
    }

    int cnt=0;
    char newTile[K][K];
    for(int i=0;i<K;i++) {
        for(int j=0;j<K;j++) {
            int chars[26] = {0, };
            for(int k=i;k<N;k+=K) {
                for(int l=j;l<M;l+=K) {
                    chars[tile[k][l]-'A']++;
                }
            }

            int _max=0, maxIdx=0;
            for(int i=0;i<26;i++) {
                if(chars[i]>_max) {
                    _max=chars[i];
                    maxIdx=i;
                }
            }
            newTile[i][j]=(char)(maxIdx+'A');
            cnt += (N/K)*(M/K)-_max;
        }
    }

    cout << cnt << endl;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cout << newTile[i%K][j%K];
        }
        cout << endl;
    }
}