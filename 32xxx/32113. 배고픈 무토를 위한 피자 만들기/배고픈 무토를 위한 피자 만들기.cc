#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, R, C; cin >> N >> R >> C; R--; C--;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    vector<string> res;
    for(int i=0;i<N;i++) {
        if(i<C) res.push_back("\nL "+to_string(R+1)+" push");
        else if(i>C) res.push_back("\nR "+to_string(R+1)+" push");
    }

    for(int i=0;i<N;i++) {
        if(i<R) res.push_back("\nU 1 push");
        else if(i>R) res.push_back("\nD 1 push");
    }

    for(int i=1;i<N;i++) {
        if(m[R][i]=='.') res.push_back("\nU "+to_string(i+1)+" pull");
    }

    for(int i=R-1;i>=0;i--) {
        for(int j=1;j<N;j++) res.push_back("\nR "+to_string(i+1)+" push");
        for(int j=1;j<N;j++) if(m[i][j]=='.') res.push_back("\nU "+to_string(j+1)+" pull");
    }

    for(int i=R+1;i<N;i++) {
        for(int j=1;j<N;j++) res.push_back("\nR "+to_string(i+1)+" push");
        for(int j=1;j<N;j++) if(m[i][j]=='.') res.push_back("\nD "+to_string(j+1)+" pull");
    }

    for(int i=0;i<N;i++) {
        if(m[i][0]=='.') res.push_back("\nL "+to_string(i+1)+" pull");
    }

    cout << res.size();
    for(string s:res) {
        cout << s;
    }
}