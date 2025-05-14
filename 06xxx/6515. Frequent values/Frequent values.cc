#include<bits/stdc++.h>
using namespace std;

int sqrtN, cntCnt[100'001], cnt[200'001], a[100'001];
/**
 * cnt[i] : 현재 범위에서 i가 등장한 횟수
 * cntCnt[i] : 현재 범위에서 cnt[j]의 등장횟수가 i인 개수
 */

struct query {
    int s, e, idx;
    bool operator<(const query q2) const {
        if(s/sqrtN != q2.s/sqrtN) return s/sqrtN < q2.s/sqrtN;
        return e < q2.e;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int n, q; cin >> n >> q;
        if(cin.fail()) return 0;
        
        /** init */
        memset(cntCnt, 0, sizeof cntCnt);
        memset(cnt, 0, sizeof cnt);
        sqrtN = sqrt(n);
        /** init */
        
        for(int i=1;i<=n;i++) {
            cin >> a[i];
            a[i] += 100'000;
        }
        
        vector<query> queries(q);
        for(int i=0;i<q;i++) {
            cin >> queries[i].s >> queries[i].e;
            queries[i].idx = i;
        }
        sort(queries.begin(), queries.end());
        
        vector<int> res(q);
        /**
         * left=right=0인 경우에 예외 케이스 두기
         * left가 처음에 증가하면서 cnt[0]과 cntCnt[1]이 감소
         */
        cnt[0] = cntCnt[1] = 1;
        int left=0, right=0, curMaxCnt=0; // left ~ right에서 등장 횟수
        for(int i=0;i<q;i++) {
            while(left<queries[i].s) {
                cntCnt[cnt[a[left]]]--;
                cnt[a[left]]--;
                cntCnt[cnt[a[left]]]++;
                left++;
            }
            while(queries[i].s<left) {
                left--;
                cntCnt[cnt[a[left]]]--;
                cnt[a[left]]++;
                cntCnt[cnt[a[left]]]++;
                curMaxCnt = max(curMaxCnt, cnt[a[left]]);
            }
            while(queries[i].e<right) {
                cntCnt[cnt[a[right]]]--;
                cnt[a[right]]--;
                cntCnt[cnt[a[right]]]++;
                right--;
            }
            while(right<queries[i].e) {
                right++;
                cntCnt[cnt[a[right]]]--;
                cnt[a[right]]++;
                cntCnt[cnt[a[right]]]++;
                curMaxCnt = max(curMaxCnt, cnt[a[right]]);
            }
            while(curMaxCnt>0 && cntCnt[curMaxCnt]==0) curMaxCnt--;
            res[queries[i].idx] = curMaxCnt;
        }
        for(int e:res) cout << e << '\n';
    }
}