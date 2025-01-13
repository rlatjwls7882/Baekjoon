#include<bits/stdc++.h>
using namespace std;

int col[10001], row[10001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int x, y; cin >> x >> y;
        col[x]++;
        row[y]++;
    }

    long long totalCost=0;
    int down=1, up=N;
    while(!col[down]) down++;
    while(!col[up]) up--;
    while(down<up) {
        if(col[down]<col[up]) {
            totalCost += col[down];
            col[down+1] += col[down];
            down++;
        } else {
            totalCost += col[up];
            col[up-1] += col[up];
            up--;
        }
    }

    int left=1, right=N;
    while(!row[left]) left++;
    while(!row[right]) right--;
    while(left<right) {
        if(row[left]<row[right]) {
            totalCost += row[left];
            row[left+1] += row[left];
            left++;
        } else {
            totalCost += row[right];
            row[right-1] += row[right];
            right--;
        }
    }
    cout << totalCost;
}