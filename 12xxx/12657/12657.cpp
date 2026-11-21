#include<bits/stdc++.h>
using namespace std;

int parent[100];
int moveX[4] = {-1, 0, 0, 1};
int moveY[4] = {0, -1, 1, 0};

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) parent[y]=x;
    else parent[x]=y;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    for(int i=1;i<=t;i++) {
        int h, w; cin >> h >> w;
        int altitudes[h][w];
        for(int j=0;j<h;j++) {
            for(int k=0;k<w;k++) {
                cin >> altitudes[j][k];
            }
        }

        for(int j=0;j<h*w;j++) {
            parent[j]=j;
        }

        for(int j=0;j<h;j++) {
            for(int k=0;k<w;k++) {
                int lowest=9;
                for(int l=0;l<4;l++) {
                    int nextX = j+moveX[l];
                    int nextY = k+moveY[l];
                    if(nextX<0 || nextX>=h || nextY<0 || nextY>=w || altitudes[nextX][nextY]>=altitudes[j][k]) continue;
                    lowest = min(lowest, altitudes[nextX][nextY]);
                }
                if(lowest<altitudes[j][k]) {
                    for(int l=0;l<4;l++) {
                        int nextX = j+moveX[l];
                        int nextY = k+moveY[l];
                        if(nextX<0 || nextX>=h || nextY<0 || nextY>=w || altitudes[nextX][nextY]!=lowest) continue;
                        _union(j*w+k, nextX*w+nextY);
                        break;
                    }
                }
            }
        }

        int idx=0;
        char res[h*w] = {0, };
        cout << "Case #" << i << ":\n";
        for(int j=0;j<h;j++) {
            for(int k=0;k<w;k++) {
                if(res[_find(j*w+k)]==0) {
                    res[_find(j*w+k)]='a'+idx++;
                }
                cout << res[_find(j*w+k)] << ' ';
            }
            cout << '\n';
        }
    }
}