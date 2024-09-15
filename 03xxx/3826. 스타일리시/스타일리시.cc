#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int p, q; cin >> p >> q;
        if(p==0 && q==0) return 0;

        map<tuple<int, int, int>, int> alwaysPossible;
        vector<tuple<int, int, int>> lastPossible;
        for(int i=1;i<=20;i++) {
            for(int j=1;j<=20;j++) {
                for(int k=1;k<=20;k++) {
                    lastPossible.push_back({i, j, k});
                }
            }
        }

        int cntR=0, cntC=0, cntS=0;
        while(p-->0) {
            string s; cin >> s;
            int nextR=cntR, nextC=cntC, nextS=cntS, indent=0;
            for(int i=0;i<s.length();i++) {
                if(s[i]=='(') nextR++;
                else if(s[i]=='[') nextC++;
                else if(s[i]=='{') nextS++;
                else if(s[i]==')') nextR--;
                else if(s[i]==']') nextC--;
                else if(s[i]=='}') nextS--;
                else if(i==indent && s[i]=='.') indent++;
            }
            vector<tuple<int, int, int>> curPossible;
            alwaysPossible[{cntR, cntC, cntS}]=indent;
            for(int i=1;i<=20;i++) {
                for(int j=1;j<=20;j++) {
                    for(int k=1;k<=20;k++) {
                        if(cntR*i+cntC*j+cntS*k==indent) {
                            curPossible.push_back({i, j, k});
                        }
                    }
                }
            }
            auto iter = set_intersection(lastPossible.begin(), lastPossible.end(), curPossible.begin(), curPossible.end(), lastPossible.begin());
            lastPossible.erase(iter, lastPossible.end());
            cntR=nextR;
            cntC=nextC;
            cntS=nextS;
        }

        int r=-1, c=-1, s=-1;
        for(auto v:lastPossible) {
            if(r==-1 || r==get<0>(v)) r=get<0>(v);
            else r=-2;
            if(c==-1 || c==get<1>(v)) c=get<1>(v);
            else c=-2;
            if(s==-1 || s==get<2>(v)) s=get<2>(v);
            else s=-2;
        }

        cntR=0; cntC=0; cntS=0;
        while(q-->0) {
            string tmp; cin >> tmp;
            if(alwaysPossible[{cntR, cntC, cntS}]) cout << alwaysPossible[{cntR, cntC, cntS}] << ' ';
            else if(cntR*r>=0 && cntC*c>=0 && cntS*s>=0) cout << cntR*r+cntC*c+cntS*s << ' ';
            else cout << "-1 ";
            int nextR=0, nextC=0, nextS=0;
            for(int i=0;i<tmp.length();i++) {
                if(tmp[i]=='(') cntR++;
                else if(tmp[i]=='[') cntC++;
                else if(tmp[i]=='{') cntS++;
                else if(tmp[i]==')') cntR--;
                else if(tmp[i]==']') cntC--;
                else if(tmp[i]=='}') cntS--;
            }
        }
        cout << '\n';
    }
}