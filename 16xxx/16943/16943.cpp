#include<bits/stdc++.h>
using namespace std;

int cnt[10];
int A, B, res=-1, len;

void back(int depth, int C) {
    if(depth==len) {
        if(C<=B) res = max(res, C);
        return;
    }
    for(int i=0;i<10;i++) {
        if(cnt[i] && C*10+i>0) {
            cnt[i]--;
            back(depth+1, C*10+i);
            cnt[i]++;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> A >> B;
    while(true) {
        len++;
        cnt[A%10]++;
        A/=10;
        if(A==0) break;
    }
    back(0, 0);
    cout << res;
}