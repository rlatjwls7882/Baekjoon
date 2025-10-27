#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        string s; cin >> s;

        int res=0, sum=0;
        for(char ch:s) {
            int cur;
            if(ch<='9') cur=ch-'0';
            else cur=ch-'A'+10;
            if(sum/10!=(sum+cur)/10 && (sum+cur)/10<=3) res += (sum+cur)/10;
            sum += cur;
        }
        cout << res;
        if(sum/10==4) cout << "(weapon)";
        else if(sum/10>4) cout << "(09)";
        cout << '\n';
    }
}