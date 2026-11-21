#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    int cnt=0;
    while(n--) {
        int firstColor=-1, lastColor;
        for(int i=0;i<m;i++) {
            int color; cin >> color;
            if(color) {
                if(firstColor==-1) {
                    cnt++;
                    firstColor=color;
                } else if(firstColor!=color && lastColor!=color) {
                    cnt++;
                }
            } else {
                firstColor=-1;
            }
            lastColor = color;
        }
    }
    cout << cnt;
}