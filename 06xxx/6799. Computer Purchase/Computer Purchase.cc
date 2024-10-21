#include<bits/stdc++.h>
using namespace std;

struct Computer {
    string C; int R, S, D;
    bool operator<(const Computer c) const {
        if(2*R+3*S+D == 2*c.R+3*c.S+c.D) return C < c.C;
        return 2*R+3*S+D > 2*c.R+3*c.S+c.D;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    if(N==0) return 0; // N==0
    Computer arr[N];
    for(int i=0;i<N;i++) cin >> arr[i].C >> arr[i].R >> arr[i].S >> arr[i].D;
    sort(arr, arr+N);

    if(N==1) cout << arr[0].C; // N==1
    else cout << arr[0].C << '\n' << arr[1].C;
}