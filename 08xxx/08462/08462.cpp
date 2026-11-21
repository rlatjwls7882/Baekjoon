#include<bits/stdc++.h>
using namespace std;

long long sqrtN, A[100'001], cnt[1'000'001];

struct query {
    long long s, e, idx;
    bool operator<(const query q2) const {
        if(s/sqrtN != q2.s/sqrtN) return s/sqrtN < q2.s/sqrtN;
        return e < q2.e;
    } 
};

long long getCnt(int pos) {
    long long val = A[pos];
    return (pow(cnt[val], 2) - pow(cnt[val]-1, 2)) * val;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, t; cin >> n >> t;
    sqrtN = sqrt(n);
    for(int i=1;i<=n;i++) cin >> A[i];

    vector<query> queries(t);
    for(int i=0;i<t;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].idx=i;
    }
    sort(queries.begin(), queries.end());

    vector<long long> res(t);
    long long cur=0, left=0, right=0; // left ~ right 범위가 현재 범위
    for(int i=0;i<t;i++) {
        while(left<queries[i].s) {
            cur -= getCnt(left);
            cnt[A[left]]--;
            left++;
        }
        while(queries[i].s<left) {
            left--;
            cnt[A[left]]++;
            cur += getCnt(left);
        }
        while(queries[i].e<right) {
            cur -= getCnt(right);
            cnt[A[right]]--;
            right--;
        }
        while(right<queries[i].e) {
            right++;
            cnt[A[right]]++;
            cur += getCnt(right);
        }
        res[queries[i].idx]=cur;
    }
    for(long long e:res) cout << e << '\n';
}