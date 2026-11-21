#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

/** 
 * arr[i] - 현재 범위에서 누적합이 i인 개수
 * bucket[i] - i가 나타내는 범위에서의 arr의 합
 */
int sqrtN=316, preSum[MAX];
int bucket[MAX], arr[MAX];
vector<deque<int>> deqs(MAX);

struct query {
    int s, e, idx;
    bool operator<(const query q) const {
        if(s/sqrtN == q.s/sqrtN) return e < q.e;
        return s/sqrtN < q.s/sqrtN;
    }
};

void prevSum(int idx) {
    if(deqs[preSum[idx]].size()<=1) return;
    idx = deqs[preSum[idx]].back() - deqs[preSum[idx]].front();
    arr[idx]--;
    bucket[idx/sqrtN]--;
}

void nextSum(int idx) {
    if(deqs[preSum[idx]].size()<=1) return;
    idx = deqs[preSum[idx]].back() - deqs[preSum[idx]].front();
    arr[idx]++;
    bucket[idx/sqrtN]++;
}

int getMax() {
    for(int i=MAX/sqrtN;i>=0;i--) {
        if(bucket[i]) {
            for(int j=sqrtN-1;j>=0;j--) {
                if(arr[i*sqrtN+j]) return i*sqrtN+j;
            }
        }
    }
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    preSum[0] = 100'000; // -100'000 ~ 100'000 -> 0 ~ 200'001
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i] += preSum[i-1];
    }

    /**
     * preSum[a] == preSum[b]:
     * a+1부터 b까지의 합은 0이다.
     * 그래서 쿼리의 모든 시작부분(s)을 -1 해줌
     */
    int m; cin >> m;
    vector<query> queries(m);
    for(int i=0;i<m;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].s--;
        queries[i].idx = i;
    }
    sort(queries.begin(), queries.end());

    deqs[preSum[0]].push_back(0); // init
    int left=0, right=0; // left+1 ~ right 까지 범위
    vector<int> res(m);
    for(int i=0;i<m;i++) {
        while(queries[i].s<left) {
            left--;
            prevSum(left);
            deqs[preSum[left]].push_front(left);
            nextSum(left);
        }
        while(right<queries[i].e) {
            right++;
            prevSum(right);
            deqs[preSum[right]].push_back(right);
            nextSum(right);
        }
        while(left<queries[i].s) {
            prevSum(left);
            deqs[preSum[left]].pop_front();
            nextSum(left);
            left++;
        }
        while(queries[i].e<right) {
            prevSum(right);
            deqs[preSum[right]].pop_back();
            nextSum(right);
            right--;
        }
        res[queries[i].idx] = getMax();
    }
    for(int e:res) cout << e << '\n'; 
}