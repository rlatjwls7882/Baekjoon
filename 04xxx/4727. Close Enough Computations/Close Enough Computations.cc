#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int K, J, T, D; cin >> K >> J >> T >> D;
        if(K==0 && J==0 && T==0 && D==0) break;

        int minVal = round(max(0., J-0.5)*9+(max(0., T-0.5)+max(0., D-0.5))*4);
        int maxVal = round((J+0.5)*9+(T+D+1)*4);

        if(minVal <= K && K < maxVal) cout << "yes\n";
        else cout << "no\n";
    }
}
