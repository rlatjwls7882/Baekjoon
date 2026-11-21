#include<bits/stdc++.h>
using namespace std;

int main(void) {
    string s[15] = {"rat", "cow", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "chicken", "dog", "pig", "lion", "giraffe", "cat"};
    int N; cin >> N;
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
    while(N-->0) {
        int a, b, c; cin >> a >> b >> c;
        pq.push({a*60+b, c});
    }

    int curTime=0;
    while(!pq.empty()) {
        auto cur = pq.top();
        if(curTime>=1440 || max(curTime, cur.first)+cur.second>=1440) break;
        pq.pop();
        curTime = max(curTime, cur.first);
        int nextTime = curTime+cur.second;
        for(int i=curTime/96;i<=nextTime/96;i++) cout << s[i] << ' ';
        cout << '\n';
        printf("%02d:%02d %02d:%02d\n", curTime/60, curTime%60, nextTime/60, nextTime%60);
        curTime = nextTime;
    }
    if(pq.size()) cout << pq.size();
}