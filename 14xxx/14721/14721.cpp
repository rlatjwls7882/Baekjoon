#include<bits/stdc++.h>
using namespace std;

struct pos {
    int x, y;
};

long long sq(long long x) {
    return x*x;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;

    int x, y;
    long long minRss = LONG_LONG_MAX;
    for(int a=1;a<=100;a++) {
        for(int b=1;b<=100;b++) {
            long long rss=0;
            for(int i=0;i<n;i++) rss += sq(v[i].x*a + b - v[i].y);

            if(rss<minRss) {
                minRss = rss;
                x = a;
                y = b;
            }
        }
    }
    cout << x << ' ' << y;
}