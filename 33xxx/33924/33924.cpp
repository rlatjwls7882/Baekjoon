#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; string s; cin >> n >> m >> k >> s;
    for(char ch : s) {
        if(ch=='A') {
            n = (n+1)%4+1;
        } else if(ch=='B') {
            if(n%2) n++;
            else n--;
            if(m%2) m++;
            else m--;
        } else if(ch=='C') {
            if(n%2) n = (n+2)%4+1;
            else n = n%4+1;
            if(m%2) m++;
            else m--;
        } else {
            if(n==1 && m==1) m++;
            else if(n==4 && m==2) m--;
            else if(m==1) n--;
            else n++;
        }
    }
    cout << n << ' ' << m;
}