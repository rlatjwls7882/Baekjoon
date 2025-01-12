#include<bits/stdc++.h>
using namespace std;

int pos[101][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int w, h, n; cin >> w >> h >> n;
    for(int i=0;i<=n;i++) cin >> pos[i][0] >> pos[i][1];

    int sum=0;
    for(int i=0;i<n;i++) {
        if(pos[i][0]==pos[n][0]) sum += abs(pos[i][1]-pos[n][1]);
        else {
            if(pos[i][0]+pos[n][0]==3 || pos[i][0]+pos[n][0]==7) {
                if(pos[i][0]<=2) sum += h + min(pos[i][1]+pos[n][1], 2*w-pos[i][1]-pos[n][1]);
                else sum += w + min(pos[i][1]+pos[n][1], 2*h-pos[i][1]-pos[n][1]);
            } else {
                if(pos[i][0]==1 && pos[n][0]==3 || pos[i][0]==3 && pos[n][0]==1) sum += pos[i][1]+pos[n][1];
                else if(pos[i][0]==2 && pos[n][0]==4 || pos[i][0]==4 && pos[n][0]==2) sum += w+h-pos[i][1]-pos[n][1];
                else if(pos[i][0]==2 && pos[n][0]==3) sum += pos[i][1] + h-pos[n][1];
                else if(pos[i][0]==3 && pos[n][0]==2) sum += h-pos[i][1] + pos[n][1];
                else if(pos[i][0]==1 && pos[n][0]==4) sum += w-pos[i][1] + pos[n][1];
                else sum += pos[i][1] + w-pos[n][1];
            }
        }
    }
    cout << sum;
}