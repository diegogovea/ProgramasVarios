#include <iostream>
using namespace std;

bool es_palindromo(const string&);
string invertir_cadena(string);

int main() {
    string palabra;
    cout << "Bienvenido a Palindromo" << endl;
    cout << "Ingresa una palabra" << endl;
    cin >> palabra;
    
    if(es_palindromo(palabra)){
        cout << "La palabra es palindromo"<<endl;
    }else{
        cout << "La palabra NO es palindromo"<<endl;
    }

    return 0;
}

bool es_palindromo(const string& palabra) {
    string palabraI = invertir_cadena(palabra);

    if(palabra==palabraI){
        return true;
    }else{
        return false;
    }
}

string invertir_cadena(string cadena){
    string cadenaI="";

    for(int i = cadena.length() - 1; i >= 0; i--){
        cadenaI += cadena[i];
    }

    return cadenaI;

}



