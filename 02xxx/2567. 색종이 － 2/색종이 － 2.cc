#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {-1, 1, 0, 0};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    
    int area[102][102] = {0, };
    int n; cin >> n;
    while(n-->0) {
        int a, b; cin >> a >> b;
        area[b][a]++;
        area[b][a+10]--;
        area[b+10][a+10]++;
        area[b+10][a]--;
    }
    
    for(int i=1;i<=100;i++) { // 오른쪽으로 쓸기
        for(int j=1;j<=100;j++) {
            area[i][j+1]+=area[i][j];
        }
    }
    
    for(int i=1;i<=100;i++) { // 아래쪽으로 쓸기
        for(int j=1;j<=100;j++) {
            area[i+1][j]+=area[i][j];
        }
    }
    
    int cnt=0;
    for(int i=1;i<=100;i++) {
        for(int j=1;j<=100;j++) {
            if(area[i][j]>0) {
                for(int k=0;k<4;k++) {
                    if(area[moveX[k]+i][moveY[k]+j]==0) {
                        cnt++;
                    }
                }
            }
        }
    }
    cout << cnt;
}