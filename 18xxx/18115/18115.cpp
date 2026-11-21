#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int order[n];
    for(int i=0;i<n;i++) {
        cin >> order[i];
    }

    deque<int> deq;
    for(int i=n-1;i>=0;i--) {
        if(order[i]==1) {
            deq.push_back(n-i);
        } else if(order[i]==2) {
            int back = deq.back(); deq.pop_back();
            deq.push_back(n-i);
            deq.push_back(back);
        } else {
            deq.push_front(n-i);
        }
    }

    for(int i=0;i<n;i++) {
        cout << deq.back() << " "; deq.pop_back();
    }
}