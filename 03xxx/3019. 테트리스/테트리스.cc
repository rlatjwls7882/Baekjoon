#include<bits/stdc++.h>
using namespace std;

int C, P, h[100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> C >> P;
    for(int i=0;i<C;i++) cin >> h[i];

    int cnt=0;
    if(P==1) {
        for(int i=0;i<C;i++) {
            if(i+3<C && h[i]==h[i+1] && h[i]==h[i+2] && h[i]==h[i+3]) cnt++;
        }
        cnt += C;
    } else if(P==2) {
        for(int i=0;i<C;i++) {
            if(i+1<C && h[i]==h[i+1]) cnt++;
        }
    } else if(P==3) {
        for(int i=0;i<C;i++) {
            if(i+2<C && h[i]==h[i+1] && h[i+1]+1==h[i+2]) cnt++;
            if(i+1<C && h[i]==h[i+1]+1) cnt++;
        }
    } else if(P==4) {
        for(int i=0;i<C;i++) {
            if(i+2<C && h[i]==h[i+1]+1 && h[i+1]==h[i+2]) cnt++;
            if(i+1<C && h[i]+1==h[i+1]) cnt++;
        }
    } else if(P==5) {
        for(int i=0;i<C;i++) {
            if(i+2<C && h[i]==h[i+1] && h[i+1]==h[i+2]) cnt++;
            if(i+2<C && h[i]==h[i+1]+1 && h[i+1]+1==h[i+2]) cnt++;
            if(i+1<C && h[i]+1==h[i+1]) cnt++;
            if(i+1<C && h[i]==h[i+1]+1) cnt++;
        }
    } else if(P==6) {
        for(int i=0;i<C;i++) {
            if(i+2<C && h[i]==h[i+1] && h[i+1]==h[i+2]) cnt++;
            if(i+2<C && h[i]+1==h[i+1] && h[i+1]==h[i+2]) cnt++;
            if(i+1<C && h[i]==h[i+1]) cnt++;
            if(i+1<C && h[i]==h[i+1]+2) cnt++;
        }
    } else {
        for(int i=0;i<C;i++) {
            if(i+2<C && h[i]==h[i+1] && h[i+1]==h[i+2]) cnt++;
            if(i+2<C && h[i]==h[i+1] && h[i+1]==h[i+2]+1) cnt++;
            if(i+1<C && h[i]==h[i+1]) cnt++;
            if(i+1<C && h[i]+2==h[i+1]) cnt++;
        }
    }
    cout << cnt;
}