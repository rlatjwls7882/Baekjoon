#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    unordered_map<string, P> m = {
        {"R", P{1, 0}}, {"L", P{-1, 0}}, {"B", P{0, -1}}, {"T", P{0, 1}},
        {"RT", P{1, 1}}, {"LT", P{-1, 1}}, {"RB", P{1, -1}}, {"LB", P{-1, -1}}
    };

    string a, b; int N; cin >> a >> b >> N;
    while(N-->0) {
        string s; cin >> s;
        P move = m[s];
        string nextA; nextA += char(a[0]+move.first); nextA += char(a[1]+move.second);
        if('A'<=nextA[0] && nextA[0]<='H' && '1'<=nextA[1] && nextA[1]<='8') {
            if(nextA[0]==b[0] && nextA[1]==b[1]) {
                string nextB; nextB += char(b[0]+move.first); nextB += char(b[1]+move.second);
                if('A'<=nextB[0] && nextB[0]<='H' && '1'<=nextB[1] && nextB[1]<='8') {
                    a=nextA;
                    b=nextB;
                }
            } else {
                a=nextA;
            }
        }
    }
    cout << a << '\n' << b;
}