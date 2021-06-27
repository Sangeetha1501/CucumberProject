package com.amazon.pom;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage {
	
	public WebDriver driver;
	
	public WebTablePage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void getEmployeeDataAndItsCount(String expectedHeader) {
		Map<String,Integer>empCountByCity = new HashMap<String,Integer>();
		List<WebElement>tableHeaders;
		List<WebElement>tableDatas;
		int count = 0;
		tableHeaders = driver.findElements(By.tagName("th"));
		for (WebElement headerName : tableHeaders) {
			if(headerName.getText().equalsIgnoreCase(expectedHeader)) {
				count++;
				tableDatas = driver.findElements(By.xpath("//td["+count+"]"));
				for (WebElement data : tableDatas) {
					String dataName = data.getText();
					int dataCount;
					if(empCountByCity.get(dataName)== null) {
						empCountByCity.put(dataName, 1);
					}else {
						dataCount = empCountByCity.get(dataName);
						empCountByCity.put(dataName, dataCount+1);
					}
					
				}
				System.out.println(empCountByCity);
				break;
			}else {
				count++;
			}
			
		}
		
	}

}
