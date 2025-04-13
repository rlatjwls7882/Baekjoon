#include<bits/stdc++.h>
using namespace std;

long long pos[1500][2];

bool isRight(int i, int j, int k) {
    long long aa = (pos[i][0]-pos[j][0])*(pos[i][0]-pos[j][0]) + (pos[i][1]-pos[j][1])*(pos[i][1]-pos[j][1]);
    long long bb = (pos[i][0]-pos[k][0])*(pos[i][0]-pos[k][0]) + (pos[i][1]-pos[k][1])*(pos[i][1]-pos[k][1]);
    long long cc = (pos[j][0]-pos[k][0])*(pos[j][0]-pos[k][0]) + (pos[j][1]-pos[k][1])*(pos[j][1]-pos[k][1]);
    return (aa+bb==cc || aa+cc==bb || bb+cc==aa);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> pos[i][0] >> pos[i][1];

    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            for(int k=j+1;k<n;k++) {
                if(isRight(i, j, k)) cnt++;
            }
        }
    }
    cout << cnt;
}