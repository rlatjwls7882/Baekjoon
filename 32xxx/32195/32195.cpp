#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<double> dist;
    int P=0;
    while(N-->0) {
        long long x, y; cin >> x >> y;
        if(y<abs(x)) P++;
        else dist.push_back(sqrt(x*x+y*y));
    }
    dist.push_back(0);

    sort(dist.begin(), dist.end());
    int Q; cin >> Q;
    while(Q-->0) {
        int R; cin >> R;
        int left=0, right=dist.size()-1;
        while(left<right) {
            int mid = (left+right+1)/2;
            if(dist[mid]<=R) left=mid;
            else right=mid-1;
        }
        cout << P << ' ' << left << ' ' << dist.size()-1-left << '\n';
    }
}