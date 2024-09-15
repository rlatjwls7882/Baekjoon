#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, T, P; cin >> N >> T >> P;
    int K[N];
    for(int i=0;i<N;i++) {
        cin >> K[i];
    }

    int maxCnt=0, sum=0;
    priority_queue<int, vector<int>, less<int>> pq;
    for(int i=0;i<N;i++) {
        if(i*P>T) break;
        pq.push(K[i]);
        sum += K[i];

        while(sum+i*P>T) {
            sum -= pq.top();
            pq.pop();
        }
        maxCnt = max(maxCnt, (int)pq.size());
    }
    cout << maxCnt;
}