#include<bits/stdc++.h>

using namespace std;

int cnt=0;
bool chk=false;
int r, c;

void visit(int a, int b, int N) {
    if(chk) return;
    if(N==0) {
        if(a==r && b==c) {
            chk=true;
            return;
        }
        cnt++;
        return;
    }
    int size = pow(2, N-1);
    if(r<a+size && c<b+size) visit(a, b, N-1);
    else cnt += size*size;

    if(chk) return;
    if(r<a+size && c>=b+size) visit(a, b+size, N-1);
    else cnt += size*size;

    if(chk) return;
    if(r>=a+size && c<b+size) visit(a+size, b, N-1);
    else cnt += size*size;

    if(chk) return;
    if(r>=a+size && c>=b+size) visit(a+size, b+size, N-1);
    else cnt += size*size;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N >> r >> c;

    visit(0, 0, N);
    cout << cnt;
}