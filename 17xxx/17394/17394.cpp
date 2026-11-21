#include<bits/stdc++.h>
using namespace std;

int minDist[2'000'000];

bool isSosu(int n) {
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) return false;
    }
    return true;
}

bool canMakeSosu(int a, int b) {
    for(int i=a;i<=b;i++) {
        if(isSosu(i)) return true;
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, a, b; cin >> n >> a >> b;

        if(!canMakeSosu(a, b)) {
            cout << "-1\n";
        } else {
            memset(minDist, -1, sizeof minDist);
            queue<int> q; q.push(n);
            minDist[n]=0;
            while(!q.empty()) {
                int cur = q.front(); q.pop();
                if(a<=cur && cur<=b && isSosu(cur)) {
                    cout << minDist[cur] << '\n';
                    break;
                }
                if(minDist[cur/3]==-1) {
                    q.push(cur/3);
                    minDist[cur/3] = minDist[cur]+1;
                }
                if(minDist[cur/2]==-1) {
                    q.push(cur/2);
                    minDist[cur/2] = minDist[cur]+1;
                }
                if(minDist[cur+1]==-1) {
                    q.push(cur+1);
                    minDist[cur+1] = minDist[cur]+1;
                }
                if(minDist[cur-1]==-1) {
                    q.push(cur-1);
                    minDist[cur-1] = minDist[cur]+1;
                }
            }
        }
    }
}