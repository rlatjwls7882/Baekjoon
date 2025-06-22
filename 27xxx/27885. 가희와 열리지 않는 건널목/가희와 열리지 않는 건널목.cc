#include<bits/stdc++.h>
using namespace std;

bool chk[24*60*60+42];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int c, h; cin >> c >> h;
    for(int i=0;i<c+h;i++) {
        int hh, mm, ss; char ch; cin >> hh >> ch >> mm >> ch >> ss;
        int start = (hh*60+mm)*60+ss;
        for(int j=start;j<start+40;j++) chk[j]=true;
    }

    int cnt=0;
    for(int i=0;i<60*60*24;i++) {
        if(!chk[i]) cnt++;
    }
    cout << cnt;
}