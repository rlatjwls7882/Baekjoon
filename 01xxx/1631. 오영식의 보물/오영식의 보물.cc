#include<bits/stdc++.h>
using namespace std;

int n, m, start;
int res[30], cur[30];

void rec(int dep, int from, int another, int to) {
    if(!m) return;
    if(dep==0) {
        cur[dep] = to; m--;
        return;
    }

    if(m>=(1<<dep)-1) {
        m -= (1<<dep)-1;
        for(int i=0;i<dep;i++) cur[i] = another;
    } else {
        rec(dep-1, from, to, another);
    }
    if(m>0) cur[dep] = to, m--;
    if(dep!=start) rec(dep-1, another, from, to);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> n >> m >> s;
    for(int i=0;i<n;i++) res[i] = s[i]-'A';

    for(int i=n-1;i>=0;i--) {
        if(res[i]!=cur[i]) {
            int from = cur[i];
            int to = res[i];
            int another = 3^from^to;
            start=i;
            rec(i, from, another, to);
        }
    }
    for(int i=0;i<n;i++) cout << char(cur[i]+'A');
}