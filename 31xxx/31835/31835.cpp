#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    char last; cin >> last;
    char opt, cur;
    for(int i=0;i<N/2-1;i++) {
        cin >> opt >> cur;
        if(opt=='&' && cur=='F') last='F';
        else if(opt=='|' && cur=='T') last='T';
    }
    if(N>1) cin >> opt >> cur;
    char res; cin >> res;

    if(N==1) {
        if(res!=last) cout << 1;
        else cout << 0;
    } else {
        if(res=='T') {
            if(last=='T' || cur=='T') {
                if(last=='T' && opt=='&' && cur=='T' || opt=='|') cout << 0;
                else cout << 1;
            } else {
                if(opt=='|') cout << 1;
                else cout << 2;
            }
        } else {
            if(last=='T' && cur=='T') {
                if(opt=='&') cout << 1;
                else cout << 2;
            }
            else if(opt=='&' || last=='F' && cur=='F') cout << 0;
            else cout << 1;
        }
    }
}