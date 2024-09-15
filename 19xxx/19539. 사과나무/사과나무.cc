#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int cnt1=0, cnt2=0;
    while(N-->0) {
        int h; cin >> h;
        cnt2 += h/2;
        cnt1 += h%2;
    }

    int make = min(cnt1, cnt2);
    cnt1 -= make;
    cnt2 -= make;

    if(cnt2==0 && cnt1!=0) {
        cout << "NO";
        return 0;
    }

    while(cnt2!=0) {
        cnt1+=2;
        cnt2--;

        make = min(cnt1, cnt2);
        cnt1 -= make;
        cnt2 -= make;
    }

    if(cnt1%3==0) cout << "YES";
    else cout << "NO";
}