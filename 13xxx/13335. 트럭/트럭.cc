#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, w, L; cin >> n >> w >> L;
    int a[n];
    for(int i=0;i<n;i++) {
        cin >> a[i];
    }

    int time=0, sum=0, cnt=0;
    queue<int> q;
    while(q.size()<w) {
        q.push(0);
    }

    for(int i=0;i<n;i++) {
        while(sum-q.front()+a[i]>L) {
            if(q.front()==a[cnt]) cnt++;
            sum -= q.front(); q.pop(); q.push(0);
            time++;
        }
        if(q.front()==a[cnt]) cnt++;
        sum = sum-q.front()+a[i]; q.pop();
        q.push(a[i]);
        time++;
    }
    while(cnt<n) {
        if(q.front()==a[cnt]) cnt++;
        q.pop();
        time++;
    }
    cout << time;
}