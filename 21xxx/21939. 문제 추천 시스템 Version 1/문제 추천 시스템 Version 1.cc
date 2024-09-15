#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    priority_queue<P> maxPQ;
    priority_queue<P, vector<P>, greater<P>> minPQ;
    int N; cin >> N;
    map<int, int> problem;
    while(N-->0) {
        int P, L; cin >> P >> L;
        maxPQ.push({L, P});
        minPQ.push({L, P});
        problem[P]=L;
    }

    set<P> solved;
    int M; cin >> M;
    while(M-->0) {
        string s; cin >> s;
        if(s[0]=='a') {
            int P, L; cin >> P >> L;
            problem[P]=L;
            maxPQ.push({L, P});
            minPQ.push({L, P});
        } else if(s[0]=='r') {
            int n; cin >> n;
            if(n==1) {
                while(solved.count(maxPQ.top())) maxPQ.pop();
                cout << maxPQ.top().second << '\n';
            } else {
                while(solved.count(minPQ.top())) minPQ.pop();
                cout << minPQ.top().second << '\n';
            }
        } else {
            int n; cin >> n;
            solved.insert({problem[n], n});
        }
    }
}