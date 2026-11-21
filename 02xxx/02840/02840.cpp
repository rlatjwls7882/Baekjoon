#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    bool used[26] = {false, };
    char ch[N]; fill(ch, ch+N, '?');
    int idx=0;
    while(K-->0) {
        int S; char c; cin >> S >> c;
        idx = (idx+S)%N;
        if((ch[idx]!='?' || used[c-'A']) && ch[idx]!=c) {
            cout << '!';
            return 0;
        }
        used[c-'A']=true;
        ch[idx]=c;
    }

    for(int i=0;i<N;i++) {
        cout << ch[(idx+N-i)%N];
    }
}