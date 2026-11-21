#include<bits/stdc++.h>
using namespace std;

int N, maxVal=0;
vector<deque<int>> tmpCol;
vector<deque<int>> tmpRow;
vector<deque<int>> nextRow;
vector<deque<int>> nextCol;
void dfs(int depth, vector<deque<int>> row, vector<deque<int>> col) {
    if(depth>=5) return;

    // 위로
    tmpCol = col;
    nextRow = vector<deque<int>>(N);
    nextCol = vector<deque<int>>(N);
    for(int i=0;i<N;i++) {
        int j=0;
        for(;!tmpCol[i].empty();j++) {
            int val = tmpCol[i].front(); tmpCol[i].pop_front();
            while(val==0 && !tmpCol[i].empty()) {
                val = tmpCol[i].front(); tmpCol[i].pop_front();
            }
            if(val==0) break;
            while(!tmpCol[i].empty() && tmpCol[i].front()==0) {
                tmpCol[i].pop_front();
            }
            if(!tmpCol[i].empty() && tmpCol[i].front()==val) {
                val*=2;
                tmpCol[i].pop_front();
            }
            maxVal = max(maxVal, val);
            nextCol[i].push_back(val);
            nextRow[j].push_back(val);
        }
        while(j<N) {
            nextRow[j++].push_back(0);
        }
    }
    dfs(depth+1, nextRow, nextCol);

    // 아래로
    tmpCol = col;
    nextRow = vector<deque<int>>(N);
    nextCol = vector<deque<int>>(N);
    for(int i=0;i<N;i++) {
        int j=N-1;
        for(;!tmpCol[i].empty();j--) {
            int val = tmpCol[i].back(); tmpCol[i].pop_back();
            while(val==0 && !tmpCol[i].empty()) {
                val = tmpCol[i].back(); tmpCol[i].pop_back();
            }
            if(val==0) break;
            while(!tmpCol[i].empty() && tmpCol[i].back()==0) {
                tmpCol[i].pop_back();
            }
            if(!tmpCol[i].empty() && tmpCol[i].back()==val) {
                val*=2;
                tmpCol[i].pop_back();
            }
            maxVal = max(maxVal, val);
            nextCol[i].push_front(val);
            nextRow[j].push_back(val);
        }
        while(j>=0) {
            nextRow[j--].push_back(0);
        }
    }
    dfs(depth+1, nextRow, nextCol);

    // 왼쪽으로
    tmpRow = row;
    nextRow = vector<deque<int>>(N);
    nextCol = vector<deque<int>>(N);
    for(int i=0;i<N;i++) {
        int j=0;
        for(;!tmpRow[i].empty();j++) {
            int val = tmpRow[i].front(); tmpRow[i].pop_front();
            while(val==0 && !tmpRow[i].empty()) {
                val = tmpRow[i].front(); tmpRow[i].pop_front();
            }
            if(val==0) break;
            while(!tmpRow[i].empty() && tmpRow[i].front()==0) {
                tmpRow[i].pop_front();
            }
            if(!tmpRow[i].empty() && tmpRow[i].front()==val) {
                val*=2;
                tmpRow[i].pop_front();
            }
            maxVal = max(maxVal, val);
            nextRow[i].push_back(val);
            nextCol[j].push_back(val);
        }
        while(j<N) {
            nextCol[j++].push_back(0);
        }
    }
    dfs(depth+1, nextRow, nextCol);

    // 오른쪽으로
    tmpRow = row;
    nextRow = vector<deque<int>>(N);
    nextCol = vector<deque<int>>(N);
    for(int i=0;i<N;i++) {
        int j=N-1;
        for(;!tmpRow[i].empty();j--) {
            int val = tmpRow[i].back(); tmpRow[i].pop_back();
            while(val==0 && !tmpRow[i].empty()) {
                val = tmpRow[i].back(); tmpRow[i].pop_back();
            }
            if(val==0) break;
            while(!tmpRow[i].empty() && tmpRow[i].back()==0) {
                tmpRow[i].pop_back();
            }
            if(!tmpRow[i].empty() && tmpRow[i].back()==val) {
                val*=2;
                tmpRow[i].pop_back();
            }
            maxVal = max(maxVal, val);
            nextRow[i].push_front(val);
            nextCol[j].push_back(val);
        }
        while(j>=0) {
            nextCol[j--].push_back(0);
        }
    }
    dfs(depth+1, nextRow, nextCol);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    vector<deque<int>> row = vector<deque<int>>(N);
    vector<deque<int>> col = vector<deque<int>>(N);
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            int tmp; cin >> tmp;
            row[i].push_back(tmp);
            col[j].push_back(tmp);
        }
    }
    dfs(0, row, col);
    cout << maxVal;
}