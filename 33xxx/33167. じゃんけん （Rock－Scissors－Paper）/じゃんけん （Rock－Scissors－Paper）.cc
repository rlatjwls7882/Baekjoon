#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; string S, T; cin >> N >> S >> T;
    int cnt1=0, cnt2=0;
    for(int i=0;i<N;i++) {
        if(S[i]=='R' && T[i]=='S' || S[i]=='S' && T[i]=='P' || S[i]=='P' && T[i]=='R') cnt1++;
        else if(S[i]=='R' && T[i]=='P' || S[i]=='P' && T[i]=='S' || S[i]=='S' && T[i]=='R') cnt2++;
    }
    cout << cnt1 << ' ' << cnt2;
}