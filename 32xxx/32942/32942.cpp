#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int A, B, C; cin >> A >> B >> C;
    
    vector<vector<int>> res(10);
    if(B==0 && C/A == C/(double)A && 1<=C/A && C/A<=10) {
        for(int i=1;i<=10;i++) res[C/A-1].push_back(i);
    } else {
        for(int x=1;x<=10;x++) {
            double y=0;
            if(A==0) y = C/(double)B;
            else y = (C-A*x)/(double)B;
            if((int)y==y && 1<=y && y<=10) {
                res[x-1].push_back(y);
            }
        }
    }
    for(auto v:res) {
        if(v.empty()) cout << "0\n";
        else {
            for(int e:v) cout << e << ' ';
            cout << '\n';
        }
    }
}