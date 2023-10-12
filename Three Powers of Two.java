#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int test;
	cin>>test;
	while(test--){
	    int first;
	    cin>>first;
	    string sec;
	    cin>>sec;
	    int count=0;
	    for(auto i:sec){
	        if(i=='1') count++;
	    }
	    if(sec=="1"||sec=="10"){
	        cout<<"NO\n";
	        
	    }
	    else if(count<=3){
	        cout<<"YES\n";
	    }
	    else{
	        cout<<"NO\n";
	    }
	}
	return 0;
}
