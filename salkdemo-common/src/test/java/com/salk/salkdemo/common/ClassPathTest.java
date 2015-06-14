package com.salk.salkdemo.common;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ClassPathTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathTest classPathTest = new ClassPathTest();
		//file:/E:/work/2015/workspaces/salkdemo/salkdemo-common/target/test-classes/com/salk/salkdemo/common/
		//得到的也是当前ClassPath的绝对URI路径 。
		System.out.println(classPathTest.getClass().getResource(""));
		System.out.println(ClassLoader.getSystemResource(""));
		System.out.println(Thread.currentThread().getContextClassLoader ().getResource(""));
		URL base = classPathTest.getClass().getResource("");
		System.out.println(base);

		String path = new File(base.getFile(),"……/……/……/").getCanonicalPath();
		 System.out.println("path::"+path);
		System.out.println(classPathTest.getClass().getResource("/"));
	}

}
