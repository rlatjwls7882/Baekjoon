#include<bits/stdc++.h>
using namespace std;

int n;
int minVal=INT_MAX, maxVal=INT_MIN;
char ch[5][5];

int calc(int a, char opt, char b) {
    b-='0';
    if(opt=='+') return a+b;
    else if(opt=='-') return a-b;
    else return a*b;
}

void search(int x, int y, int val) {
    if(x==n-1 && y==n-1) {
        minVal = min(minVal, val);
        maxVal = max(maxVal, val);
        return;
    }
    if(x<n-1) search(x+2, y, calc(val, ch[x+1][y], ch[x+2][y]));
    if(y<n-1) search(x, y+2, calc(val, ch[x][y+1], ch[x][y+2]));
    if(x<n-1 && y<n-1) {
        search(x+1, y+1, calc(val, ch[x+1][y], ch[x+1][y+1]));
        search(x+1, y+1, calc(val, ch[x][y+1], ch[x+1][y+1]));
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> ch[i][j];
        }
    }
    search(0, 0, ch[0][0]-'0');
    cout << maxVal << ' ' << minVal;
}