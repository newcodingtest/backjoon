//1988kb, 0ms
#include<iostream> 
#include<vector>
#include<algorithm>
using namespace std;  
int N;
int A[1001]; //입력 받을 수열
vector<int> v; //증가하는 수열을 저장할 벡터

int main() 
{
	cin.sync_with_stdio(0); 
	cin.tie(0); cout.tie(0);

	//입력받는 부분
	cin >> N;
	for (int i = 0; i < N; i++)
		cin >> A[i];
	
	v.push_back(A[0]);
	for (int i = 1; i < N; i++)
	{
		//수열의 현재위치의 값이 벡터의 마지막 위치의 값보다 크면 뒤에 추가
		if (v.back() < A[i])
			v.push_back(A[i]);
		//그렇지 않으면 해당하는 수가 들어갈 위치를 찾아서 넣어줌
		else
		{
			int index = lower_bound(v.begin(), v.end(),A[i]) - v.begin();
			v[index] = A[i];
		}
	}
	cout << v.size();
	return 0; 
}