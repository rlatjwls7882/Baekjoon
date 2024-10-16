#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int cnt[100001] = {0, };
    while(n-->0) {
        int A; cin >> A;
        cnt[A]++;
    }

    for(int i=100000;i>=1;i--) {
        if(cnt[i]%2==1) {
            cout << "koosaga";
            return 0;
        }
    }
    cout << "cubelover";
}