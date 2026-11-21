#include<bits/stdc++.h>
using namespace std;

vector<vector<string>> arr(101);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        string s; int p; cin >> s >> p;
        vector<int> score(6);
        for(int j=0;j<6;j++) cin >> score[j];
        sort(score.begin(), score.end());
        arr[p*10+accumulate(score.begin()+1, score.end()-1, 0)].push_back(s);
    }

    int cnt=0;
    for(int i=100;i>=0;i--) {
        if(!arr[i].size()) continue;
        if(cnt>2 || cnt+arr[i].size()>1000) break;
        cnt += arr[i].size();
        for(string s:arr[i]) cout << s << ' ' << i << '\n';
    }
}