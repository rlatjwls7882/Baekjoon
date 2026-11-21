#include<bits/stdc++.h>
using namespace std;

struct pos {
    int x, y;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;

    double maxArea=0;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            for(int k=j+1;k<n;k++) {
                maxArea = max(maxArea, abs(v[i].x*v[j].y+v[j].x*v[k].y+v[k].x*v[i].y-(v[i].x*v[k].y+v[j].x*v[i].y+v[k].x*v[j].y))/2.0);
            }
        }
    }
    cout << setprecision(9) << fixed << maxArea;
}