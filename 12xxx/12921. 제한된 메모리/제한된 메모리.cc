#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n, x0, a, b; int q; cin >> n >> x0 >> a >> b >> q;
    vector<int> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i];
        queries[i]++; // 0인덱스를 1인덱스로 변경
    }

    vector<int> left(q), right(q, 1'000'000'006);
    while(true) {
        // 이번에 생성 가능한 mid들 전부 담기
        bool chk=false;
        vector<int> mids;
        for(int i=0;i<q;i++) {
            if(left[i]<right[i]) {
                chk=true;
                mids.push_back((left[i]+right[i])/2);
            }
        }
        if(!chk) break;
        mids.erase(unique(mids.begin(), mids.end()), mids.end());
        sort(mids.begin(), mids.end());

        /** 
         * mid 개수만큼 범위 생성
         * ex) mids = [1, 5, 9, 11]
         * preSum[0]: 0~1
         * preSum[1]: 2~5
         * preSum[2]: 6~9
         * preSum[3]: 10~11
         * preSum[4]: 12~MAX
         */
        vector<int> preSum(mids.size()+1);

        long long x = x0;
        for(int i=0;i<n;i++) {
            preSum[lower_bound(mids.begin(), mids.end(), x)-mids.begin()]++;
            x = (x*a+b) % 1'000'000'007;
        }
        for(int i=1;i<preSum.size();i++) {
            preSum[i] += preSum[i-1];
        }

        // PBS 수행
        for(int i=0;i<q;i++) {
            if(left[i]<right[i]) {
                int mid = (left[i]+right[i])/2;
                if(preSum[lower_bound(mids.begin(), mids.end(), mid)-mids.begin()]<queries[i]) left[i] = mid+1;
                else right[i] = mid;
            }
        }
    }

    long long res=0;
    for(int i=0;i<q;i++) res += left[i];
    cout << res;
}