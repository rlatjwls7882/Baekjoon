#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Y1, M1, D1; cin >> Y1 >> M1 >> D1;
    int Y2, M2, D2; cin >> Y2 >> M2 >> D2;
    int remain = D2-D1;
    for(int i=1;i<Y2;i++) {
        if(i%4==0 && i%100!=0 || i%400==0) remain+=366;
        else remain+=365;
    }
    for(int i=1;i<M2;i++) {
        if(i==2 && (Y2%4==0 && Y2%100!=0 || Y2%400==0)) remain+=29;
        else if(i==2) remain+=28;
        else if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10) remain+=31;
        else remain+=30;
    }
    for(int i=1;i<Y1;i++) {
        if(i%4==0 && i%100!=0 || i%400==0) remain-=366;
        else remain-=365;
    }
    for(int i=1;i<M1;i++) {
        if(i==2 && (Y1%4==0 && Y1%100!=0 || Y1%400==0)) remain-=29;
        else if(i==2) remain-=28;
        else if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10) remain-=31;
        else remain-=30;
    }

    int T, N; cin >> T >> N;
    vector<pair<int, int>> list; // {C, V}
    while(N-->0) {
        int X, C, V; cin >> X >> C >> V;
        if(X==3) list.push_back({C, V*30});
        else list.push_back({C, V});
    }

    int cur[T+1] = {0, };
    for(auto work:list) {
        for(int i=T;i>=work.first;i--) {
            cur[i] = max(cur[i], cur[i-work.first]+work.second);
        }
    }
    int maxCnt=0;
    for(int i=0;i<=T;i++) maxCnt = max(maxCnt, cur[i]);
    cout << abs(remain-maxCnt);
}