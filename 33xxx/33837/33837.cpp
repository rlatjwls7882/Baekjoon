#include<bits/stdc++.h>
using namespace std;

int chk[5001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        chk[a]++;
    }
    
    int maxSum=0;
    for(int i=1;i<=5000;i++) {
        if(chk[i]) {
            int gcdVal=-1;
            for(int j=1;j<=5000;j++) {
                if(chk[j] && j%i!=0) {
                    if(gcdVal==-1) gcdVal = j;
                    else gcdVal = gcd(gcdVal, j);
                }
            }
            
            if(gcdVal==-1) {
                if(n==1) {
                    gcdVal=0;
                } else {
                    for(int j=5000;j>=1;j--) {
                        if(chk[j]>=2 || chk[j] && i!=j) {
                            gcdVal=j;
                            break;
                        }
                    }
                }
            }
            maxSum = max(maxSum, i+gcdVal);
        }
    }
    cout << maxSum;
}