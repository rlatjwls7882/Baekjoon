#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    if(N<=1) {
        cout << N;
    } else {
        int mult=1, cnt3=0;
        if(N%3==0) {
            cnt3=N/3;
        } else if(N%3==1) {
            cnt3=N/3-1;
            mult=4;
        } else {
            cnt3=N/3;
            mult=2;
        }

        while(cnt3-->0) {
            mult = mult*3%10007;
        }
        cout << mult;
    }
}