#include<bits/stdc++.h>
using namespace std;

int maxCnt=1, sqrtN, arr[100'001], cur[200'001], cnt[100'001];

struct element {
    int s, e, idx;
    bool operator<(const element el) const {
        if(s/sqrtN!=el.s/sqrtN) return s/sqrtN < el.s/sqrtN;
        return e < el.e;
    }
};

void add(int i) {
    cnt[cur[arr[i]]]--;
    cur[arr[i]]++;
    cnt[cur[arr[i]]]++;
    maxCnt = max(maxCnt, cur[arr[i]]);
}

void sub(int i) {
    cnt[cur[arr[i]]]--;
    cur[arr[i]]--;
    cnt[cur[arr[i]]]++;
    if(!cnt[maxCnt]) maxCnt--;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    sqrtN = sqrt(n);
    for(int i=1;i<=n;i++) {
        cin >> arr[i];
        arr[i] += 100'000;
    }

    vector<element> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].idx=i;
    }
    sort(queries.begin(), queries.end());

    vector<int> res(q);
    cur[0]=1, cnt[0]=n-1, cnt[1]=1;
    int left=0, right=0;
    for(auto [s, e, idx]:queries) {
        while(left<s) sub(left++);
        while(s<left) add(--left);
        while(right<e) add(++right);
        while(e<right) sub(right--);
        res[idx] = maxCnt;
    }
    for(int e:res) cout << e << '\n';
}