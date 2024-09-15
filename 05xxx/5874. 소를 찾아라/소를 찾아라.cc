#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    int N = s.length();

    int open[N] = {0, };
    int close[N] = {0, };
    for(int i=1;i<N;i++) {
        open[i]=open[i-1];
        close[i]=close[i-1];
        if(s[i]==s[i-1]) {
            if(s[i]=='(') {
                open[i]++;
            } else {
                close[i]++;
            }
        }
    }
    
    int cnt=0;
    for(int i=1;i<N;i++) {
        cnt += (open[i]-open[i-1])*(close[N-1]-close[i]);
    }
    cout << cnt;
}