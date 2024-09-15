#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    string s="";
    do {
        int remain = N%-2;
        N/=-2;
        if(remain<0) {
            remain+=2;
            N++;
        }
        s += to_string(remain);
    } while(N!=0);

    for(int i=s.length()-1;i>=0;i--) {
        cout << s[i];
    }
}