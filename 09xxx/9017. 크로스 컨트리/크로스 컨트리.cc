#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

vector<vector<int>> idx;

bool comp(P a, P b) {
    if(a.second==b.second) return idx[a.first][4]<idx[b.first][4];
    return a.second<b.second;
}

void remove(int arr[], int pos, int n) {
    for(int i=pos+1;i<n;i++) {
        arr[i-1]=arr[i];
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int cnt[1001] = {0, };
        int arr[n];
        for(int i=0;i<n;i++) {
            cin >> arr[i];
            cnt[arr[i]]++;
        }

        for(int i=0;i<n;i++) {
            if(cnt[arr[i]]<6) {
                remove(arr, i, n);
                n--;
                i--;
            }
        }

        idx = vector<vector<int>>(1001);
        map<int, int> score;
        for(int i=0;i<n;i++) {
            if(--cnt[arr[i]]>=2) score[arr[i]] += i;
            idx[arr[i]].push_back(i);
        }

        vector<P> v(score.begin(), score.end());
        sort(v.begin(), v.end(), comp);
        cout << v[0].first << '\n';
    }
}