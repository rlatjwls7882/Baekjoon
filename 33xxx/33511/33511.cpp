#include<bits/stdc++.h>
using namespace std;

int n, m, res[2000], exist[2001];
vector<vector<int>> arr;

bool isAlreadyDiff(int i) {
    for(int j=0;j<m;j++) {
        if(res[j] && arr[i][j]!=res[j]) return true;
    }
    return false;
}

int getDiff() {
    int maxCnt=0;
    for(int i=0;i<arr.size();i++) {
        int cnt=0;
        for(int j=0;j<m;j++) {
            if(res[j]!=arr[i][j]) cnt++;
        }
        maxCnt = max(maxCnt, cnt);
    }
    return maxCnt;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) {
        arr.push_back({});
        for(int j=0;j<m;j++) {
            int val; cin >> val;
            arr.back().push_back(val);
        }
    }
    sort(arr.begin(), arr.end());
    arr.erase(unique(arr.begin(), arr.end()), arr.end());

    int blank=m;
    for(int j=0;j<m;j++) {
        memset(exist, 0, sizeof exist);
        for(int i=0;i<arr.size();i++) {
            if(++exist[arr[i][j]]==2) {
                res[j] = arr[i][j];
                blank--;
                break;
            }
        }
    }

    for(int i=0;i<arr.size();i++) {
        if(isAlreadyDiff(i)) {
            for(int j=0;j<m;j++) {
                if(!res[j]) {
                    res[j]=arr[i][j];
                    blank--;
                }
            }
        }
    }

    if(arr.size()==1) {
        for(int j=1;j<m;j++) res[j] = arr[0][j];
    } else if(blank==2) {
        int blankIdx1=-1, blankIdx2;
        for(int i=0;i<m;i++) {
            if(!res[i]) {
                if(blankIdx1==-1) blankIdx1=i;
                else blankIdx2=i;
            }
        }
        res[blankIdx1] = arr[0][blankIdx1];
        if(getDiff()!=1) res[blankIdx2] = arr[1][blankIdx2];
        if(getDiff()!=1) res[blankIdx1] = 0;
    }
    for(int j=0;j<m;j++) cout << res[j] << ' ';
}