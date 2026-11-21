#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m, k; cin >> n >> m >> k;
    vector<pair<int, int>> a(n);
    for(int i=0;i<n;i++) cin >> a[i].first, a[i].second=i+1;
    sort(a.begin(), a.end());

    // m점을 모아봐야 k점을 못만드는 경우
    if(k%m!=0) {
        cout << "impossible";
        return 0;
    }

    // 점수가 가장 큰 k/m명이 점수를 주도록 오름차순으로 배열(k점), 그 후에 나머지 원소 내림차순으로 배열(0점)
    double sum=0, cnt=0;
    int mid = n-k/m;
    vector<int> res;
    for(int i=mid;i<n;i++) {
        while(mid>0 && cnt!=0 && sum/cnt>a[i].first) {
            cnt++;
            res.push_back(a[--mid].second);
        }
        if(cnt==0 || sum/cnt<=a[i].first) sum += m;
        res.push_back(a[i].second);
        cnt++;
    }

    while(mid>0) {
        if(cnt==0 || sum/cnt<=a[--mid].first) sum += m;
        res.push_back(a[mid].second);
        cnt++;
    }

    if(sum==k && res.size()==n) for(int e:res) cout << e << ' ';
    else cout << "impossible";
}