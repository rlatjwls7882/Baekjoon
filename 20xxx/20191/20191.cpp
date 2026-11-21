#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string S, T; cin >> S >> T;
    vector<pair<char, int>> v;
    for(int i=0;i<T.length();i++) v.push_back({T[i], i});
    sort(v.begin(), v.end());

    int cnt=1, idx=-1;
    for(int i=0;i<S.length();) {
        int left=0, right=T.length()-1;
        while(left<right) {
            int mid = (left+right)/2;
            if(v[mid].first<S[i] || v[mid].first==S[i] && v[mid].second<=idx) left=mid+1;
            else if(v[mid].first>S[i]) right=mid-1;
            else right=mid;
        }
        if(v[left].first!=S[i] || v[left].second<=idx) {
            if(idx==-1) {
                cout << -1;
                return 0;
            }
            cnt++;
            idx=-1;
        } else {
            i++;
            idx=v[left].second;
        }
    }
    cout << cnt;
}