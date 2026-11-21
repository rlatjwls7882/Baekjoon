#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int p[n];
    for(int i=0;i<n;i++) cin >> p[i];

    int cnt=0;
    for(int i=0;i<n;i++) {
        int sum=0, len=0;
        for(int j=i;j<n;j++) {
            sum += p[j];
            len++;
            if(sum%len==0) {
                int average = sum/len;
                for(int k=i;k<=j;k++) {
                    if(average == p[k]) {
                        cnt++;
                        break;
                    }
                }
            }
        }
    }
    cout << cnt;
}