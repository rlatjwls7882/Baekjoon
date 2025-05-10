#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

/** 
 * A[i] : 수열의 값
 * cnt[i] : 범위에서 i가 등장한 횟수
 * cntCnt[i] : 범위에서 cnt[i]가 등장한 횟수
 */
int sqrtN, A[MAX], cnt[MAX], cntCnt[MAX], maxCnt;

struct query {
    int s, e, idx;
    bool operator<(const query q2) const {
        if(s/sqrtN != q2.s/sqrtN) return s/sqrtN < q2.s/sqrtN;
        return e < q2.e;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    sqrtN = sqrt(n);
    
    for(int i=1;i<=n;i++) cin >> A[i];
    
    int m; cin >> m;
    vector<query> queries(m);
    for(int i=0;i<m;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].idx=i;
    }
    sort(queries.begin(), queries.end());

    vector<int> res(m);
    int left=0, right=0; // left+1 ~ right 까지의 범위.
    for(int i=0;i<m;i++) {
        while(queries[i].s<left) {
            left--;
            cntCnt[cnt[A[left]]]--;
            cnt[A[left]]++;
            cntCnt[cnt[A[left]]]++;
            maxCnt = max(maxCnt, cnt[A[left]]);
        }
        while(left<queries[i].s) {
            cntCnt[cnt[A[left]]]--;
            cnt[A[left]]--;
            cntCnt[cnt[A[left]]]++;
            left++;
            if(cntCnt[maxCnt]==0) maxCnt--;
        }
        while(queries[i].e<right) {
            cntCnt[cnt[A[right]]]--;
            cnt[A[right]]--;
            cntCnt[cnt[A[right]]]++;
            right--;
            if(cntCnt[maxCnt]==0) maxCnt--;
        }
        while(right<queries[i].e) {
            right++;
            cntCnt[cnt[A[right]]]--;
            cnt[A[right]]++;
            cntCnt[cnt[A[right]]]++;
            maxCnt = max(maxCnt, cnt[A[right]]);
        }
        res[queries[i].idx] = maxCnt;
    }
    for(int e:res) cout << e << '\n';
}