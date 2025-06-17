#include<bits/stdc++.h>
using namespace std;

int cnt[6];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int stdCnt=0, grade=0;
    while(n--) {
        int a, b; cin >> a >> b;
        for(int i=1;i<=5;i++) {
            if(i!=a && i!=b) cnt[i]=0;
            else cnt[i]++;

            if(stdCnt<cnt[i] || stdCnt==cnt[i] && grade>i) {
                stdCnt = cnt[i];
                grade = i;
            }
        }
    }
    cout << stdCnt << ' ' << grade;
}