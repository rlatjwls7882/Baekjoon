#include<bits/stdc++.h>
using namespace std;

int effort[10][10] = {
    {0, 4, 3, 4, 3, 2, 3, 2, 1, 2},
    {4, 0, 1, 2, 1, 2, 3, 2, 3, 4},
    {3, 1, 0, 1, 2, 1, 2, 3, 2, 3},
    {4, 2, 1, 0, 3, 2, 1, 4, 3, 2},
    {3, 1, 2, 3, 0, 1, 2, 1, 2, 3},
    {2, 2, 1, 2, 1, 0, 1, 2, 1, 2},
    {3, 3, 2, 1, 2, 1, 0, 3, 2, 1},
    {2, 2, 3, 4, 1, 2, 3, 0, 1, 2},
    {1, 3, 2, 3, 2, 1, 2, 1, 0, 1},
    {2, 4, 3, 2, 3, 2, 1, 2, 1, 0}
};

int getEffort(string s) {
    int sum=0;
    for(int i=1;i<s.length();i++) {
        sum += effort[s[i-1]-'0'][s[i]-'0'];
    }
    return sum;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int h, m; char tmp; cin >> h >> tmp >> m;

    int minE = INT_MAX;
    string res;
    for(int i=0;h+i<100;i+=24) {
        for(int j=0;m+j<100;j+=60) {
            string nh = to_string(h+i);
            string nm = to_string(m+j);
            if(nh.size()==1) nh = "0" + nh;
            if(nm.size()==1) nm = "0" + nm;

            int e = getEffort(nh + nm);
            if(e<minE) {
                minE = e;
                res = nh + ":" + nm;
            }
        }
    }
    cout << res;
}