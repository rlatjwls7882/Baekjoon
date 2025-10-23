#include<bits/stdc++.h>
using namespace std;

bool exist[10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<5;i++) {
        int a; cin >> a;
        exist[a]=true;
    }

    int minCnt=5;
    for(int i=1;i<=5;i++) {
        int cnt=0;
        for(int j=i;j<=i+4;j++) cnt += !exist[j];
        minCnt = min(minCnt, cnt);
    }
    cout << minCnt;
}