#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    bool work[N][7] = {false, };
    for(int i=0;i<N;i++) {
        for(int j=0;j<5;j++) {
            int tmp; cin >> tmp;
            if(tmp==1) {
                work[i][j]=true;
            }
        }
    }

    int idx=0;
    for(int i=0;i<N;i++) {
        while(!work[i][idx%7]) {
            idx++;
        }
        idx++;
    }
    cout << idx;
}