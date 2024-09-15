#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, L; cin >> N >> L;
    int m[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
        }
    }
    
    int cnt=0;
    for(int i=0;i<N;i++) {
        bool chk=true, require=false;
        int cur=m[i][0], len=1;
        for(int j=1;j<N;j++) {
            if(cur==m[i][j]) len++;
            else if(cur+1==m[i][j] && (len>=L && !require || len>=2*L)) {
                require=false;
                cur++;
                len=1;
            } else if(cur==m[i][j]+1 && (!require || len>=L)) {
                require=true;
                cur--;
                len=1;
            } else {
                chk=false;
                break;
            }
        }
        if(chk && (!require || len>=L)) cnt++;
    }
    for(int i=0;i<N;i++) {
        bool chk=true, require=false;
        int cur=m[0][i], len=1;
        for(int j=1;j<N;j++) {
            if(cur==m[j][i]) len++;
            else if(cur+1==m[j][i] && (len>=L && !require || len>=2*L)) {
                require=false;
                cur++;
                len=1;
            } else if(cur==m[j][i]+1 && (!require || len>=L)) {
                require=true;
                cur--;
                len=1;
            } else {
                chk=false;
                break;
            }
        }
        if(chk && (!require || len>=L)) cnt++;
    }
    cout << cnt;
}