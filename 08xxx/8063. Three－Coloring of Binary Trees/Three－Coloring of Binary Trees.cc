#include<bits/stdc++.h>
using namespace std;

int idx;
string s;
vector<vector<int>> conn(10000);

void makeTree(int cur) {
    if(idx>=s.length() || s[idx]=='0') return;
    char tmp = s[idx];
    conn[cur].push_back(++idx);
    makeTree(idx);
    if(tmp=='2') {
        conn[cur].push_back(++idx);
        makeTree(idx);
    }
}

int RGB_MAX[10000][3];
void maxDp(int cur) {
    for(int next:conn[cur]) maxDp(next);
    if(conn[cur].empty()) {
        RGB_MAX[cur][0]=RGB_MAX[cur][2]=0;
        RGB_MAX[cur][1]=1;
    } else if(conn[cur].size()==1) {
        int next = conn[cur][0];
        RGB_MAX[cur][0] = max(RGB_MAX[next][1], RGB_MAX[next][2]);
        RGB_MAX[cur][2] = max(RGB_MAX[next][0], RGB_MAX[next][1]);
        RGB_MAX[cur][1] = max(RGB_MAX[next][0], RGB_MAX[next][2])+1;
    } else {
        int next1 = conn[cur][0], next2 = conn[cur][1];
        for(int i=0;i<3;i++) RGB_MAX[cur][i] = max(RGB_MAX[next1][(i+1)%3]+RGB_MAX[next2][(i+2)%3], RGB_MAX[next2][(i+1)%3]+RGB_MAX[next1][(i+2)%3]);
        RGB_MAX[cur][1]++;
    }
}

int RGB_MIN[10000][3];
void minDp(int cur) {
    for(int next:conn[cur]) minDp(next);
    if(conn[cur].empty()) {
        RGB_MIN[cur][0]=RGB_MIN[cur][2]=0;
        RGB_MIN[cur][1]=1;
    } else if(conn[cur].size()==1) {
        int next = conn[cur][0];
        RGB_MIN[cur][0] = min(RGB_MIN[next][1], RGB_MIN[next][2]);
        RGB_MIN[cur][2] = min(RGB_MIN[next][0], RGB_MIN[next][1]);
        RGB_MIN[cur][1] = min(RGB_MIN[next][0], RGB_MIN[next][2])+1;
    } else {
        int next1 = conn[cur][0], next2 = conn[cur][1];
        for(int i=0;i<3;i++) RGB_MIN[cur][i] = min(RGB_MIN[next1][(i+1)%3]+RGB_MIN[next2][(i+2)%3], RGB_MIN[next2][(i+1)%3]+RGB_MIN[next1][(i+2)%3]);
        RGB_MIN[cur][1]++;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s;
    makeTree(0);
    maxDp(0);
    minDp(0);
    cout << max({RGB_MAX[0][0], RGB_MAX[0][1], RGB_MAX[0][2]}) << ' ' << min({RGB_MIN[0][0], RGB_MIN[0][1], RGB_MIN[0][2]});
}