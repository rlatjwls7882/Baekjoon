#include<bits/stdc++.h>
using namespace std;

const long long MOD = 998'244'353;

int arr[2000][2000];
long long fact[2001];
map<int, set<int>> groupNumToIdx;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> arr[i][j];
        }
    }

    int lastQuery=0;
    vector<pair<int, int>> query(q);
    for(int i=0;i<q;i++) {
        cin >> query[i].first >> query[i].second;
        if(query[i].first==1) lastQuery=i;
    }

    for(int i=0;i<n;i++) groupNumToIdx[i].insert(i);

    /** 
     * 마지막 불안정 정렬부터 시작
     * - 앞에서 많은 안정 / 불안정 정렬을 했다고 하더라도 마지막 불안정 정렬에서 초기화됨.
     * - 불안정 정렬은 맵에 그룹으로 분할하여 구현
     */
    int groupCnt=n;
    if(query[lastQuery].first==1) {
        int b = query[lastQuery].second-1;
        groupNumToIdx.clear();

        map<int, int> nums;
        for(int i=0;i<n;i++) {
            if(!nums.count(arr[i][b])) nums[arr[i][b]] = groupCnt++;
            groupNumToIdx[nums[arr[i][b]]].insert(i);
        }
        lastQuery++;
    }

    /** 
     * 안정 정렬은 같은 그룹에 속해있는 다른 숫자들만 그룹에서 분할
     */
    for(int i=lastQuery;i<q;i++) {
        int b = query[i].second-1;

        map<int, set<int>> newGroup;
        for(auto e:groupNumToIdx) {
            if(e.second.size()==1) continue;

            map<int, int> nums;
            for(int idx : e.second) {
                if(!nums.count(arr[idx][b])) nums[arr[idx][b]] = groupCnt++;
                newGroup[nums[arr[idx][b]]].insert(idx);
            }
        }
        groupNumToIdx.clear();
        groupNumToIdx = newGroup;
    }

    /** 
     * 경우의 수 계산
     */
    fact[0]=1;
    for(int i=1;i<=2000;i++) {
        fact[i] = fact[i-1]*i%MOD;
    }

    long long total=1;
    for(auto e : groupNumToIdx) {
        total = total * fact[e.second.size()] % MOD;
    }
    cout << total;
}