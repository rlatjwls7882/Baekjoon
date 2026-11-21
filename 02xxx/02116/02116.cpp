#include<bits/stdc++.h>
using namespace std;

int conn[10000][6][4];
int notConn[10000][6];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    for(int i=0;i<N;i++) {
        int A, B, C, D, E, F; cin >> A >> B >> C >> D >> E >> F;
        conn[i][A-1][0]=B-1; conn[i][A-1][1]=C-1; conn[i][A-1][2]=D-1; conn[i][A-1][3]=E-1; notConn[i][A-1]=F-1;
        conn[i][B-1][0]=A-1; conn[i][B-1][1]=C-1; conn[i][B-1][2]=E-1; conn[i][B-1][3]=F-1; notConn[i][B-1]=D-1;
        conn[i][C-1][0]=A-1; conn[i][C-1][1]=B-1; conn[i][C-1][2]=D-1; conn[i][C-1][3]=F-1; notConn[i][C-1]=E-1;
        conn[i][D-1][0]=A-1; conn[i][D-1][1]=C-1; conn[i][D-1][2]=E-1; conn[i][D-1][3]=F-1; notConn[i][D-1]=B-1;
        conn[i][E-1][0]=A-1; conn[i][E-1][1]=B-1; conn[i][E-1][2]=D-1; conn[i][E-1][3]=F-1; notConn[i][E-1]=C-1;
        conn[i][F-1][0]=B-1; conn[i][F-1][1]=C-1; conn[i][F-1][2]=D-1; conn[i][F-1][3]=E-1; notConn[i][F-1]=A-1;
    }

    int maxSum=0;
    for(int i=0;i<6;i++) {
        int curSum=0, last=i;
        for(int j=0;j<N;j++) {
            curSum += *max_element(conn[j][last], conn[j][last]+4)+1;
            last = notConn[j][last];
        }
        maxSum = max(maxSum, curSum);
    }
    cout << maxSum;
}