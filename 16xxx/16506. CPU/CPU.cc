#include<bits/stdc++.h>
using namespace std;

string toBinary(int n, int len) {
    string ret="";
    for(int i=0;i<len;i++) {
        if(n%2) ret += "1";
        else ret += "0";
        n/=2;
    }
    for(int i=0;i<len/2;i++) {
        swap(ret[i], ret[len-1-i]);
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        string opcode; int rD, rA, rB; cin >> opcode >> rD >> rA >> rB;
        if(opcode.compare("ADD")==0) cout << "000000" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("ADDC")==0) cout << "000010" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("SUB")==0) cout << "000100" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("SUBC")==0) cout << "000110" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("MOV")==0) cout << "001000" << toBinary(rD, 3) << "000" << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("MOVC")==0) cout << "001010" << toBinary(rD, 3) << "000" << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("AND")==0) cout << "001100" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("ANDC")==0) cout << "001110" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("OR")==0) cout << "010000" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("ORC")==0) cout << "010010" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("NOT")==0) cout << "010100" << toBinary(rD, 3) << "000" << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("MULT")==0) cout << "011000" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("MULTC")==0) cout << "011010" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("LSFTL")==0) cout << "011100" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("LSFTLC")==0) cout << "011110" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("LSFTR")==0) cout << "100000" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("LSFTRC")==0) cout << "100010" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("ASFTR")==0) cout << "100100" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("ASFTRC")==0) cout << "100110" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("RL")==0) cout << "101000" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else if(opcode.compare("RLC")==0) cout << "101010" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
        else if(opcode.compare("RR")==0) cout << "101100" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 3) << "0\n"; 
        else cout << "101110" << toBinary(rD, 3) << toBinary(rA, 3) << toBinary(rB, 4) << "\n"; 
    }
}