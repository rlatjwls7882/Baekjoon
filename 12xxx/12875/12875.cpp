#include<bits/stdc++.h>
#define INF 1000000000
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, d; cin >> n >> d;
    int dist[n][n];
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        for(int j=0;j<n;j++) {
            if(s[j]=='Y') dist[i][j]=1;
            else dist[i][j]=INF;
        }
    }

    for(int mid=0;mid<n;mid++) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                dist[i][j] = min(dist[i][j], dist[i][mid]+dist[mid][j]);
            }
        }
    }

    int minDist=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(i!=j) minDist = max(minDist, dist[i][j]);
        }
    }
    if(minDist==INF) cout << -1;
    else cout << minDist*d;
}