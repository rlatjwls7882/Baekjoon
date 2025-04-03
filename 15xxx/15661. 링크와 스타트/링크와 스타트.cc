#include<bits/stdc++.h>
using namespace std;

int n;
int arr[20][20];
int minDiff = INT_MAX;
bool team1[20];

void back(int depth) {
    if(depth==n) {
        int diff=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(team1[i] && team1[j]) {
                    diff += arr[i][j];
                } else if(!team1[i] && !team1[j]) {
                    diff -= arr[i][j];
                }
            }
        }
        minDiff = min(minDiff, abs(diff));
        return;
    }
    back(depth+1);
    team1[depth] = true;
    back(depth+1);
    team1[depth] = false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> arr[i][j];
        }
    }

    back(0);
    cout << minDiff;
}