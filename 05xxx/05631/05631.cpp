#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int c=1;;c++) {
        int N; cin >> N;
        if(N==0) break;

        int house[N][2];
        for(int i=0;i<N;i++) {
            for(int j=0;j<2;j++) {
                cin >> house[i][j];
            }
        }

        int ax, ay, bx, by, q; cin >> ax >> ay >> bx >> by >> q;
        int mark1[30000] = {0, }, mark2[30000] = {0, };
        for(int i=0;i<N;i++) {
            mark1[(int)ceil(sqrt(pow(house[i][0]-ax, 2)+pow(house[i][1]-ay, 2)))]++;
            mark2[(int)ceil(sqrt(pow(house[i][0]-bx, 2)+pow(house[i][1]-by, 2)))]++;
        }
        for(int i=0;i<13000;i++) {
            mark1[i+1] += mark1[i];
            mark2[i+1] += mark2[i];
        }

        cout << "Case " << c << ":\n";
        while(q-->0) {
            int R1, R2; cin >> R1 >> R2;
            cout << max(0, N-mark1[R1]-mark2[R2]) << '\n';
        }
    }
}