#include<bits/stdc++.h>

using namespace std;
#define fastio ios_base::sync_with_stdio(false); cin.tie(0);cout.tie(0)
#define rep(a) for(int __i=(a);__i>0;--__i)
#define all(x) x.begin(), x.end()
#define len(x) (int)(x).size()
typedef long long ll;
#define int long long

const int NN = 1004;
ll N, S;

set<pair<int, int>> W;
// bool W[NN][NN];

vector<vector<pair<int, pair<int, int>>>> getTree(int c, int dir){
    //뚫린 곳만 넣을 것
    vector<vector<pair<int, pair<int, int>>>> tree(1);
    map<int, int> mp;
    int pv = 1;
    mp[c] = 0;
    queue<int> q;

    auto f = [&](){
        while(!q.empty()){
            auto cur = q.front(); q.pop();
            tree.push_back(vector<pair<int, pair<int, int>>>());
            if(!W.count({cur, cur+1})&&mp.find(cur-N)==mp.end()){
                q.push(cur-N);
                mp[cur-N] = pv++;
                tree.back().push_back({mp[cur-N], {cur, cur+1}});
            }
            if(!W.count({cur+1, cur+1+N})&&mp.find(cur+1)==mp.end()){
                q.push(cur+1);
                mp[cur+1] = pv++;
                tree.back().push_back({mp[cur+1], {cur+1, cur+1+N}});
            }
            if(!W.count({cur+N, cur+1+N})&&mp.find(cur+N)==mp.end()){
                q.push(cur+N);
                mp[cur+N] = pv++;
                tree.back().push_back({mp[cur+N], {cur+N, cur+1+N}});
            }
            if(!W.count({cur, cur+N})&&mp.find(cur-1)==mp.end()){
                q.push(cur-1);
                mp[cur-1] = pv++;
                tree.back().push_back({mp[cur-1], {cur, cur+N}});
            }
        }
    };
    if(dir==0){
        q.push(c-N);
        mp[c-N] = pv++;
        tree[0].push_back({1, {c, c+1}});
        f();
    }
    if(dir==1){
        q.push(c-1);
        mp[c-1] = pv++;
        tree[0].push_back({1, {c, c+N}});
        f();
    }
    if(dir==2){
        q.push(c+N);
        mp[c+N] = pv++;
        tree[0].push_back({1, {c+N, c+N+1}});
        f();
    }
    if(dir==3){
        q.push(c+1);
        mp[c+1] = pv++;
        tree[0].push_back({1, {c+1, c+1+N}});
        f();
    }
    return tree;
}

void print(vector<vector<pair<int, pair<int, int>>>> &ret){
    for(int i=0;i<len(ret);i++){
        cout<<i<<'\n';
        for(auto el:ret[i])cout<<el.first<<' '<<el.second.first<<' '<<el.second.second<<'\n';
    }cout<<'\n';
}

int ans = 0;
pair<int, int> pi = {0x7f7f7f7f, 0x7f7f7f7f};

int memo[NN*NN];
pair<int, int> pii[NN*NN];
int rec(vector<vector<pair<int, pair<int, int>>>> &tree, int cur){
    int rst = 1;
    for(auto nxt:tree[cur]){
        int cnt=rec(tree, nxt.first);
        if(cnt==S){
            ans++;
            int a = nxt.second.first, b = nxt.second.second;
            if(a>b)swap(a, b);
            if(pi>make_pair(a, b)) pi = make_pair(a, b);
        }
        rst+=cnt;
    }
    return rst;
}

signed main(){
    fastio;

    cin>>N>>S;
    rep(N*N-1){
        int u, v;cin>>u>>v;
        W.insert({u, v});
        W.insert({v, u});
        // W[u][v] = W[v][u] = 1;
    }

    for(int i=1;i<N;i++){
        if(W.count({i, i+1}))continue;
        auto ret = getTree(i-N, 2);
        // print(ret);
        rec(ret, 0);
    }
    for(int j=0;j<N-1;j++){
        int i = N-1+j*N;
        if(W.count({i+1, i+1+N}))continue;
        auto ret = getTree(i+1, 1);
        // print(ret);
        rec(ret, 0);
    }
    for(int j=0;j<N-1;j++){
        int i = 1+j*N;
        if(W.count({i, i+N}))continue;
        auto ret = getTree(i-1, 3);
        // print(ret);
        rec(ret, 0);
    }

    for(int j=0;j<N-1;j++){
        int i = 1+N*(N-2) + j;
        if(W.count({i+N, i+1+N}))continue;
        auto ret = getTree(i+N, 0);
        // print(ret);
        rec(ret, 0);
    }
    cout<<ans<<'\n';
    if(ans==0)cout<<"0 0";
    else cout<<pi.first<<' '<<pi.second;
}