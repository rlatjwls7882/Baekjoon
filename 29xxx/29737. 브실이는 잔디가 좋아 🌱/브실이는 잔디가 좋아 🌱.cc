#include <bits/stdc++.h>
using namespace std;

struct Streak {
    string S;
    int use=0, fail=0, longest=0, start=0;
    Streak(string S, int use, int fail, int longest, int start) {
        this->S=S;
        this->use=use;
        this->fail=fail;
        this->longest=longest;
        this->start=start;
    }

    bool operator<(Streak streak) const {
        if(this->longest==streak.longest) {
            if(this->use==streak.use) {
                if(this->start==streak.start) {
                    if(this->fail==streak.fail) {
                        return this->S>streak.S;
                    }
                    return this->fail>streak.fail;
                }
                return this->start>streak.start;
            }
            return this->use>streak.use;
        }
        return this->longest<streak.longest;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, W; cin >> N >> W;

    priority_queue<Streak> pq;
    for(int i=0;i<N;i++) {
        string name; cin >> name;
        string s[7];
        for(int j=0;j<7;j++) {
            cin >> s[j];
        }

        int fail=0, curLen=0, maxLen=0, curUse=0, maxUse=0, curStart=0, maxStart=0;
        for(int j=0;j<W;j++) {
            for(int k=0;k<7;k++) {
                if(s[k][j]=='O') {
                    if(curLen==0) curStart=j*7+k+1;
                    curLen++;
                    if(curLen>maxLen || curLen==maxLen && curUse<maxUse) {
                        maxLen=curLen;
                        maxStart=curStart;
                        maxUse=curUse;
                    }
                } else if(s[k][j]=='F') {
                    if(curLen!=0) curUse++;
                } else {
                    fail++;
                    curLen=0;
                    curUse=0;
                }
            }
        }
        pq.push(Streak(name, maxUse, fail, maxLen, maxStart));
    }

    int rank=0;
    int lastLong=-1, lastUse=-1, lastStart=-1, lastFail=-1;
    while(N-->0) {
        if(pq.top().longest!=lastLong || pq.top().use!=lastUse || pq.top().start!=lastStart || pq.top().fail!=lastFail) {
            rank ++;
        }
        lastLong = pq.top().longest;
        lastUse = pq.top().use;
        lastStart = pq.top().start;
        lastFail = pq.top().fail;
        cout << rank << ". " << pq.top().S << '\n'; pq.pop();
    }
}