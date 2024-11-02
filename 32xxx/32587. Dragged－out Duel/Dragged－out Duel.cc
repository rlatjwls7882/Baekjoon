#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    string you, Guile; cin >> you >> Guile;
    int win1=0, win2=0;
    for(int i=0;i<n;i++) {
        if(you[i]=='R' && Guile[i]=='S' || you[i]=='S' && Guile[i]=='P' || you[i]=='P' && Guile[i]=='R') win1++;
        else if(you[i]=='S' && Guile[i]=='R' || you[i]=='P' && Guile[i]=='S' || you[i]=='R' && Guile[i]=='P') win2++;
    }
    cout << (win1>win2?"victory":"defeat");
}