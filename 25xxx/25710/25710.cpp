#include<bits/stdc++.h>
using namespace std;

int cnt[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int num; cin >> num;
        cnt[num]++;
    }

    int maxSum=0;
    for(int i=1;i<=999;i++) {
        for(int j=1;j<=999;j++) {
            if(i==j && cnt[i]>=2 || i!=j && cnt[i] && cnt[j]) {
                string s = to_string(i*j);
                int sum=0;
                for(char e:s) sum += e-'0';
                maxSum = max(maxSum, sum);
            }
        }
    }
    cout << maxSum;
}