//============================================================================
// Name        : Stack_appli.cpp
// Author      : Vaishnavi Madhekar
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
//Stack Application Problem :- Evalution of Postfix Expression

#include <iostream>
using namespace std;

class stack
{
	int top;
	int st[20];
public:
	void push(int d);
	int pop();
	void display_top();
	int isempty();
	int isfull();
	stack()
	{
		top=-1;
	}
	friend class eval;
};

class eval
{
	string exp;
public:
	void evalute_expression();
};

void stack::push(int d)
{
	int data=d;
	if(isfull()==0)
	{
		top++;
		st[top]=data;
	}
	else
	{
		cout<<"Stack is full cannot add elements"<<endl;
		cout<<" "<<endl;
	}
}

int stack::pop()
{
	int r_data;
	if(isempty()==1)
	{
		cout<<"Stack is underflow no element found"<<endl;
		r_data=0;
		return r_data;
	 }
	else
	{
		r_data=st[top];
		top--;
		return r_data;
	}
}

void stack::display_top()
{
	cout<<"Displaying the top position of the stack"<<endl;
	cout<<top;
}

int stack::isempty()
{
	if(top==-1)
	{
		return 1;
	}

	else
	{
		return 0;
	}
}

int stack::isfull()
{
	if(top==19)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

 void eval::evalute_expression()
 {
	 cout<<"Enter the postfix expression"<<endl;
	 cin>>exp;
	 cout<<""<<endl;
	 stack s1;
	 int i=0;
	 int eval_result;
	 int no;
	 for(i=0;exp[i]!='\0';i++)
	 {
		if(isdigit(exp[i]))
		{
			s1.push(exp[i]-'0');

		}
		 else
		 {
			 int val1 =s1.pop();
			 int val2 =s1.pop();
			 switch (exp[i])
			 {
			    case '+':s1.push(val2 + val1);
			    break;
			    case '-':s1.push(val2 - val1);
			    break;
			    case '*':s1.push(val2 * val1);
			    break;
			    case '/': s1.push(val2/val1);
			    break;
			 }
		 }
     }
	 cout<<"The evalution result is"<<endl;
	 eval_result=s1.pop();
	 cout<<eval_result<<endl;
 }


int main()
{
	//cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	cout<<"----------------------------------------------------------------"<<endl;
	cout<<"#################### Welcome to Stack Operations ################"<<endl;
	cout<<"----------------------------------------------------------------"<<endl;
	eval e;
	e.evalute_expression();
	return 0;
}








/*

----------------------------------------------------------------
#################### Welcome to Stack Operations ################
----------------------------------------------------------------
Enter the postfix expression
456*+

The evalution result is
34


----------------------------------------------------------------
#################### Welcome to Stack Operations ################
----------------------------------------------------------------
Enter the postfix expression
12345*+*+

The evalution result is
47



----------------------------------------------------------------
#################### Welcome to Stack Operations ################
----------------------------------------------------------------
Enter the postfix expression
53+82-*

The evalution result is
48


----------------------------------------------------------------
#################### Welcome to Stack Operations ################
----------------------------------------------------------------
Enter the postfix expression
231*+9-

The evalution result is
-4




*/
