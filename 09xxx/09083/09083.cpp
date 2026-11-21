#include<bits/stdc++.h>
using namespace std;

struct element {
    int t, type; // 1: A위치, 2: B위치
    bool operator<(const element e) const {
        return t < e.t;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int d; cin >> d;

        vector<element> times;
        int a; cin >> a;
        while(a--) {
            int h, m; char ch; cin >> h >> ch >> m;
            times.push_back({h*60+m, 1});
        }
        int b; cin >> b;
        while(b--) {
            int h, m; char ch; cin >> h >> ch >> m;
            times.push_back({h*60+m, 2});
        }
        sort(times.begin(), times.end());

        vector<int> remainA, remainB;
        for(auto time : times) {
            if(time.type==1) {
                if(!remainA.empty() && remainA.front()<=time.t) {
                    int idx=0;
                    for(int i=1;i<remainA.size();i++) {
                        if(remainA[i]<=time.t) idx=i;
                    }
                    remainA.erase(remainA.begin()+idx);
                } else if(!remainB.empty() && remainB.front()+d<=time.t) {
                    int idx=0;
                    for(int i=1;i<remainB.size();i++) {
                        if(remainB[i]+d<=time.t) idx=i;
                    }
                    remainB.erase(remainB.begin()+idx);
                }
                remainB.push_back(time.t+d);
            } else {
                if(!remainB.empty() && remainB.front()<=time.t) {
                    int idx=0;
                    for(int i=1;i<remainB.size();i++) {
                        if(remainB[i]<=time.t) idx=i;
                    }
                    remainB.erase(remainB.begin()+idx);
                } else if(!remainA.empty() && remainA.front()+d<=time.t) {
                    int idx=0;
                    for(int i=1;i<remainA.size();i++) {
                        if(remainA[i]+d<=time.t) idx=i;
                    }
                    remainA.erase(remainA.begin()+idx);
                }
                remainA.push_back(time.t+d);
            }
        }
        cout << remainA.size()+remainB.size() << '\n';
    }
}