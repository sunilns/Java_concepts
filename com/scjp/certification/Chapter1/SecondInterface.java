package Chapter1;

import Chapter1.FirstInterface;

public interface SecondInterface extends FirstInterface{
	//overload
	void getNumberZero(int num);
	//override
	int getNumberZero();
	
	//IMP to remeber .... Following is NOT overload or override! It is not legal.
	//void getNumberZero();
	
}



