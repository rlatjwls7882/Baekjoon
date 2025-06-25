#include<bits/stdc++.h>
using namespace std;

/** 
 * like[i][j] : i번째 사람이 j번째로 좋아하는 사람
 * rank[i][j] : i번째 사람이 j번 사람을 좋아하는 순위
 * mate[i] : i번째 사람이 매칭된 사람
 */
int like[10][5], likeRank[10][10], mate[10];

int simulate() {
    memset(mate, -1, sizeof mate);
    while(true) {
        bool chk=false;
        for(int girl=5;girl<10;girl++) {
            int &girlLike = mate[girl];
            if(girlLike==-1) {
                chk=true;
                for(int j=0;j<5;j++) {
                    int man = like[girl][j];
                    int &manLike = mate[man];
                    if(manLike==-1 || likeRank[man][manLike] > likeRank[man][girl]) {
                        if(manLike!=-1) mate[manLike] = -1;
                        manLike = girl;
                        girlLike = man;
                        break;
                    }
                }
            }
        }
        if(!chk) break;
    }
    return mate[0];
}

bool visited[5];

int back(int depth) {
    if(depth==5) return simulate();

    int minVal=9;
    for(int i=0;i<5;i++) {
        if(!visited[i]) {
            like[0][depth] = i+5;
            likeRank[0][i+5] = depth;
            visited[i]=true;
            minVal = min(minVal, back(depth+1));
            visited[i]=false;
        }
    }
    return minVal;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        for(int i=1;i<10;i++) {
            for(int j=0;j<5;j++) {
                cin >> like[i][j];
                like[i][j]--;
                likeRank[i][like[i][j]]=j;
            }
        }

        for(int i=0;i<5;i++) {
            like[0][i] = i+5;
            likeRank[0][i+5] = i;
        }
        int original = simulate();
        int change = back(0);

        cout << (original==change ? "NO\n" : "YES\n");
    }
}