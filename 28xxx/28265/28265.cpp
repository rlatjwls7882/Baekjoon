#include<bits/stdc++.h>
#include "colored_dealt.h"
using namespace std;

string guess(int n) {
    string s=string(n, 'B'), res=string(n, ' ');

    int cur=3*n;
    for(int i=0;i<n;i++) {
        s[i]='R';
        cur-=3;
        int ret = design(s);
        if(ret==cur+3) {
            res[i]='B';
            cur+=3;
        } else if(ret==cur+2) {
            res[i]='G';
            cur+=2;
        } else {
            res[i]='R';
            cur++;
        }
    }
    return res;
}