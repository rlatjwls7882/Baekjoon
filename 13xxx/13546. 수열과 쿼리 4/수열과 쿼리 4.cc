#include<bits/stdc++.h>
using namespace std;

const int MAX = 111'111;
const int sqrtSize = 316;

/** 
 * diffs[i] : 각각의 숫자에 대한 최대 거리의 등장 횟수
 * bucket[i] : 제곱근 분할 구간의 등장 횟수들
 */
vector<deque<int>> deqs(MAX);
int n, k, A[MAX];
int diffs[MAX], bucket[sqrtSize*2];

struct query {
    int s, e, idx;
    bool operator<(const query q) const {
        if(s/sqrtSize == q.s/sqrtSize) return e < q.e;
        return s/sqrtSize < q.s/sqrtSize;
    }
};

void prevDiff(int val) {
    if(deqs[val].size()<=1) return;
    int diff = deqs[val].back() - deqs[val].front();
    diffs[diff]--;
    bucket[diff/sqrtSize]--;
}

void nextDiff(int val) {
    if(deqs[val].size()<=1) return;
    int diff = deqs[val].back() - deqs[val].front();
    diffs[diff]++;
    bucket[diff/sqrtSize]++;
}

int getMax() {
    for(int i=n/sqrtSize;i>=0;i--) {
        if(bucket[i]>0) {
            for(int j=sqrtSize-1;j>=0;j--) {
                if(diffs[i*sqrtSize+j]>0) return i*sqrtSize+j;
            }
        }
    }
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;
    for(int i=1;i<=n;i++) cin >> A[i];

    int q; cin >> q;
    vector<query> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].idx = i;
    }
    sort(queries.begin(), queries.end());

    deqs[0].push_front(0); // 초기값
    vector<int> res(q);
    int left=0, right=0; // left ~ right까지의 구간
    for(int i=0;i<q;i++) {
        while(queries[i].s<left) {
            left--;
            prevDiff(A[left]);
            deqs[A[left]].push_front(left);
            nextDiff(A[left]);
        }
        while(right<queries[i].e) {
            right++;
            prevDiff(A[right]);
            deqs[A[right]].push_back(right);
            nextDiff(A[right]);
        }
        while(left<queries[i].s) {
            prevDiff(A[left]);
            deqs[A[left]].pop_front();
            nextDiff(A[left]);
            left++;
        }
        while(queries[i].e<right) {
            prevDiff(A[right]);
            deqs[A[right]].pop_back();
            nextDiff(A[right]);
            right--;
        }
        res[queries[i].idx] = getMax();
    }
    for(int e : res) cout << e << '\n';
}