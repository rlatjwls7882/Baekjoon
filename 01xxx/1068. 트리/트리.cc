#include<bits/stdc++.h>
#define MAX 51

using namespace std;

int parent[MAX] = {0, };
bool visited[MAX] = {false, };
vector<vector<int>> child = vector<vector<int>>(MAX+1);

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    queue<int> q;
    for(int i=0;i<N;i++) {
        int p; cin >> p;
        if(p==-1) {
            q.push(i);
        } else {
            parent[i]=p;
            child[p].push_back(i);
        }
    }
    int del; cin >> del;
    for(int i=0;i<child[parent[del]].size();i++) {
        if(child[parent[del]][i]==del) {
            child[parent[del]].erase(child[parent[del]].begin()+i);
            break;
        }
    }
    
    int cnt=0;
    if(q.front()!=del) {
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            if(visited[cur]) {
                continue;
            }
            visited[cur]=true;

            if(child[cur].empty()) {
                cnt++;
            } else {
                for(int next:child[cur]) {
                    if(!visited[next]) {
                        q.push(next);
                    }
                }
            }
        }
    }
    cout << cnt;
}