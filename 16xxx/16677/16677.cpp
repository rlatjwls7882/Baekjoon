#include<bits/stdc++.h>
using namespace std;

bool isContain(string a, string b) {
    int idx=0;
    for(int i=0;i<b.length();i++) {
        if(idx<a.length() && a[idx]==b[i]) {
            idx++;
        }
    }
    if(idx == a.length()) return 1;
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a; int n; cin >> a >> n;
    
    string res = "No Jam";
    double score = 0;
    while(n--) {
        string b; int g; cin >> b >> g;
        if(isContain(a, b)) {
            double cnt = b.length() - a.length();
            if(score < g/cnt) {
                score = g/cnt;
                res = b;
            }
        }
    }
    cout << res;
}