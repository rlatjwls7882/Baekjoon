#include<bits/stdc++.h>
using namespace std;

int blankIdx;
int k, n; string s;
string board[1000];

bool chk(int start, int end) {
    for(int i=0;i<blankIdx;i++) {
        if(start-1>=0 && board[i][start-1]=='-') start--;
        else if(start<k-1 && board[i][start]=='-') start++;
    }
    for(int i=n-1;i>blankIdx;i--) {
        if(end-1>=0 && board[i][end-1]=='-') end--;
        else if(end<k-1 && board[i][end]=='-') end++;
    }
    if(abs(end-start)>=2) return false;

    if(start+1==end) {
        if(board[blankIdx][start]=='*') return false;
        board[blankIdx][start]='-';
    } else if(start-1==end) {
        if(board[blankIdx][start-1]=='*') return false;
        board[blankIdx][start-1]='-';
    } else {
        if(board[blankIdx][start]=='-') return false;
        board[blankIdx][start]='*';
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> k >> n >> s;
    for(int i=0;i<n;i++) {
        cin >> board[i];
        if(board[i][0]=='?') blankIdx=i;
    }

    for(int i=0;i<k;i++) {
        if(!chk(s[i]-'A', i)) {
            for(int i=0;i<k-1;i++) cout << 'x';
            return 0;
        }
    }
    for(int i=0;i<k-1;i++) {
        if(board[blankIdx][i]=='?') board[blankIdx][i]='*';
    }
    cout << board[blankIdx];
}