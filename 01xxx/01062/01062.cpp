#include<bits/stdc++.h>
using namespace std;

int n, k;
int maxCnt=0;
bitset<26> cur;
vector<bitset<26>> v; // 각 문장에서 등장하는 문자들 종류

void back(int depth, int start) { // 백트래킹으로 모든 경우를 조사하여 최대 횟수 계산
    if(depth==k) {
        int cnt=0;
        for(int i=0;i<n;i++) {
            if((v[i] | cur) == cur) {
                cnt++;
            }
        }
        maxCnt = max(maxCnt, cnt);
        return;
    }
    for(int i=start;i<26;i++) {
        cur[i]=true;
        back(depth+1, i+1);
        cur[i]=false;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;

    for(int i=0;i<n;i++) { // 각 문장에서 등장하는 문자들 종류만 추출
        bitset<26> bits;
        string s; cin >> s;
        for(char ch:s) bits[ch-'a']=true;
        v.push_back(bits);
    }
    back(0, 0);
    cout << maxCnt;
}