#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const int MAX = 100'001;

bool win[MAX];
int preSum[MAX], notSosu[MAX];
vector<int> sosu;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=2;i*i<MAX;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<MAX;j+=i) notSosu[j]=true;
        }
    }
    for(int i=2;i<MAX;i++) {
        if(!notSosu[i]) sosu.push_back(i);
    }

    fill(win, win+MAX, 1);
    for(int i=0;i<MAX;i++) {
        if(i) preSum[i] = preSum[i-1];
        if(win[i]) {
            if(i>=2) preSum[i]++;
            for(int e : sosu) {
                if(i+e>=MAX) break;
                win[i+e]=0;
            }
        }
    }

    int t; cin >> t;
    while(t--) {
        int a, k; cin >> a >> k;

        int x=2;
        for(int i=2;i<=a+1-k;i++) {
            if(preSum[i+k-1]-preSum[i-1] > preSum[x+k-1]-preSum[x-1]) x = i;
        }
        cout << preSum[x+k-1]-preSum[x-1] << ' ' << x << '\n';
    }
}