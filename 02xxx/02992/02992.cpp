#include<bits/stdc++.h>
using namespace std;

void chkNum(int tmp, int chars[10]) {
    do {
        chars[tmp%10]++;
        tmp/=10;
    } while(tmp>0);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int X; cin >> X;
    int len = (int)(log10(X)+1);
    int chars[10] = {0, };
    chkNum(X, chars);

    for(int i=X+1;;i++) {
        int nextLen = (int)(log10(i)+1);
        if(len!=nextLen) {
            cout << 0;
            return 0;
        }

        int nextChars[10] = {0, };
        chkNum(i, nextChars);

        bool chk=true;
        for(int i=0;i<10;i++) {
            if(chars[i]!=nextChars[i]) {
                chk=false;
                break;
            }
        }
        if(!chk) continue;
        cout << i;
        return 0;
    }
}