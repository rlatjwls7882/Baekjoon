#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    bool chk=true;
    for(int i=1;i<=N;i++) {
        int a; cin >> a;
        if(a%2!=i%2) {
            chk=false;
        }
    }

    if(chk) {
        cout << "YES";
    } else {
        cout << "NO";
    }
}