#include<bits/stdc++.h>
using namespace std;

int k;
long long maxVal=0, minVal=9999999999;
char chars[10];
bool used[10] = {false, };

void dfs(int depth, long long val) {
    if(depth==k+1) {
        maxVal = max(maxVal, val);
        minVal = min(minVal, val);
    }

    for(int i=0;i<=9;i++) {
        if(!used[i]) {
            if(depth==0 || chars[depth]=='<' && val%10<i || chars[depth]=='>' && val%10>i) {
                used[i]=true;
                dfs(depth+1, val*10+i);
                used[i]=false;
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> k;
    for(int i=1;i<=k;i++) {
        cin >> chars[i];
    }
    dfs(0, 0);

    for(int i=(int)(log10(maxVal)+1);i<=k;i++) {
        cout << '0';
    }
    cout << maxVal << '\n';

    for(int i=(int)(log10(minVal)+1);i<=k;i++) {
        cout << '0';
    }
    cout << minVal << '\n';
}