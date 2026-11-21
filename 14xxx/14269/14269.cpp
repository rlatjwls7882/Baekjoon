#include<bits/stdc++.h>
using namespace std;

struct element {
    int a, b, c;
    bool operator<(const element e) const {
        return c < e.c;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    set<int> sword;
    vector<element> v;
    while(n--) {
        int a, b, c; cin >> a >> b >> c;
        sword.insert(a);
        v.push_back({a, b, c});
    }
    sort(v.begin(), v.end());

    for(auto e : v) {
        auto iter = sword.lower_bound(e.b);
        if(iter==sword.end() || *iter>e.c) sword.insert(e.c);
    }

    set<int> extra; // 왼손 오른손 같은검이 필요한 경우
    for(auto e : v) {
        auto iter = sword.lower_bound(e.b);
        if(*sword.lower_bound(e.b)==e.a && (sword.lower_bound(e.a+1)==sword.end() || *sword.lower_bound(e.a+1)>e.c)) extra.insert(e.c);
    }
    cout << sword.size() + extra.size();
}