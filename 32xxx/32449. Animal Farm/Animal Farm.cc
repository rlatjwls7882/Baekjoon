#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    vector<int> another;
    int pigMax=0;
    while(n-->0) {
        string species; int influence; cin >> species >> influence;
        if(species.compare("pig")==0) pigMax = max(pigMax, influence);
        else another.push_back(influence);
    }

    long long totalInfluence=pigMax;
    for(int influence:another) if(pigMax>influence) totalInfluence+=influence;
    cout << totalInfluence;
}