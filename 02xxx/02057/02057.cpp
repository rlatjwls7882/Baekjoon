#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    long long N; cin >> N;
    
    if(N==0) {
        cout << "NO";
    } else {
        vector<long long> v;
        v.push_back(1);
        for(long i=1;;i++) {
            long long next = v.back()*i;
            v.push_back(next);
            if(next>N) {
                break;
            }
        }

        for(int i=v.end()-v.begin()-1;i>=0;i--) {
            if(N>=v[i]) {
                N -= v[i];
            }
            if(N==0) {
                break;
            }
        }
        cout << (N==0?"YES":"NO");
    }
}