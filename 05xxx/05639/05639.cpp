#include<bits/stdc++.h>
#define MAX 10001

using namespace std;

int val[MAX] = {0, };
int child[MAX][2];

void dfs(int cur) {
    if(child[cur][0]!=0) {
        dfs(child[cur][0]);
    }
    if(child[cur][1]!=0) {
        dfs(child[cur][1]);
    }
    cout << val[cur] << endl;
}

void push(int cur) {
    int parentIdx=1;
    if(parentIdx==cur) {
        return;
    }
    while(true) {
        if(val[parentIdx]<val[cur]) {
            if(child[parentIdx][1]==0) {
                child[parentIdx][1]=cur;
                return;
            } else {
                parentIdx = child[parentIdx][1];
            }
        } else {
            if(child[parentIdx][0]==0) {
                child[parentIdx][0]=cur;
                return;
            } else {
                parentIdx = child[parentIdx][0];
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=1;;i++) {
        child[i][0]=child[i][1]=0;
        cin >> val[i];
        if(cin.fail()) {
            break;
        }
        push(i);
    }

    dfs(1);
}