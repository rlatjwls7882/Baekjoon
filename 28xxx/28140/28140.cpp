#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;
    string s; cin >> s;

    int lastR=-1, lastB=-1;
    int nextR[N], nextB[N];
    for(int i=s.length()-1;i>=0;i--) {
        nextR[i]=lastR;
        nextB[i]=lastB;
        if(s[i]=='R') lastR=i;
        else if(s[i]=='B') lastB=i;
    }

    while(Q-->0) {
        int l, r; cin >> l >> r;
        int a = nextR[max(l-1, 0)];
        if(l==0 && s[0]=='R') a=0;
        if(a==-1 || a>r) {
            cout << "-1\n";
            continue;
        }
        int b = nextR[a];
        if(b==-1 || b>r) {
            cout << "-1\n";
            continue;
        }
        int c = nextB[b];
        if(c==-1 || c>r) {
            cout << "-1\n";
            continue;
        }
        int d = nextB[c];
        if(d==-1 || d>r) {
            cout << "-1\n";
            continue;
        }
        cout << a << ' ' << b << ' ' << c << ' ' << d << '\n';
    }
}