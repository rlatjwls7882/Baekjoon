#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    priority_queue<int, vector<int>, less<int>> pq;
    for(int i=0;i<N;i++) {
        int tmp; cin >> tmp;
        pq.push(tmp);
    }

    int sum=0, cnt=N/2;
    while(cnt-->0) {
        sum += pq.top()*2; pq.pop();
    }
    if(N%2==1) {
        sum += pq.top();
    }
    cout << sum;
}