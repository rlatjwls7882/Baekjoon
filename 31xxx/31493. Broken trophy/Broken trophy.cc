#include<bits/stdc++.h>
using namespace std;

int res[3][100'000], input[300'000][2];

vector<vector<int>> cnt(6); // 2*2, 3*1, 2*1, 1*1, 3*2, 3*3

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k, n; cin >> k >> n;
    for(int i=0;i<k;i++) cin >> input[i][0];
    for(int i=0;i<k;i++) cin >> input[i][1];
    for(int i=0;i<k;i++) {
        if(input[i][0]==2 && input[i][1]==2) cnt[0].push_back(i+1);
        else if(input[i][0]==3 && input[i][1]==1 || input[i][0]==1 && input[i][1]==3) cnt[1].push_back(i+1);
        else if(input[i][0]==2 && input[i][1]==1 || input[i][0]==1 && input[i][1]==2) cnt[2].push_back(i+1);
        else if(input[i][0]==1 && input[i][1]==1) cnt[3].push_back(i+1);
        else if(input[i][0]==2 || input[i][1]==2) cnt[4].push_back(i+1);
        else cnt[5].push_back(i+1);
    }

    int line0=0, line1=0, line2=0;
    while(!cnt[0].empty()) {
        res[1][line1]=res[1][line1+1]=cnt[0].back();
        res[2][line2]=res[2][line2+1]=cnt[0].back();
        cnt[0].pop_back();
        line1+=2;
        line2+=2;
    }
    while(line0<line1) {
        if(line0+3<=line1 && !cnt[1].empty()) {
            res[0][line0]=res[0][line0+1]=res[0][line0+2]=cnt[1].back();
            cnt[1].pop_back();
            line0+=3;
        } else if(line0+2<=line1 && !cnt[2].empty()) {
            res[0][line0]=res[0][line0+1]=cnt[2].back();
            cnt[2].pop_back();
            line0+=2;
        } else {
            res[0][line0]=cnt[3].back();
            cnt[3].pop_back();
            line0++;
        }
    }
    while(!cnt[1].empty()) {
        res[0][line0++]=res[1][line1++]=res[2][line2++]=cnt[1].back();
        cnt[1].pop_back();
    }
    while(!cnt[2].empty()) {
        if(cnt[2].size()>=3) {
            for(int i=0;i<3;i++) {
                res[i][line0]=res[i][line0+1]=cnt[2].back();
                cnt[2].pop_back();
            }
            line0 = line1 = line2 = line0+2;
        } else {
            res[0][line0++]=res[1][line1++]=cnt[2].back(); cnt[2].pop_back();
            res[2][line2++]=cnt[3].back(); cnt[3].pop_back();
        }
    }
    while(!cnt[3].empty()) {
        for(int i=0;i<3;i++) {
            res[i][line0]=cnt[3].back();
            cnt[3].pop_back();
        }
        line0++;
    }
    while(!cnt[4].empty()) {
        for(int i=0;i<3;i++) {
            for(int j=0;j<2;j++) res[i][j+line0]=cnt[4].back();
        }
        line0+=2;
        cnt[4].pop_back();
    }
    while(!cnt[5].empty()) {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) res[i][j+line0]=cnt[5].back();
        }
        line0+=3;
        cnt[5].pop_back();
    }
    for(int i=0;i<3;i++) {
        for(int j=0;j<n;j++) cout << res[i][j] << ' ';
        cout << '\n';
    }
}