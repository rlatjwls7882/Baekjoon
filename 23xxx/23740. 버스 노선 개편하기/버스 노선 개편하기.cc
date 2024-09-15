#include<bits/stdc++.h>

using namespace std;

struct Bus {
    int S, E, C;

    Bus(int S, int E, int C) {
        this->S=S;
        this->E=E;
        this->C=C;
    }
    bool operator<(const Bus b) const {
        if(this->S==b.S) return this->E>b.E;
        return this->S<b.S;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<Bus> v;
    for(int i=0;i<N;i++) {
        int S, E, C; cin >> S >> E >> C;
        v.push_back(Bus(S, E, C));
    }
    sort(v.begin(), v.end());

    vector<Bus> merged;
    int first=-1, last=-1, cost=1000000000;
    for(int i=0;i<N;i++) {
        if(last>=v[i].S) {
            last = max(last, v[i].E);
            cost = min(cost, v[i].C);
        } else {
            merged.push_back(Bus(first, last, cost));
            first=v[i].S;
            last=v[i].E;
            cost=v[i].C;
        }
    }
    merged.push_back(Bus(first, last, cost));

    cout << merged.size()-1 << '\n';
    for(int i=1;i<merged.size();i++) {
        cout << merged[i].S << " " << merged[i].E << " " << merged[i].C << '\n';
    }
}