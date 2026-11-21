#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<int> primeNum = vector<int>(N+1);
    for(int i=2;i<=N;i++) {
        if(primeNum[i]==0) {
            for(int j=i;j<=N;j+=i) {
                if(primeNum[j]==0) {
                    primeNum[j]=i;
                }
            }
        }
    }

    long long sum=0;
    for(int i=2;i<=N;i++) {
        sum += primeNum[i];
    }
    cout << sum;
}