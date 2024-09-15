#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    bool canUse[10] = {false, };
    while(N-->0) {
        int tmp; cin >> tmp;
        canUse[tmp]=true;
    }

    if(canUse[0]) {
        cout << "YES\n0";
    } else {
        for(int i=1;i<=9;i++) {
            if(canUse[i]) {
                cout << "YES\n" << i << i << i;
                break;
            }
        }
    }
}