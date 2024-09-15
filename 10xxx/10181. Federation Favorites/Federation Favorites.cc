#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(n==-1) break;

        int sum=0;
        vector<int> divisor;
        for(int i=1;i<n;i++) {
            if(n%i==0) {
                sum += i;
                divisor.push_back(i);
            }
        }

        if(sum!=n) cout << n << " is NOT perfect.\n";
        else {
            cout << n << " = ";
            for(int i=0;i<divisor.size();i++) {
                if(i!=0) cout << "+ ";
                cout << divisor[i] << ' ';
            }
            cout << '\n';
        }
    }
}