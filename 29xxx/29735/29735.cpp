#include<bits/stdc++.h>
using namespace std;

int main() {
    string S, E; int N, T; cin >> S >> E >> N >> T;
    int startT = ((S[0]-'0')*10+S[1]-'0')*60 + ((S[3]-'0')*10+S[4]-'0');
    int endT = ((E[0]-'0')*10+E[1]-'0')*60 + ((E[3]-'0')*10+E[4]-'0');

    int curDay=0, curT = startT;
    while(N-->-1) {
        if(curT+T>=endT) {
            curDay++;
            curT = startT;
        }
        curT += T;
    }
    printf("%d\n%02d:%02d", curDay, curT/60, curT%60);
}