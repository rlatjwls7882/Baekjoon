#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    char res[n][n]; fill(&res[0][0], &res[n-1][n], 'W');
    res[0][0]='B';
    int row=3, col=2;
    for(int i=2;i<n;i++) {
        if(i%2==0) {
            for(int j=0;j<i;j++) res[j][col]='B';
            col+=2;
        } else {
            for(int j=0;j<i;j++) res[row][j]='B';
            row+=2;
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) cout << res[i][j];
        cout << '\n';
    }
}