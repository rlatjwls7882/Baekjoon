#include<bits/stdc++.h>
using namespace std;

int weight[36][50];

bool comp(int a, int b) {
    for(int i=0;i<50;i++) {
        if(weight[a][i]!=weight[b][i]) return weight[a][i]>weight[b][i];
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int maxLen=0;
    vector<vector<int>> nums(n);
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        for(int j=s.length()-1;j>=0;j--) {
            if(s[j]<='9') nums[i].push_back(s[j]-'0');
            else nums[i].push_back(s[j]-'A'+10);
            weight[nums[i].back()][49-(s.length()-1-j)]+=35-nums[i].back();
        }
        maxLen = max(maxLen, (int)s.length());
    }

    for(int i=0;i<36;i++) {
        for(int j=49;j>0;j--) {
            weight[i][j-1] += weight[i][j]/36;
            weight[i][j] %= 36;
        }
    }
    int K; cin >> K;
    int num[36];
    for(int i=0;i<36;i++) num[i]=i;
    sort(num, num+36, comp);

    int changedVal[36];
    for(int i=0;i<36;i++) {
        if(i<K) changedVal[num[i]]=35;
        else changedVal[num[i]]=num[i];
    }

    vector<int> res(maxLen);
    for(int i=0;i<maxLen;i++) {
        for(int j=0;j<n;j++) {
            if(i<nums[j].size()) {
                res[i] += changedVal[nums[j][i]];
            }
        }
    }

    for(int i=0;i<res.size();i++) {
        if(res[i]>35) {
            if(i==res.size()-1) res.push_back(0);
            res[i+1] += res[i]/36;
            res[i] %= 36;
        }
    }

    for(int i=res.size()-1;i>=0;i--) {
        if(res[i]<=9) cout << res[i];
        else cout << char(res[i]-10+'A');
    }
}