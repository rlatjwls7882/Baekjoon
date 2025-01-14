#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long G; cin >> G;
    bool chk=false;
    long long left=1, right=1;
    while(right<=G) {
        if(right*right-left*left<G) right++;
        else left++;
        if(right*right-left*left==G) {
            cout << right << '\n';
            chk=true;
        }
    }
    if(!chk) cout << -1;
}