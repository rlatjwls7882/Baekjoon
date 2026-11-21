#include<bits/stdc++.h>
using namespace std;

int conn[50][50];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(true) {
        int u, v; cin >> u >> v;
        if(u==-1) break;
        conn[u-1][v-1]=conn[v-1][u-1]=1;
    }

    for(int m=0;m<n;m++) {
        for(int s=0;s<n;s++) {
            for(int e=0;e<n;e++) {
                if(s!=e && conn[s][m] && conn[m][e]) {
                    if(conn[s][e]) conn[s][e] = min(conn[s][e], conn[s][m]+conn[m][e]);
                    else conn[s][e] = conn[s][m]+conn[m][e];
                }
            }
        }
    }

    int minVal=INT_MAX;
    vector<int> list;
    for(int i=0;i<n;i++) {
        int curMin=1;
        for(int j=0;j<n;j++) curMin = max(curMin, conn[i][j]);
        if(minVal>curMin) {
            minVal=curMin;
            list.clear();
            list.push_back(i+1);
        } else if(minVal==curMin) {
            list.push_back(i+1);
        }
    }

    cout << minVal << ' ' << list.size() << '\n';
    for(int e:list) cout << e << ' ';
}