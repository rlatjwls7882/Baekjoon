#include<bits/stdc++.h>
using namespace std;

int n, k, sqrtN=1000;
long long preSum[100'001];
vector<list<int>> deqs(1'000'001);
int bucket[1'001], cnt[1'000'001];

struct query {
    int s, e, idx;
    bool operator<(const query q) const {
        if(s/sqrtN == q.s/sqrtN) return e < q.e;
        return s/sqrtN < q.s/sqrtN;
    }
};

void prevSum(int idx) {
    if(deqs[idx].size()<=1) return;
    idx = deqs[idx].back() - deqs[idx].front();
    cnt[idx]--;
    bucket[idx/sqrtN]--;
}

void nextSum(int idx) {
    if(deqs[idx].size()<=1) return;
    idx = deqs[idx].back() - deqs[idx].front();
    cnt[idx]++;
    bucket[idx/sqrtN]++;
}

int getMax() {
    for(int i=n/sqrtN;i>=0;i--) {
        if(bucket[i]) {
            for(int j=sqrtN-1;j>=0;j--) {
                if(cnt[i*sqrtN+j]) return i*sqrtN+j;
            }
        }
    }
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i] = (preSum[i] + preSum[i-1]) % k;
    }

    int m; cin >> m;
    vector<query> queries(m);
    for(int i=0;i<m;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].idx = i;
        queries[i].s--; // e - s 시 e - s + 1 범위 사용
    }
    sort(queries.begin(), queries.end());

    deqs[0].push_front(0); // init
    int left=0, right=0; // left ~ right 까지의 범위
    vector<int> res(m);
    for(int i=0;i<m;i++) {
        while(queries[i].s<left) {
            left--;
            prevSum(preSum[left]);
            deqs[preSum[left]].push_front(left);
            nextSum(preSum[left]);
        }
        while(right<queries[i].e) {
            right++;
            prevSum(preSum[right]);
            deqs[preSum[right]].push_back(right);
            nextSum(preSum[right]);
        }
        while(left<queries[i].s) {
            prevSum(preSum[left]);
            deqs[preSum[left]].pop_front();
            nextSum(preSum[left]);
            left++;
        }
        while(queries[i].e<right) {
            prevSum(preSum[right]);
            deqs[preSum[right]].pop_back();
            nextSum(preSum[right]);
            right--;
        }
        res[queries[i].idx] = getMax();
    }
    for(int e:res) cout << e << '\n';
}