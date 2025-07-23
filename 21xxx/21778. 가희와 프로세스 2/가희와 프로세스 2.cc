#include<bits/stdc++.h>
using namespace std;

const long long extra = 1e15; // 우선순위에 공통으로 더해줄 적당히 큰 수

struct element {
    long long a, b, c;
    bool operator<(const element e) const {
        if(c==e.c) return a < e.a;
        return c > e.c;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int q, n; cin >> q >> n;
    vector<element> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].a >> v[i].b >> v[i].c;
        v[i].c += extra;
    }

    while(q--) {
        long long t; cin >> t;

        // 우선순위를 어디까지 공통으로 감소시킬지 이분탐색
        long long left=1, right=1e17;
        while(left<right) {
            long long mid = (left+right)/2;

            long long sum=0;
            for(int i=0;i<n;i++) sum += min(max(v[i].c-mid, 0LL), v[i].b);
            if(sum>=t) left=mid+1;
            else right=mid;
        }

        // 나머지 연산은 최대 n번
        vector<element> cur;
        for(int i=0;i<n;i++) {
            long long cnt = max(v[i].c-left, 0LL);
            if(v[i].b>cnt) cur.push_back({v[i].a, v[i].b-cnt, v[i].c-cnt});
            t -= min(cnt, v[i].b);
        }
        sort(cur.begin(), cur.end());

        cout << cur[t-1].a << '\n';
    }
}