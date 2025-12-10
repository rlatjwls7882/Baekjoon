#include<bits/stdc++.h>
using namespace std;

int s[100];
bool chk[1101];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, p; cin >> n >> p;
    for(int i=0;i<n-1;i++) {
        cin >> s[i];
        chk[s[i]]=true;
    }

    for(int i=p;;i++) {
        if(!chk[i]) {
            cout << i;
            return 0;
        }
    }
}