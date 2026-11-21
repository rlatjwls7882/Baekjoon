#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int h, w; cin >> h >> w;
        if(h==0 && w==0) break;

        int minH=150, minW=150;
        for(int i=1;i<=150;i++) {
            for(int j=i+1;j<=150;j++) {
                if(i*i+j*j>h*h+w*w || i*i+j*j==h*h+w*w && i>h) {
                    if(i*i+j*j<minH*minH+minW*minW || i*i+j*j==minH*minH+minW*minW && i<minH) {
                        minH=i;
                        minW=j;
                    }
                }
            }
        }
        cout << minH << ' ' << minW << '\n';
    }
}