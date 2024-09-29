#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    int pos[n+1]; pos[n]=0;
    for(int i=0;i<n;i++) cin >> pos[i];
    sort(pos, pos+n+1);

    int zeroPos;
    for(int i=0;i<=n;i++) if(pos[i]==0) zeroPos=i;

    vector<int> move;
    for(int i=0;i<zeroPos;i+=m) move.push_back(-pos[i]);
    for(int i=n;i>zeroPos;i-=m) move.push_back(pos[i]);

    sort(move.begin(), move.end());
    int sum=0;
    for(int i=0;i<move.size()-1;i++) sum += move[i]*2;
    cout << sum + move.back();
}