#include<bits/stdc++.h>
using namespace std;

const int MAX = 500'001;

int n, q, sqrtN, cnt[MAX], A[MAX];

struct query {
    int s, e, idx;
    bool operator<(const query q2) const {
        if(s/sqrtN != q2.s/sqrtN) return s/sqrtN < q2.s/sqrtN;
        return e < q2.e;
    }
};

vector<query> queries;

void init() {
    cin >> n >> q;
    sqrtN = sqrt(n);

    // 좌표 압축 (1-indexed)
    unordered_map<int, int> valToIdx;
    for(int i=1;i<=n;i++) {
        cin >> A[i];
        if(!valToIdx.count(A[i])) valToIdx[A[i]] = valToIdx.size()+1;
        A[i] = valToIdx[A[i]];
    }

    queries = vector<query>(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].idx=i;
    }
    sort(queries.begin(), queries.end());
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    init();

    // A[0]==0, cnt[0]=-1 유의
    vector<int> res(q);
    int curCnt=0, left=0, right=0; // 현재 left ~ right까지의 범위가 선택됨.
    for(int i=0;i<q;i++) {
        while(left<queries[i].s) {
            cnt[A[left]]--;
            if(cnt[A[left]]==2) curCnt++;
            if(cnt[A[left]]==1) curCnt--;
            left++;
        }
        while(queries[i].s<left) {
            left--;
            cnt[A[left]]++;
            if(cnt[A[left]]==2) curCnt++;
            if(cnt[A[left]]==3) curCnt--;
        }
        while(queries[i].e<right) {
            cnt[A[right]]--;
            if(cnt[A[right]]==2) curCnt++;
            if(cnt[A[right]]==1) curCnt--;
            right--;
        }
        while(right<queries[i].e) {
            right++;
            cnt[A[right]]++;
            if(cnt[A[right]]==2) curCnt++;
            if(cnt[A[right]]==3) curCnt--;
        }
        res[queries[i].idx] = curCnt;
    }
    for(int e:res) cout << e << '\n';
}