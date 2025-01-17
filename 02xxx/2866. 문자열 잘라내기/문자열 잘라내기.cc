#include<bits/stdc++.h>
using namespace std;

string s[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int R, C; cin >> R >> C;
    for(int i=0;i<R;i++) cin >> s[i];

    int left=0, right=R-1;
    while(left<right) {
        int mid = (left+right+1)/2;
        set<string> li;
        for(int j=0;j<C;j++) {
            string cur="";
            for(int k=mid;k<R;k++) cur += s[k][j];
            li.insert(cur);
        }
        if(li.size()==C) left=mid;
        else right=mid-1;
    }
    cout << left;
}