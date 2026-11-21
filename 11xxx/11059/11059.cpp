#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string S; cin >> S;

    int sum[S.size()+1];
    for(int i=1;i<=S.size();i++) {
        sum[i] = sum[i-1] + S[i-1]-'0';
    }

    int length = S.size()/2*2;
    while(length>0) {
        for(int j=0;j+length<=S.size();j++) {
            if(sum[length+j]-sum[length+j-length/2]==sum[length+j-length/2]-sum[j]) {
                cout << length;
                length=0;
                break;
            }
        }
        length-=2;
    }
}