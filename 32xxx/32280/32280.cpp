#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int teacher;
    vector<int> studentArrivingTime;
    while(n-->-1) {
        string a, b; cin >> a >> b;
        int curT = ((a[0]-'0')*10+a[1]-'0')*60+((a[3]-'0')*10+a[4]-'0');
        if(b[0]=='s') studentArrivingTime.push_back(curT);
        else teacher=curT;
    }
    string a; cin >> a;
    int classStart = ((a[0]-'0')*10+a[1]-'0')*60+((a[3]-'0')*10+a[4]-'0');

    int cnt=0;
    for(int t:studentArrivingTime) {
        if(t>=teacher && t>=classStart) cnt++;
    }
    cout << cnt;
}