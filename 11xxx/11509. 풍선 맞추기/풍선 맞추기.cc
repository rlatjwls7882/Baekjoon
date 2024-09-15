#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;
    int H[N];
    for(int i=0;i<N;i++) {
        cin >> H[i];
    }

    int cnt=1;
    for(int i=1;i<N;i++) {
        int isHigh=0;
        for(int j=i-1;j>=0;j--) {
            if(H[j]==H[i]) {
                isHigh--;
            } else if(H[j]==H[i]+1) {
                isHigh++;
            }
            if(isHigh>0) {
                break;
            }
        }
        if(isHigh<=0) {
            cnt++;
        }
    }
    cout << cnt;
}