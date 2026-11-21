#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int T; cin >> T;

    while(T-->0) {
        int J, N; cin >> J >> N;
        
        vector<int> v;
        for(int i=0;i<N;i++) {
            int R, C; cin >> R >> C;
            v.push_back(R*C);
        }
        sort(v.begin(), v.end());

        int cnt=0;
        for(int i=N-1;i>=0;i--) {
            J -= v[i];
            cnt++;
            if(J<=0) {
                break;
            }
        }
        cout << cnt << endl;
    }
}