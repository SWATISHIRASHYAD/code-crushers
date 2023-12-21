#include<stdio.h>
void main(){
int stack[],top=0,i;
for(i=0;i<top;i++){
if(top==sizeof(stack))
{
	printf("stack overflow");
}
else
	stack[top]=i;
}

}
