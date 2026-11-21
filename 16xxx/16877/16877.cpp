#include<bits/stdc++.h>
using namespace std;

const int MAX = 3'000'001;

int g[MAX];
bool grundies[16];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<int> factNum;
    int a=0, b=1;
    while(a+b<MAX) {
        int n = a+b;
        a = b;
        b = n;
        factNum.push_back(n);
    }

    for(int i=1;i<MAX;i++) {
        memset(grundies, 0, sizeof grundies);
        for(int e : factNum) {
            if(e>i) break;
            grundies[g[i-e]]=true;
        }
        for(int j=0;;j++) {
            if(!grundies[j]) {
                g[i]=j;
                break;
            }
        }
    }

    int ret=0;
    while(n--) {
        int p; cin >> p;
        ret ^= g[p];
    }
    cout << (ret ? "koosaga" : "cubelover");
}