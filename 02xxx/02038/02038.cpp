#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'000'000;
int f[MAX];

int solve(int n) {
    if(n==1) return 1;
    if(n<=3) return 2;

    f[1]=1;
    f[2]=f[3]=2;
    int cur=3, sum=3;
    while(sum<n) {
        if(sum+f[cur]<MAX) {
            for(int i=1;i<=f[cur];i++) {
                f[sum+i] = cur;
            }
        }
        sum += f[cur];
        cur++;
    }
    return cur-1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    cout << solve(n);
}