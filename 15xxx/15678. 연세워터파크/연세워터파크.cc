#include<bits/stdc++.h>
using namespace std;

struct pos {
    int idx;
    long long val;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, d; cin >> n >> d;

    long long maxVal = LONG_LONG_MIN;
    deque<pos> deq;
    for(int i=0;i<n;i++) {
        long long val; cin >> val;
        while(!deq.empty() && i-deq.front().idx>d) deq.pop_front();
        if(!deq.empty() && deq.front().val>0) val += deq.front().val;

        maxVal = max(maxVal, val);

        while(!deq.empty() && deq.back().val < val) deq.pop_back();
        deq.push_back({i, val});
    }
    cout << maxVal;
}