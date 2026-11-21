#include<bits/stdc++.h>
using namespace std;

int chk[4];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<10;i++) {
        int task; cin >> task;
        chk[task-1]=1;
    }
    cout << 4-accumulate(chk, chk+4, 0);
}