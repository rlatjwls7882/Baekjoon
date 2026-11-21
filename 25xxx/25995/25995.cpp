#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int cnt=0, left=0;
    for(int i=1;i<=n;i++) {
        cout << "? " << left << ' ' << i << '\n' << flush;
        string input; cin >> input;
        if(input[0]=='a') {
            left=i;
            cnt++;
        }
    }
    cout << "! " << cnt << '\n' << flush;
}