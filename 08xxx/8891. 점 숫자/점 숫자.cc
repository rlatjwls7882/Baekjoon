#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int a, b; cin >> a >> b;

        // A의 번호 -> A의 좌표
        int Ax=0, Ay=0;
        for(int i=1;;i++) {
            if(i<a) {
                a-=i;
            } else {
                Ax = a;
                Ay = i-a+1;
                break;
            }
        }

        // B의 번호 -> B의 좌표
        int Bx=0, By=0;
        for(int i=1;;i++) {
            if(i<b) {
                b-=i;
            } else {
                Bx = b;
                By = i-b+1;
                break;
            }
        }

        // C의 좌표 -> C의 번호
        int Cx = Ax+Bx, Cy = Ay+By;
        int depth = Cx+Cy-1;
        cout << depth*(depth-1)/2 + Cx << '\n';
    }
}