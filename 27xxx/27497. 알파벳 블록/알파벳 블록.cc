#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    deque<char> deq;
    stack<int> order;
    while(N-->0) {
        int a; cin >> a;
        if(a==1) {
            char c; cin >> c;
            order.push(a);
            deq.push_back(c);
        } else if(a==2) {
            char c; cin >> c;
            order.push(a);
            deq.push_front(c);
        } else {
            if(!order.empty() && order.top()==1) {
                order.pop();
                deq.pop_back();
            } else if(!order.empty() && order.top()==2) {
                order.pop();
                deq.pop_front();
            }
        }
    }

    if(deq.empty()) {
        cout << 0;
    } else {
        while(!deq.empty()) {
            cout << deq.front(); deq.pop_front();
        }
    }
}