#include "coins.h"
using namespace std;

int getXor(vector<int> b) {
    int xorVal=0;
    for(int i=0;i<64;i++) {
        if(b[i]) xorVal ^= i;
    }
    return xorVal;
}

vector<int> coin_flips(vector<int> b, int c) {
    vector<int> flips(1);
    flips[0] = getXor(b)^c;
    return flips;
}

int find_coin(vector<int> b) {
    return getXor(b);
}