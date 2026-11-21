#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s[9][9];
    for(int i=0;i<9;i++) {
        for(int j=0;j<9;j++) {
            cin >> s[i][j];
        }
    }

    map<string, vector<string>> goal;
    for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++) {
            if(!(i==1 && j==1)) {
                goal[s[i*3+1][j*3+1]].push_back(s[i*3][j*3]);
                goal[s[i*3+1][j*3+1]].push_back(s[i*3][j*3+1]);
                goal[s[i*3+1][j*3+1]].push_back(s[i*3][j*3+2]);
                goal[s[i*3+1][j*3+1]].push_back(s[i*3+1][j*3]);
                goal[s[i*3+1][j*3+1]].push_back(s[i*3+1][j*3+2]);
                goal[s[i*3+1][j*3+1]].push_back(s[i*3+2][j*3]);
                goal[s[i*3+1][j*3+1]].push_back(s[i*3+2][j*3+1]);
                goal[s[i*3+1][j*3+1]].push_back(s[i*3+2][j*3+2]);
            }
        }
    }

    int cnt=0;
    for(auto eachGoal:goal) {
        cnt++;
        sort(eachGoal.second.begin(), eachGoal.second.end());
        cout << '#' << cnt << ". " << eachGoal.first << '\n';
        for(int i=0;i<eachGoal.second.size();i++) {
            cout << '#' << cnt << '-' << i+1 << ". " << eachGoal.second[i] << '\n';
        }
    }
}