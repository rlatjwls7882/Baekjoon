#include<bits/stdc++.h>
using namespace std;

char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
int val[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
int used[16];
int chIdxA[8], chIdxB[8];
char a[8], b[6];

int hexToDec(int s, int e) {
    int sum=0, cur=1;
    for(int i=e;i>=s;i--) {
        sum += cur * val[chIdxA[i]];
        cur *= 16;
    }
    return sum;
}

bool decToHex(int val) {
    bool chk=true;
    for(int i=4;i>=0;i--) {
        b[i] = ch[val%16];
        chIdxB[i] = val%16;
        if(++used[val%16]>=2 && i>1) chk=false;
        val /= 16;
    }
    return chk && b[0]!='0' && a[2]==b[0] && a[3]==b[1];
}

void dfs(int depth=0) {
    if(depth==6) {
        a[7] = a[5];
        a[5] = a[1];
        a[6] = a[0];
        chIdxA[7] = chIdxA[5];
        chIdxA[5] = chIdxA[1];
        chIdxA[6] = chIdxA[0];
        if(decToHex(hexToDec(0, 3) + hexToDec(4, 7))) cout << a[0] << a[1] << a[2] << a[3] << " + " << a[4] << a[5] << a[6] << a[7] << " = " << b << '\n';
        for(int i=4;i>=0;i--) used[chIdxB[i]]--;
        return;
    }
    for(int i=0;i<16;i++) {
        if((depth==0 || depth==4) && i==0) continue;
        if(!used[i]) {
            a[depth] = ch[i];
            chIdxA[depth] = i;
            used[i]++;
            dfs(depth+1);
            used[i]--;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    dfs();
}