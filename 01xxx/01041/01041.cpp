#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long N, A, B, C, D, E, F; cin >> N >> A >> B >> C >> D >> E >> F;
    if(N==1) {
        cout << A+B+C+D+E+F-max({A, B, C, D, E, F});
    } else {
        cout << min({A+B+C, A+B+D, A+C+E, A+D+E, B+C+F, B+D+F, C+E+F, D+E+F})*4+min({A+B, A+C, A+D, A+E, B+C, B+D, B+F, C+E, C+F, D+E, D+F, E+F})*(8*N-12)+min({A, B, C, D, E, F})*(5*N*N-16*N+12);
    }
}