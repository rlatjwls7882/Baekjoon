#include <bits/stdc++.h>
using namespace std;

int n;

vector<vector<int>> expo_square(vector<vector<int>> arr, long long b) {
    if(b<=1) {
        if(b==0) {
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(i==j) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        return arr;
    }

    vector<vector<int>> tmp = expo_square(arr, b/2);

    vector<vector<int>> res(n, vector<int>(n));
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            for(int k=0;k<n;k++) {
                res[i][j] = (res[i][j]+tmp[i][k]*tmp[k][j])%1000;
            }
        }
    }
    if(b%2==1) {
        tmp = res;
        res = vector<vector<int>>(n, vector<int>(n));
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<n;k++) {
                    res[i][j] = (res[i][j]+tmp[i][k]*arr[k][j])%1000;
                }
            }
        }
    }
    return res;
}

int main(){
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long b; cin >> n >> b;
    vector<vector<int>> arr(n, vector<int>(n));
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> arr[i][j];
            arr[i][j] %= 1000;
        }
    }

    arr = expo_square(arr, b);
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cout << arr[i][j] << ' ';
        }
        cout << '\n';
    }
}