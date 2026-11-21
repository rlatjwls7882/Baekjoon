#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    while(true) {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=i*5*2;j++) {
                if(--N<=0) {
                    if(j==i*5*2) {
                        cout << 0;
                    } else if(j<=5 || j>=i*5*2-5) {
                        cout << 1;
                    } else if(j<=10 || j>=i*5*2-10) {
                        cout << 2;
                    } else if(j<=15 || j>=i*5*2-15) {
                        cout << 3;
                    } else {
                        cout << 4;
                    }
                    return 0;
                }
            }
        }
    }
}