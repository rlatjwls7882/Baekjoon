#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string map[N];
    for(int i=0;i<N;i++) {
        cin >> map[i];
    }

    int colCnt=0, rowCnt=0;
    for(int i=0;i<N;i++) {
        int colCur=0, rowCur=0;
        for(int j=0;j<N;j++) {
            if(map[i][j]=='.') {
                if(++colCur==2) {
                    colCnt++;
                }
            } else {
                colCur=0;
            }

            if(map[j][i]=='.') {
                if(++rowCur==2) {
                    rowCnt++;
                }
            } else {
                rowCur=0;
            }
        }
    }
    cout << colCnt << " " << rowCnt;
}