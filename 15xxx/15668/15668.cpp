#include<bits/stdc++.h>
using namespace std;

int n;
string s, res="-1";
int used[10];
bool finish;

void chk(string a) {
    if(a.length()==10) return;

    int intA = stoi(a);
    if(n<=intA) return;
    string b = to_string(n-intA);

    bool ret=true;
    for(int i=0;i<b.length();i++) if(++used[b[i]-'0']==2) ret=false;
    for(int i=0;i<b.length();i++) --used[b[i]-'0'];
    if(ret) {
        res = a + " + " + b;
        finish=true;
    }
}

void dfs(string val="") {
    if(finish || val.length()>s.length()) return;
    if(val.length()) chk(val);
    for(int i=0;i<10;i++) {
        if(val.length()==0 && i==0) continue;
        if(!used[i]) {
            used[i]++;
            dfs(val+to_string(i));
            used[i]--;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s;
    n = stoi(s);
    dfs();
    cout << res;
}