#include<bits/stdc++.h>

using namespace std;

bool comp(pair<int, int> a, pair<int, int> b) {
    if(a.first==b.first) {
        return a.second<b.second;
    }
    return a.first<b.first;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    pair<int, int> lines[N];
    for(int i=0;i<N;i++) {
        int x, y; cin >> x >> y;
        lines[i] = make_pair(x, y);
    }
    sort(lines, lines+N, comp);

    int sum=0, left=-1000000000, right=-1000000000;
    for(int i=0;i<N;i++) {
        if(right<lines[i].first) {
            sum += right-left;
            left = lines[i].first;
            right = lines[i].second;
        } else {
            right = max(right, lines[i].second);
        }
    }
    sum += right-left;
    
    cout << sum;
}