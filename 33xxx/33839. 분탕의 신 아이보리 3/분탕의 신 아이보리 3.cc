#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

int p1, p2;
long long preSum[MAX];
long long maxVal = LONG_LONG_MIN;

struct element {
    long long left;
    int pos;
};

void changeVal(long long val, int pos1, int pos2) {
    if(val>maxVal || val==maxVal && pos1<p1) {
        maxVal = val;
        p1 = pos1;
        p2 = pos2;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i] += preSum[i-1];
    }
    
    if(n>=2) changeVal(-preSum[n], 2, 1);
    deque<element> deq;
    for(int i=1;i<=n;i++) {
        changeVal(-preSum[i-1] +(preSum[i]-preSum[i-1]) -(preSum[n]-preSum[i]), i, i);
        
        while(!deq.empty() && i-deq.front().pos>k) deq.pop_front();
        if(!deq.empty()) {
            long long left = deq.front().left;
            long long mid = (preSum[i] - left);
            long long right = preSum[n] - preSum[i];
            changeVal(-left+mid-right, deq.front().pos, i);
        }
        while(!deq.empty() && deq.back().left>preSum[i-1]) deq.pop_back();
        deq.push_back({preSum[i-1], i});
    }
    cout << maxVal << '\n' << p1 << ' ' << p2;
}