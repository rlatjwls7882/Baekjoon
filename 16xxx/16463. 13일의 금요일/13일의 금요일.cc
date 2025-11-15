#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int y=2019, m=1, d=1, yoil=2, cnt=0;
    while(y<=n && d<100) {
        d++;
        yoil++;
        if(d==13 && yoil%7==5) cnt++;
        if(d==29 && m==2 && !(y%400==0 || y%100!=0 && y%4==0) || d==30 && m==2 && (y%400==0 || y%100!=0 && y%4==0) || d==31 && (m==4 || m==6 || m==9 || m==11) || d==32 && (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)) {
            d=1;
            if(++m==13) {
                m=1;
                y++;
            }
        }
    }
    cout << cnt;
}