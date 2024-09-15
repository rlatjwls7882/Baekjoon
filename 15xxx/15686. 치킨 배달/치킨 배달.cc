#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int M, minSum=INT_MAX;
vector<P> house;
vector<P> chicken;
bool visited[13] = {false, };

void dfs(int idx, int depth) {
    if(depth==M) {
        int sum=0;
        for(P houseNum:house) {
            int minDist=INT_MAX;
            for(int i=0;i<chicken.size();i++) {
                if(visited[i]) {
                    minDist = min(minDist, abs(houseNum.first-chicken[i].first)+abs(houseNum.second-chicken[i].second));
                }
            }
            sum += minDist;
        }
        minSum = min(minSum, sum);
    }

    for(int i=idx;i<chicken.size();i++) {
        visited[i]=true;
        dfs(i+1, depth+1);
        visited[i]=false;
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N >> M;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            int tmp; cin >> tmp;
            if(tmp==1) house.push_back(P(i, j));
            else if(tmp==2) chicken.push_back(P(i, j));
        }
    }
    dfs(0, 0);
    cout << minSum;
}