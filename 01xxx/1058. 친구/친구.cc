#include<bits/stdc++.h>
#define INF 2501
using namespace std;

int m[50][50];

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    for(int i=0;i<N;i++) {
        string s; cin >> s;
        for(int j=0;j<N;j++) {
            if(s[j]=='Y') m[i][j]=1;
            else m[i][j]=INF;
        }
    }

    for(int mid=0;mid<N;mid++) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                m[i][j] = min(m[i][j], m[i][mid]+m[mid][j]);
            }
        }
    }

    int _max=0;
    for(int i=0;i<N;i++) {
        int cur=0;
        for(int j=0;j<N;j++) {
            if(i!=j && m[i][j]<=2) {
                cur++;
            }
        }
        _max = max(_max, cur);
    }
    cout << _max;
}