#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

vector<vector<int>> conn(26);
int inDegree[26], cost[26], maxCost[26];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        string s; getline(cin, s);
        if(cin.fail()) break;
        char a = s[0];
        int i=2, b=0;
        while(i<s.length() && s[i]!=' ') {
            b = b*10 + s[i]-'0';
            i++;
        }

        while(++i<s.length()) {
            inDegree[a-'A']++;
            conn[s[i]-'A'].push_back(a-'A');
        }
        cost[a-'A']=b;
    }

    queue<int> q;
    for(int i=0;i<26;i++) {
        if(inDegree[i]==0) q.push(i);
    }

    while(!q.empty()) {
        int cur = q.front(); q.pop();
        maxCost[cur] += cost[cur];
        for(int next:conn[cur]) {
            maxCost[next] = max(maxCost[next], maxCost[cur]);
            if(--inDegree[next]==0) q.push(next);
        }
    }
    cout << *max_element(maxCost, maxCost+26);
}