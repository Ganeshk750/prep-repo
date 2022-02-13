package com.inner;

public class TestMember {
	
	private int data = 30;
	
	class Inner{
		void msg() {
			System.out.println("Data is: "+ data);
		}
	}

	public static void main(String[] args) {
      
		TestMember obj = new TestMember();
		TestMember.Inner in = obj.new Inner();
		in.msg();
	}

}
