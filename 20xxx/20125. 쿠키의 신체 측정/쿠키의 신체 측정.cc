#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    string map[N];
    for(int i=0;i<N;i++) {
        cin >> map[i];
    }

    int x, y;
    for(int i=1;i<N-1;i++) {
        for(int j=1;j<N-1;j++) {
            if(map[i][j]=='*' && map[i-1][j]=='*' && map[i][j-1]=='*' && map[i+1][j]=='*' && map[i][j+1]=='*') {
                x=i;
                y=j;
            }
        }
    }

    cout << x+1 << " " << y+1 << '\n';
    int cnt=0; // 왼팔
    for(int i=y-1;i>=0;i--) {
        if(map[x][i]=='*') cnt++;
        else break;
    }
    cout << cnt << ' ';
    
    cnt=0; // 오른팔
    for(int i=y+1;i<N;i++) {
        if(map[x][i]=='*') cnt++;
        else break;
    }
    cout << cnt << ' ';
    
    cnt=0; // 허리
    for(int i=x+1;i<N;i++) {
        if(map[i][y]=='*') cnt++;
        else {
            x=i-1;
            break;
        }
    }
    cout << cnt << ' ';
    
    cnt=0; // 왼다리
    for(int i=x+1;i<N;i++) {
        if(map[i][y-1]=='*') cnt++;
        else break;
    }
    cout << cnt << ' ';
    
    cnt=0; // 오른다리
    for(int i=x+1;i<N;i++) {
        if(map[i][y+1]=='*') cnt++;
        else break;
    }
    cout << cnt;
}