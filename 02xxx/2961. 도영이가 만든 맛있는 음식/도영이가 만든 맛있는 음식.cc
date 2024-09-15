#include<bits/stdc++.h>
using namespace std;

int N, diff=INT_MAX;
int taste[10][2];

void dfs(int x, int sour, int bitter) {
    if(x!=0) diff = min(diff, abs(sour-bitter));
    for(int i=x;i<N;i++) {
        dfs(i+1, sour*taste[i][0], bitter+taste[i][1]);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);\
    cin >> N;

    for(int i=0;i<N;i++) {
        for(int j=0;j<2;j++) {
            cin >> taste[i][j];
        }
    }
    dfs(0, 1, 0);
    cout << diff;
}