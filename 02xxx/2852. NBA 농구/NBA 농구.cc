#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    int chk[2880] = {0, };
    while(N-->0) {
        int a; string s; cin >> a >> s;
        int time = (s[0]-'0')*600 + (s[1]-'0')*60 + (s[3]-'0')*10 + (s[4]-'0');
        if(a==1) chk[time]++;
        else chk[time]--;
    }

    for(int i=1;i<2880;i++) {
        chk[i]+=chk[i-1];
    }

    int a=0, b=0;
    for(int i=0;i<2880;i++) {
        if(chk[i]>0) a++;
        else if(chk[i]<0) b++;
    }
    printf("%02d:%02d\n%02d:%02d", a/60, a%60, b/60, b%60);
}