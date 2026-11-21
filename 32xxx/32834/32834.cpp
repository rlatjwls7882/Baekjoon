#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    vector<vector<int>> bin(n);
    for(int i=0;i<n;i++) bin[i].push_back(n-1-i), bin[i].push_back(n-1-i);

    int last=n-1;
    vector<string> res;
    while(true) {
        while(last>=0 && bin[last][0]==last) last--; 
        if(last<0) break; // 모두 정렬이 된 경우 종료

        // 가장 왼쪽에 있는 가장 큰 값
        int idx=last;
        for(int i=last;i>=0;i--) {
            if(bin[idx][1]<=bin[i][1]) {
                idx=i;
            }
        }

        for(int i=idx;i<last;i++) {
            // 왼쪽 통의 큰 값과 오른쪽 통의 작은 값을 스왑
            res.push_back("\n"+to_string(i+1)+" "+to_string(bin[i][1]+1)+" "+to_string(bin[i+1][0]+1));
            swap(bin[i][1], bin[i+1][0]);

            // bin[][0] < bin[][1] 항상 성립되도록 스왑
            if(bin[i][0]>bin[i][1]) swap(bin[i][0], bin[i][1]);
            if(bin[i+1][0]>bin[i+1][1]) swap(bin[i+1][0], bin[i+1][1]);
        }
    }
    cout << res.size();
    for(string s:res) cout << s;
}