#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, d, m; string s; cin >> n >> s >> d >> m;

    int cntH=0, cntY=0, cntU=0, cost=0, curCnt=0;
    for(int i=0;i<n;i++) {
        if(s[i]>='a') {
            curCnt++;
        } else {
            cost += min(d*curCnt, m+d);
            curCnt=0;
            if(s[i]=='H') cntH++;
            else if(s[i]=='Y') cntY++;
            else cntU++;
        }
    }
    cost += min(d*curCnt, m+d);

    if(cost==0) cout << "Nalmeok\n";
    else cout << cost << '\n';
    if(min(min(cntH, cntY), cntU)==0) cout << "I love HanYang University";
    else cout << min(min(cntH, cntY), cntU);
}