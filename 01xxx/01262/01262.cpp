#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N, R1, C1, R2, C2; cin >> N >> R1 >> C1 >> R2 >> C2;
    int size = 2*N-1;

    for(int i=R1;i<=R2;i++) {
        for(int j=C1;j<=C2;j++) {
            int cnt = abs(i%size-(N-1))+abs(j%size-(N-1));
            if(cnt<N) {
                cout << char(cnt%26+'a');
            } else {
                cout << '.';
            }
        }
        cout << endl;
    }
}