package com.pom_2;

import org.openqa.selenium.WebDriver;

import com.pom_1.Book_Hotel;
import com.pom_1.Booking_Confrom;
import com.pom_1.Home_Page_1;
import com.pom_1.Search_Hotel;
import com.pom_1.Select_Hotel;

public class Page_Object_Manager_2 {

	public WebDriver driver;

	private Home_Page_1 hp;
	private Search_Hotel sh;
	private Select_Hotel shl;
	private Book_Hotel bh;
	private Booking_Confrom bc;

	public Page_Object_Manager_2(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_Page_1 getHp() {
		if (hp == null) {

			hp = new Home_Page_1(driver);
		}
		return hp;
	}

	public Search_Hotel getSh() {
		if (sh == null) {

			sh = new Search_Hotel(driver);
		}
		return sh;
	}

	public Select_Hotel getShl() {
		if (shl == null) {

			shl = new Select_Hotel(driver);
		}
		return shl;
	}

	public Book_Hotel getBh() {
		if (bh == null) {

			bh = new Book_Hotel(driver);
		}
		return bh;
	}

	public Booking_Confrom getBc() {
		if (bc==null) {
			
			bc=new Booking_Confrom(driver);
		}
		return bc;
	}

}
