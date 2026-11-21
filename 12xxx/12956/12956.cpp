#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int n, m;
int minT[100][100], original[100][100];

struct edge {
    int a, b, c;
};

vector<edge> edges(2000);

void floyd(int limit) {
    fill(&minT[0][0], &minT[99][100], INF);
    for(int i=0;i<m;i++) {
        if(i!=limit) {
            minT[edges[i].a][edges[i].b] = min(minT[edges[i].a][edges[i].b], edges[i].c);
            minT[edges[i].b][edges[i].a] = min(minT[edges[i].b][edges[i].a], edges[i].c);
        }
    }
    for(int m=0;m<n;m++) {
        for(int s=0;s<n;s++) {
            for(int e=0;e<n;e++) {
                minT[s][e] = min(minT[s][e], minT[s][m] + minT[m][e]);
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<m;i++) cin >> edges[i].a >> edges[i].b >> edges[i].c;

    floyd(-1);
    memcpy(original, minT, sizeof minT);

    for(int i=0;i<m;i++) {
        floyd(i);
        int cnt=0;
        for(int j=0;j<n;j++) {
            for(int k=j+1;k<n;k++) {
                if(original[j][k] != minT[j][k]) cnt++;
            }
        }
        cout << cnt << ' ';
    }
}