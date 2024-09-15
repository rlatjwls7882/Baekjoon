#include<bits/stdc++.h>
using namespace std;

int N, K;
bool canWin=false;
int A[9][9], B[20], C[20];
bool visited[9] = {false, };

void back(int win1, int win2, int win3, int Bidx, int Cidx, int player1, int player2) {
    if(win1==K) canWin=true;
    if(canWin || win2==K || win3==K || Bidx>=20 || Cidx>=20) return;
    if(player1==1 && player2==2 || player1==2 && player2==1) {
        for(int i=0;i<N;i++) {
            if(!visited[i]) {
                visited[i]=true;
                if(A[i][B[Bidx]]==2) back(win1+1, win2, win3, Bidx+1, Cidx, 1, 3);
                else back(win1, win2+1, win3, Bidx+1, Cidx, 2, 3);
                visited[i]=false;
            }
        }
    } else if(player1==1 && player2==3 || player1==3 && player2==1) {
        for(int i=0;i<N;i++) {
            if(!visited[i]) {
                visited[i]=true;
                if(A[i][C[Cidx]]==2) back(win1+1, win2, win3, Bidx, Cidx+1, 1, 2);
                else back(win1, win2, win3+1, Bidx, Cidx+1, 3, 2);
                visited[i]=false;
            }
        }
    } else {
        if(A[B[Bidx]][C[Cidx]]==2) back(win1, win2+1, win3, Bidx+1, Cidx+1, 2, 1);
        else back(win1, win2, win3+1, Bidx+1, Cidx+1, 3, 1);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> K;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> A[i][j];
        }
    }

    for(int i=0;i<20;i++) {
        cin >> B[i]; B[i]--;
    }
    for(int i=0;i<20;i++) {
        cin >> C[i]; C[i]--;
    }

    back(0, 0, 0, 0, 0, 1, 2);
    cout << canWin;
}