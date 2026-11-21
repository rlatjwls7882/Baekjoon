#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, k; cin >> n >> k;
    int saved=0, cur=0;
    while(n-->0) {
        string s; cin >>s;
        if(s.compare("save")==0) {
            saved=cur;
        } else if(s.compare("load")==0) {
            cur=saved;
        } else if(s.compare("shoot")==0) {
            cur--;
        } else {
            cur+=k;
        }
        cout << cur << '\n';
    }
}