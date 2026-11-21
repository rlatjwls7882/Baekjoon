#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string m[3*N];
    for(int i=0;i<3*N;i++) {
        cin >> m[i];
    }

    for(int i=1;i<3*N;i+=3) {
        for(int j=1;j<3*M;j+=3) {
            if((i/3+j/3)%2==1) {
                if(i/3-1>=0 && m[i-2][j]=='#') m[i-1][j]=m[i][j]='#';
                if(i/3+1<N && m[i+2][j]=='#') m[i+1][j]=m[i][j]='#';
                if(j/3-1>=0 && m[i][j-2]=='#') m[i][j-1]=m[i][j]='#';
                if(j/3+1<M && m[i][j+2]=='#') m[i][j+1]=m[i][j]='#';
            }
        }
    }

    for(int i=0;i<3*N;i++) {
        cout << m[i] << '\n';
    }
}