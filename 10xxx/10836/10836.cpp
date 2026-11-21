#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, N; cin >> M >> N;
    int val[2*M-1];
    fill(val, val+2*M-1, 1);

    while(N-->0) {
        int a, b, c; cin >> a >> b >> c;
        for(int i=a;i<a+b;i++) {
            val[i]++;
        }
        for(int i=a+b;i<a+b+c;i++) {
            val[i]+=2;
        }
    }
    for(int i=0;i<M;i++) {
        for(int j=0;j<M;j++) {
            if(j==0) cout << val[(M*2-1)/2-i];
            else cout << val[(M*2-1)/2+j];
            cout << ' ';
        }
        cout << '\n';
    }
}