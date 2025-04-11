#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        int m, td, wd; cin >> m >> td >> wd;

        int totalDay=0;
        for(int i=0;i<m;i++) {
            totalDay += td;
            if(i!=m-1 && totalDay%wd!=0) totalDay += wd;
        }
        cout << "Case #" << tc << ": " << (totalDay+wd-1)/wd << '\n';
    }
}