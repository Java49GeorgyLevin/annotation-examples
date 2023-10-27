package telran.annotation.examples;

import telran.test.annotation.Test;

import telran.test.annotation.BeforeEach;

public class TestClass {

	@BeforeEach
	void printBeforeEach() {
		System.out.println("I do print before each method");
	}
	@BeforeEach
	void printBeforeEach2() {
		System.out.println("I too do print");
	}
	void setUpFoo() {
		System.out.println("I do SetUp Foo");
	}	
	private void f1(int b) { 
		System.out.println("test f1 passed " + b);
	}
	private void f1() {
		System.out.println("test f1 failed ");
	}
	@Test
	void test1() {
		f1(10);
	}
	@Test
	void test() {
		f1();
	}
	
}