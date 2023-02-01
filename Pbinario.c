#include <stdio.h>
#include <conio.h>
#include <unistd.h>
#include <math.h>

void decbin(int a){
	
	if(a < 0)
	{
		a *= -1;
		decbin(a);
	} 
	

	char bin[] = "0000000000000000";
	int exp = 15;
	int pot = 0;
	
	while(a != 0)
	{
		pot = pow(2, exp);
		if(pot <= a)
		{
			a -= pot;
			bin[exp] = 49; 
		}
		else{
			bin[exp] = 48;
		}
		exp--;
	}
	
	int x;
	
	for(x = 16; x >= 0; x--)
	{
		printf("%c", bin[x]);
		if(x%4==0)
			printf(" ");
	}
	
}

int num(){
	char num[] = "     ";
	char c;
	int numero = 0;
	int x = 0, s = 0, tipo = 1;
	while(x < 5){
		c = getch();
		if((c >= 48 && c < 58) || (x == 0 && c == 45))
		{
			printf("%c", c);
			num[x] = c;
			x++;
			s++;			
		}
		if(c == 13)
		{
			break;
		}
	}
	
	s--;
	
	for(x = 4; x >= 0; x--)
	{
		c = num[x];
		if(c != 32)
		{
			if(c != 45)
				numero += (c-48) * pow(10, s-x);
			else
				tipo = -1;
		}
	}	
	return numero * tipo;
}

int main(){
	while(getch() != 13)
	{
		int numero = 0;	
		numero = num();		
		decbin(numero);
	}
	
}
