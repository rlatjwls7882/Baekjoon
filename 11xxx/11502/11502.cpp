#include <bits/stdc++.h>
#define MAX 1000000
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    bool primeNum[MAX]; fill(primeNum, primeNum+MAX, true);
    for(int i=2;i*i<=MAX;i++) {
        if(primeNum[i]) {
            for(int j=i*i;j<=MAX;j+=i) {
                primeNum[j]=false;
            }
        }
    }

    vector<int> primeList;
    for(int i=2;i<=MAX;i++) {
        if(primeNum[i]) {
            primeList.push_back(i);
        }
    }

    int T; cin >> T;
    while(T-->0) {
        int K; cin >> K;
        bool chk=false;
        for(int i=0;i<K;i++) {
            for(int j=i;j<K;j++) {
                for(int k=j;k<K;k++) {
                    if(primeList[i]+primeList[j]+primeList[k]==K) {
                        cout << primeList[i] << " " << primeList[j] << " " << primeList[k] << '\n';
                        chk=true;
                        break;
                    }
                }
                if(chk) break;
            }
            if(chk) break;
        }
    }
}