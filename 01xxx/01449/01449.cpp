#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N, L; cin >> N >> L;

    int pos[N];
    for(int i=0;i<N;i++) {
        cin >> pos[i];
    }
    sort(pos, pos+N);
    
    int total=0;
    for(int i=0;i<N;) {
        int cnt=1;
        for(int j=i+1;j<N;j++) {
            if(pos[j]-pos[i]<L) {
                cnt++;
            } else {
                break;
            }
        }
        i+=cnt;
        total++;
    }
    cout << total;
}