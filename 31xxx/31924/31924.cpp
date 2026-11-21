#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(j+4<N && m[i][j]=='M' && m[i][j+1]=='O' && m[i][j+2]=='B' && m[i][j+3]=='I' && m[i][j+4]=='S') cnt++;
            if(j+4<N && m[i][j]=='S' && m[i][j+1]=='I' && m[i][j+2]=='B' && m[i][j+3]=='O' && m[i][j+4]=='M') cnt++;
            if(i+4<N && m[i][j]=='M' && m[i+1][j]=='O' && m[i+2][j]=='B' && m[i+3][j]=='I' && m[i+4][j]=='S') cnt++;
            if(i+4<N && m[i][j]=='S' && m[i+1][j]=='I' && m[i+2][j]=='B' && m[i+3][j]=='O' && m[i+4][j]=='M') cnt++;
            if(i+4<N && j+4<N && m[i][j]=='M' && m[i+1][j+1]=='O' && m[i+2][j+2]=='B' && m[i+3][j+3]=='I' && m[i+4][j+4]=='S') cnt++;
            if(i+4<N && j+4<N && m[i][j]=='S' && m[i+1][j+1]=='I' && m[i+2][j+2]=='B' && m[i+3][j+3]=='O' && m[i+4][j+4]=='M') cnt++;
            if(i-4>=0 && j+4<N && m[i][j]=='M' && m[i-1][j+1]=='O' && m[i-2][j+2]=='B' && m[i-3][j+3]=='I' && m[i-4][j+4]=='S') cnt++;
            if(i-4>=0 && j+4<N && m[i][j]=='S' && m[i-1][j+1]=='I' && m[i-2][j+2]=='B' && m[i-3][j+3]=='O' && m[i-4][j+4]=='M') cnt++;
        }
    }
    cout << cnt;
}