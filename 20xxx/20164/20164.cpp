#include<bits/stdc++.h>
using namespace std;

pair<int, int> cut(string s) { // {최소횟수, 최대횟수}로 return
    int cnt=0;
    for(int i=0;i<s.length();i++) {
        cnt += (s[i]-'0')%2; // 홀수의 개수 세기
    }

    int minCnt = INT_MAX, maxCnt = 0;
    if(s.length()==1) {
        // 길이가 1인 경우 더 자를 수 없음
        minCnt = maxCnt = cnt;
    } else if(s.length()==2) {
        // 길이가 2면 반으로 자르고 개수 세기
        auto ret = cut(to_string(s[0]+s[1]-'0'*2));
        minCnt = cnt+ret.first;
        maxCnt = cnt+ret.second;
    } else {
        // 길이가 3 이상이면 다 잘라서 최솟값, 최대값 확인
        for(int i=1;i<s.length();i++) {
            for(int j=i+1;j<s.length();j++) {
                string a = s.substr(0, i);
                string b = s.substr(i, j-i);
                string c = s.substr(j, s.length()-j);
                
                auto ret = cut(to_string(stoi(a) + stoi(b) + stoi(c)));
                minCnt = min(minCnt, ret.first+cnt);
                maxCnt = max(maxCnt, ret.second+cnt);
            }
        }
    }
    return {minCnt, maxCnt};
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    auto ret = cut(s);
    cout << ret.first << ' ' << ret.second;
}