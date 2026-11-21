#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    vector<bitset<20>> v = vector<bitset<20>>(N);
    while(M-->0) {
        int a, i; cin >> a >> i;
        if(a==3) {
            v[i-1]<<=1;
        } else if(a==4) {
            v[i-1]>>=1;
        } else {
            int x; cin >> x;
            if(a==1) {
                v[i-1][x-1]=1;
            } else {
                v[i-1][x-1]=0;
            }
        }
    }

    set<string> s;
    for(int i=0;i<N;i++) {
        s.insert(v[i].to_string());
    }
    cout << s.size();
}