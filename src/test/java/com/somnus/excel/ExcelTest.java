package com.somnus.excel;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import com.somnus.AbstractTestSupport;
import com.somnus.ApplicationContextHolder;
import com.somnus.support.util.excel.impl.CommonTemplate;
import com.somnus.support.util.velocity.CommonVelocity;

public class ExcelTest extends AbstractTestSupport {
	@Test
	public void test1(){
		CommonTemplate temp = (CommonTemplate)ApplicationContextHolder.getBean(CommonTemplate.class);
		try {
			OutputStream out2 = new FileOutputStream("E://b.xlsx");
			
			temp.export(null, null, out2);
			
			out2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test2(){
		CommonVelocity temp = (CommonVelocity)ApplicationContextHolder.getBean(CommonVelocity.class);
		try {
			temp.createvelocityFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
