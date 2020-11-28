//============================================================================
// Name        : Majority_Element.cpp
// Author      : Vaishnavi Madhekar
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
//You have to given an array A of size N.
//Find all the elements which appear more than floor(N/3) times in the given array.
//There is a condition that you have to do your job in O(N) time complexity and O(1) space complexity.
/*Sample Input
  8
  2 2 3 1 3 2 1 1 
  Sample Output
  1 2
*/

#include<iostream>
#include<vector>
using namespace std;
 

vector<int> findmajority(vector<int> v)
{
    int e1,e2,e1c,e2c=0;
    e1=v[0];
    e1c=1;
    for(int i=0;i<v.size();i++)
    {
        if(e1==v[i])
        {
            e1c++;
        }
        else if (e2==v[i])
        {
            e2c++;
            /* code */
        }

        else if (e1c==0)
        {
            e1=v[i];
            e1c=1;
            /* code */
        }
        else if(e2c==0)
        {
            e2=v[i];
            e2c=1;
            /* code */
        }
        else
        {
            
            e1c--;
            e2c--;
        }
    }

    e1c=0;
    e2c=0;
    for(int i=0;i<v.size();i++)
    {
        if(v[i]==e1) e1c++;
        if(v[i]==e2) e2c++;    
    }
    vector<int> ans;
    if(e1c>v.size()/3)
    {
        ans.push_back(e1);
    }
    if(e2c>v.size()/3)
    {
        ans.push_back(e2);
    }

    return ans;

} 
 
 
int main()
{
    int n,x;
    cin>>n;
    vector<int> v;
    for(int i=0;i<n;i++)
    {
        cin>>x;
        v.push_back(x);
    }

    vector<int> ans;
    ans=findmajority(v);
    if(ans.size()==0)
    {
        cout<<"No Majority Elements"<<endl;
    }
    else
    {
        for(int i=0;i<ans.size();i++)
        {
            cout<<ans[i]<<" ";
        }
        
    }
    

    cout<<endl;
    return 0;
}
