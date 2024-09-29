#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int len = 10000000;
    vector<bool> notSosu(len);
    for(int i=2;i*i<len;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<len;j+=i) notSosu[j]=true;
        }
    }

    vector<int> sosu;
    for(int i=2;i<len;i++) {
        if(!notSosu[i]) sosu.push_back(i);
    }

    int t; cin >> t;
    for(int c=1;c<=t;c++) {
        int m; cin >> m;
        int n[m];
        for(int i=0;i<m;i++) cin >> n[i];

        int last[m] = {0, };
        int sum[m] = {0, };
        for(int i=0;i<m;i++) {
            while(last[i]<n[i]) {
                sum[i] += sosu[last[i]++];
            }
        }

        while(true) {
            bool change=false;
            int maxSum=0;
            for(int i=0;i<m;i++) maxSum = max(maxSum, sum[i]);

            for(int i=0;i<m;i++) {
                while(maxSum>sum[i]) {
                    sum[i] += -sosu[last[i]-n[i]-1]+sosu[last[i]++];
                    change=true;
                }
            }
            if(!change) {
                if(!notSosu[sum[0]]) break;
                sum[0] += -sosu[last[0]-n[0]-1]+sosu[last[0]++];
            }
        }
        cout << "Scenario " << c << ":\n" << sum[0] << "\n\n";
    }
}