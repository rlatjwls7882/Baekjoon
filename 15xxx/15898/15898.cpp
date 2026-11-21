#include <bits/stdc++.h>
using namespace std;

int n, maxSum=0;
bool used[10];
int m[10][4][4];
char ch[10][4][4];

int make1[4][5][5] = {0, };
char make2[4][5][5];

void dfs(int depth) {
    if(depth==3) {
        int sum=0;
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(make2[depth][i][j]=='R') sum += make1[depth][i][j]*7;
                else if(make2[depth][i][j]=='B') sum += make1[depth][i][j]*5;
                else if(make2[depth][i][j]=='G') sum += make1[depth][i][j]*3;
                else if(make2[depth][i][j]=='Y') sum += make1[depth][i][j]*2;
            }
        }
        maxSum = max(maxSum, sum);
        return;
    }

    for(int rep=0;rep<n;rep++) {
        if(!used[rep]) {
            used[rep]=true;
            for(int r=0;r<2;r++) {
                for(int c=0;c<2;c++) {
                    // 그대로
                    for(int i=0;i<5;i++) {
                        for(int j=0;j<5;j++) {
                            make1[depth+1][i][j]=make1[depth][i][j];
                            make2[depth+1][i][j]=make2[depth][i][j];
                        }
                    }
                    for(int i=0;i<4;i++) {
                        for(int j=0;j<4;j++) {
                            make1[depth+1][r+i][c+j] = min(max(make1[depth][r+i][c+j]+m[rep][i][j], 0), 9);
                            if(ch[rep][i][j]!='W') make2[depth+1][r+i][c+j] = ch[rep][i][j];
                        }
                    }
                    dfs(depth+1);

                    // 왼쪽으로 회전
                    for(int i=0;i<5;i++) {
                        for(int j=0;j<5;j++) {
                            make1[depth+1][i][j]=make1[depth][i][j];
                            make2[depth+1][i][j]=make2[depth][i][j];
                        }
                    }
                    for(int i=0;i<4;i++) {
                        for(int j=0;j<4;j++) {
                            make1[depth+1][r+i][c+j] = min(max(make1[depth][r+i][c+j]+m[rep][j][3-i], 0), 9);
                            if(ch[rep][j][3-i]!='W') make2[depth+1][r+i][c+j] = ch[rep][j][3-i];
                        }
                    }
                    dfs(depth+1);

                    // 오른쪽으로 회전
                    for(int i=0;i<5;i++) {
                        for(int j=0;j<5;j++) {
                            make1[depth+1][i][j]=make1[depth][i][j];
                            make2[depth+1][i][j]=make2[depth][i][j];
                        }
                    }
                    for(int i=0;i<4;i++) {
                        for(int j=0;j<4;j++) {
                            make1[depth+1][r+i][c+j] = min(max(make1[depth][r+i][c+j]+m[rep][3-j][i], 0), 9);
                            if(ch[rep][3-j][i]!='W') make2[depth+1][r+i][c+j] = ch[rep][3-j][i];
                        }
                    }
                    dfs(depth+1);

                    // 180도 회전
                    for(int i=0;i<5;i++) {
                        for(int j=0;j<5;j++) {
                            make1[depth+1][i][j]=make1[depth][i][j];
                            make2[depth+1][i][j]=make2[depth][i][j];
                        }
                    }
                    for(int i=0;i<4;i++) {
                        for(int j=0;j<4;j++) {
                            make1[depth+1][r+i][c+j] = min(max(make1[depth][r+i][c+j]+m[rep][3-i][3-j], 0), 9);
                            if(ch[rep][3-i][3-j]!='W') make2[depth+1][r+i][c+j] = ch[rep][3-i][3-j];
                        }
                    }
                    dfs(depth+1);
                }
            }
            used[rep]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n;

    for(int i=0;i<n;i++) {
        for(int j=0;j<4;j++) {
            for(int k=0;k<4;k++) {
                cin >> m[i][j][k];
            }
        }
        for(int j=0;j<4;j++) {
            for(int k=0;k<4;k++) {
                cin >> ch[i][j][k];
            }
        }
    }

    for(int i=0;i<5;i++) {
        for(int j=0;j<5;j++) {
            make1[0][i][j]=0;
            make2[0][i][j]='W';
        }
    }

    dfs(0);
    cout << maxSum;
}