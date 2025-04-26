#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;
int inorderElementIdx[MAX+1];
int postorder[MAX];
/**
 * inorder : left - root - right
 * postorder : left - right - root
 * preorder : root - left - right
 */

void printPreorder(int postL, int postR, int inL, int inR) {
    int root = postorder[postR];
    int leftCnt = inorderElementIdx[root]-inL;
    cout << root << ' ';
    if(postL<=postL+leftCnt-1) printPreorder(postL, postL+leftCnt-1, inL, inorderElementIdx[root]-1);
    if(postL+leftCnt<=postR-1) printPreorder(postL+leftCnt, postR-1, inorderElementIdx[root]+1, inR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        int inorder; cin >> inorder;
        inorderElementIdx[inorder]=i;
    }
    for(int i=0;i<n;i++) cin >> postorder[i];
    printPreorder(0, n-1, 0, n-1);
}