#include<bits/stdc++.h>
using namespace std;

string s;
int arr[51];
int finish=0;
bool visited[51] = {false, };

void dfs(int cur, int depth) {
    if(finish) return;
    if(cur==s.length()) {
        for(int i=1;i<=depth;i++) {
            if(!visited[i]) return;
        }
        finish=depth;
        return;
    }
    if(cur<s.length()) {
        int val = s[cur]-'0';
        if(!visited[val]) {
            arr[depth]=val;
            visited[val]=true;
            dfs(cur+1, depth+1);
            visited[val]=false;
        }
    }
    if(finish) return;
    if(cur+1<s.length()) {
        int val = (s[cur]-'0')*10+s[cur+1]-'0';
        if(!visited[val]) {
            arr[depth]=val;
            visited[val]=true;
            dfs(cur+2, depth+1);
            visited[val]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> s;
    dfs(0, 0);

    for(int i=0;i<finish;i++) {
        cout << arr[i] << ' ';
    }
}