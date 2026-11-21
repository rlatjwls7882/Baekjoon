#include<bits/stdc++.h>
using namespace std;

struct Participants {
    string name; int rank;
    Participants(string name, int rank) {
        this->name=name;
        this->rank=rank;
    }

    bool operator<(const Participants a) const {
        return this->rank>a.rank;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    priority_queue<Participants> pq;
    while(N-->0) {
        string a, b, c; int S, A; cin >> a >> b >> c >> S >> A;
        if(b[0]=='j' && c[0]=='n' && (S==-1 || S>3)) {
            pq.push(Participants(a, A));
        }
    }

    set<string> s;
    for(int i=0;i<10 && !pq.empty();i++) {
        s.insert(pq.top().name); pq.pop();
    }

    cout << s.size();
    for(string tmp:s) {
        cout << '\n' << tmp;
    }
}