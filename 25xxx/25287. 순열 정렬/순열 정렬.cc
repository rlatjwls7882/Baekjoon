#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        bool canMake=true;
        int last; cin >> last; last = min(last, N-last+1);
        for(int i=1;i<N;i++) {
            int case1; cin >> case1;
            int case2 = N-case1+1;

            if((case1<case2 || case2<last) && case1>=last) last=case1;
            else if(case2>=last) last=case2;
            else canMake=false;
        }
        if(canMake) cout << "YES\n";
        else cout << "NO\n";
    }
}