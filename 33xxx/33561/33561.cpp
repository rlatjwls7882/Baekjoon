#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll preW[501][501], preBlank[501][501], preD[100'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=n;j++) {
            ll w; cin >> w;
            if(w) preW[i][j]=w;
            else preBlank[i][j]++;
            preW[i][j] += preW[i-1][j]+preW[i][j-1]-preW[i-1][j-1];
            preBlank[i][j] += preBlank[i-1][j]+preBlank[i][j-1]-preBlank[i-1][j-1];
        }
    }

    int k; cin >> k;
    vector<ll> v(k);
    for(int i=0;i<k;i++) cin >> v[i];
    sort(v.begin(), v.end(), greater<ll>());
    for(int i=0;i<k;i++) preD[i+1] = v[i]+preD[i];

    long long maxRect=0;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=n;j++) {
            for(int size=1;size<=i && size<=j;size++) {
                int blankCnt = preBlank[i][j]-preBlank[i-size][j]-preBlank[i][j-size]+preBlank[i-size][j-size];
                if(blankCnt<=k) maxRect = max(maxRect, preD[blankCnt]+preW[i][j]-preW[i-size][j]-preW[i][j-size]+preW[i-size][j-size]);
                else break;
            }
        }
    }
    cout << maxRect;
}