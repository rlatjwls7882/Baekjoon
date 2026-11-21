#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int sum=0;
    while(N-->0) {
        string s; int dd; cin >> s >> dd;
        int Ts=((s[0]-'0')*10+s[1]-'0')*60+(s[3]-'0')*10+s[4]-'0';
        int Te = Ts+dd;
        for(int i=Ts;i<Te;i++) {
            if(7*60<=i && i<19*60) sum += 10;
            else sum += 5;
        }
    }
    cout << sum;
}