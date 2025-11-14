#include<bits/stdc++.h>
using namespace std;

int pos[998];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n-2;i++) {
        string s; cin >> s;
        pos[i] = s.find('0');
    }

    int minDist=INT_MAX;
    for(int i=0;i<4;i++) {
        int dist=0;
        for(int j=0;j<n-2;j++) dist += min({abs(pos[j]-i), abs(pos[j]-i-4), abs(pos[j]-i+4)});
        minDist = min(minDist, dist);
    }
    cout << minDist+n+2;
}