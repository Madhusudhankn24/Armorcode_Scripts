package StepDefinitions;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import ArmorcodepageObjects.SubproductObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubProducts {
	public static WebDriver driver;
	public static WebDriver wait;
	public SubproductObjects subproduct;
	
	@Given("login to arorcode application")
	public void login_to_arorcode_application() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://app.armorcode.com/");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          subproduct=new SubproductObjects(driver);
          
          subproduct.microsoft();
          subproduct.eamil();
          Thread.sleep(1000);
          subproduct.pwd().sendKeys("Manu@1234");			
          subproduct.click();
          subproduct.yes();
	}
    @And("click on subproduct option")
	public void click_on_subproduct_option() throws InterruptedException {
	subproduct.sub();
}
	@And("check searchbar and  new product button should be displayed")
	public void check_searchbar_and_new_product_button_should_be_displayed() {
		
	   driver.findElement(By.xpath("(//span[@class='ant-input-suffix'])[2]")).isDisplayed();
	   driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block']")).isDisplayed();
	   
	}
     @When("check filter by option shoulde be displayed")
	public void check_filter_by_option_shoulde_be_displayed() {
	    driver.findElement(By.xpath("//span[@class='clickable filter-bar-filter-button d-flex align-items-center']")).isDisplayed();
	}
    @When("Production and Staging Tabs should be displayed")
	public void production_and_staging_tabs_should_be_displayed() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[text()='Production']")).isDisplayed();
	    driver.findElement(By.xpath("//div[text()='Staging']")).isDisplayed();
	}
    @When("Import from CSV Update CSV should be displaying")
	public void import_from_csv_update_csv_should_be_displaying() throws InterruptedException {
		Thread.sleep(2000);
	subproduct.dots();
		 driver.findElement(By.xpath("//span[text()='Import from CSV']")).isDisplayed();
		 driver.findElement(By.xpath("//span[text()='Update CSV']")).isDisplayed();
	}
    @When("Icon for Configure Tool Severity")
	public void icon_for_configure_tool_severity() {
		// driver.findElement(By.xpath(""));
	}
    @When("Icon for Subproduct SSDLC Dashboard")
	public void icon_for_subproduct_ssdlc_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		 driver.findElement(By.xpath("(//span[@role='img'])[22]")).click();
		 driver.findElement(By.xpath("(//div[@class='ant-col ant-col-sm-24'])[3]")).isDisplayed();
	}
    @When("Icon for Subproduct Security Dashboard")
	public void icon_for_subproduct_security_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//h5[text()='Security & Compliance']")).click();
		 driver.findElement(By.xpath("(//div[@class='ant-collapse ant-collapse-borderless ant-collapse-icon-position-right pull-based-tool'])[4]")).isDisplayed();
	}
    @When("Edit Subproduct")
	public void edit_subproduct() {
		 driver.findElement(By.xpath("//a[.='Edit']")).isDisplayed();
	}
    @Then("Move to another Product option")
	public void move_to_another_product_option() {
		 driver.findElement(By.xpath("//a[text()='Move to another ']")).isDisplayed();
	}
//Scenario 2
	@When("Click on New SubProduct button")
	public void click_on_new_sub_product_button() throws InterruptedException {
	subproduct=new SubproductObjects(driver);
    subproduct.newsub();
	}
    @When("the pop up should be displayed")
	public void the_pop_up_should_be_displayed() {
	   driver.findElement(By.xpath("//div[text()='Add']")).isDisplayed();
	}
    @When("enter parent product, name, clone subproduct, description,  select type, status, version number and tags")
	public void enter_parent_product_name_clone_subproduct_description_select_type_status_version_number_and_tags() throws InterruptedException {
  subproduct.product();    
  subproduct.test().click();	  
  subproduct.name("product");         
  subproduct.type();	   Thread.sleep(1000);
  subproduct.iso();
	   // WebElement web1 = driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input'])[5] "));
		 //  web1.click();
 subproduct.status();
 subproduct.suspend();
 subproduct.version().sendKeys("72");
	   Thread.sleep(1000);
 subproduct.tags();	   
	 
	   Thread.sleep(1000);
 subproduct.addtag();	  
        Thread.sleep(1000);
 subproduct.key().sendKeys("hmmsffs");

 subproduct.value().sendKeys("12");
 subproduct.save();
    }   
	@When("click on next button in basic information page")
	public void click_on_next_button_in_basic_information_page() throws InterruptedException {
    subproduct.next_button();
	}
	@When("click on drop down")
	public void click_on_drop_down() throws InterruptedException {
	 subproduct.dropdow_sla();
	}
	@When("select any on SLA name")
	public void select_any_on_sla_name() throws InterruptedException {
	subproduct.select_sla();
	}
    @When("click on next button")
	public void click_on_next_button() {
    	subproduct.next_button();
    }
  @When("risk page should be displayed click on next button")
	public void risk_page_should_be_displayed_click_on_next_button() throws InterruptedException {		
		subproduct.next_button();
	}
    @When("In the Owners Section User can select team")
	public void in_the_owners_section_user_can_select_team() {
	  subproduct.click_team();
	  subproduct.select_bu();
	}
    @When("click on next button in owner page")
	public void click_on_next_button_in_owner_page() {
	  subproduct.next_button();
	}
    @When("sslcd page select teams and click on next button")
	public void sslcd_page_select_teams_and_click_on_next_button() {
	  subproduct.addtool();
	  subproduct.amazon();
	  subproduct.next_button();
	}
    @When("advanced page fill up the details")
	public void advanced_page_fill_up_the_details() {
	subproduct.depurl();
    subproduct.click_prg();
	subproduct.select_lag();
    subproduct.tech();
	subproduct.spring();
    subproduct.repotype();
	subproduct.git();
	}
    @When("click save button")
	public void click_save_button() {
	   // driver.findElement(By.xpath("//span[text()='Submit']")).click();
	subproduct.subclose();
	subproduct.proced().click();
	
	
	}
    @Then("subproduct should be added on left panal")
	public void subproduct_should_be_added_on_left_panal() {
	   }
//Scenario3
	@When("click on desired or exit product")
	public void click_on_desired_or_exit_product() throws InterruptedException {
    subproduct=new SubproductObjects(driver);	
	subproduct.exitprd();
	}
    @When("click on edit option")
	public void click_on_edit_option() throws InterruptedException {
	   Thread.sleep(2000);
	subproduct.edit();
	}
    @When("edit page should be displayed")
	public void edit_page_should_be_displayed() throws InterruptedException {
    	Thread.sleep(2000);
	  Boolean edit_page = driver.findElement(By.xpath("//div[@class='ant-modal-header']")).isDisplayed();
	  if(edit_page)
	  {
		  System.out.println("edit page should be displayed");
	  }
	  else
		  Assert.fail("edit page is not displayed");
	}
    @When("click on owenr option")
	public void click_on_owenr_option() throws InterruptedException {
		subproduct.owner();
	 }
    @When("click on add team")
	public void click_on_add_team() {
	  subproduct.click_teamsin_owner();
	}
    @When("select any one team")
	public void select_any_one_team() {
	 subproduct.select_3kt().click();
	 
	}
   @Then("team added sucessfully")
	public void team_added_sucessfully() {
	  // driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary pull-right m-l-xs']")).click();
	subproduct.subclose();
	subproduct.proced().click();
	  }
//Scenario4	
	@When("click on desiredd subproduct")
	public void click_on_desiredd_subproduct() throws InterruptedException {
		Thread.sleep(2000);
		subproduct=new SubproductObjects(driver);
	  subproduct.desired_prd().click();
	}
  @When("verify total  high medium low should be displayed in finding sumary")
	public void verify_total_high_medium_low_should_be_displayed_in_finding_sumary() throws InterruptedException {
    Thread.sleep(2000);
  subproduct.viewpoint();
  subproduct.total();
  subproduct.critical();
  subproduct.high();
  subproduct.low();
  subproduct.medium();
	}
    @When("click on total number of finding")
	public void click_on_total_number_of_finding() throws InterruptedException {
    	Thread.sleep(2000);
   subproduct.click_total().click();
    	
	}
    @When("its navigate no finding summary")
	public void its_navigate_no_finding_summary() throws InterruptedException {
    	Thread.sleep(5000);
	 subproduct.filter();
      driver.findElement(By.xpath("//div[@class='column-filter-list m-xs']")).isDisplayed();
      Thread.sleep(1000);
     subproduct.sub();
    }
    @When("click on critial option")
	public void click_on_critial_option() throws InterruptedException {
    	Thread.sleep(3000);
	subproduct.demo();
	Thread.sleep(2000);
    subproduct.critical();
	}
	@When("verify in severity critical defects only should be displayed")
	public void verify_in_severity_critical_defects_only_should_be_displayed() throws InterruptedException {
		Thread.sleep(5000);
		subproduct.filter();
		driver.findElement(By.xpath("//span[@class='ant-checkbox ant-checkbox-checked']")).isSelected();
		subproduct.sub();
	}
    @When("click on high option")
	public void click_on_high_option() throws InterruptedException {
		  Thread.sleep(5000);
		subproduct.demo();
		  Thread.sleep(2000);
		subproduct.click_high();
	}
	@When("verify in severity high defects only should be displayed")
	public void verify_in_severity_high_defects_only_should_be_displayed() throws InterruptedException {
		Thread.sleep(4000);
	subproduct.filter();
	driver.findElement(By.xpath("//span[@class='ant-checkbox ant-checkbox-checked']")).isSelected();
	Thread.sleep(2000);
	subproduct.sub();
	}
    @When("click on lown option in findinf summary")
	
    public void click_on_lown_option_in_findinf_summary() throws InterruptedException {
    	Thread.sleep(4000);
    	subproduct.demo();
 }
     @Then("verify the severity low defect only should be displayed")
	public void verify_the_severity_low_defect_only_should_be_displayed() throws InterruptedException {
		 Thread.sleep(2000);
		 subproduct.click_medium();
		 Thread.sleep(3000);
		 subproduct.filter();
	     driver.findElement(By.xpath("//span[@class='ant-checkbox ant-checkbox-checked']")).isSelected();
	    subproduct.sub();
	}
//Scenario5
     @When("click on add new subproduct")
     public void click_on_add_new_subproduct() throws InterruptedException {
   subproduct=new SubproductObjects(driver);
    	 subproduct.sub();
    	 Thread.sleep(2000);
    subproduct.newsub();
     }

     @When("add parent product")
     public void add_parent_product() throws InterruptedException {
    	 Thread.sleep(2000);
    	  subproduct.product();        
        	 Thread.sleep(1000);
       subproduct.test();	  
    	     Thread.sleep(2000);
     }
     @When("click on colne subproduct")
     public void click_on_colne_subproduct() {
    	 
      subproduct.click_colone();
       }
     @When("add clone sub product")
     public void add_clone_sub_product() throws InterruptedException {
    	 Thread.sleep(2000);
       subproduct.colone();
       Thread.sleep(2000);
       subproduct.click_59();
     }
     @When("click on saveandskip button")
     public void click_on_saveandskip_button() throws InterruptedException {
    	 Thread.sleep(2000);
       //subproduct.save_button();
        subproduct.harika();
      }
     @Then("check the add product should not be displayed")
     public void check_the_add_product_should_not_be_displayed() throws InterruptedException {
    	 Thread.sleep(2000);
    subproduct.newsub();
    Thread.sleep(2000);
    subproduct.product();
    Thread.sleep(1000);
    subproduct.test();
    Thread.sleep(1000);
    subproduct.click_colone();
    subproduct.colone();
    Thread.sleep(1000);
    subproduct.save_button();
}
//Scenario6
     @When("click on rightmside move to another another product option")
     public void click_on_rightmside_move_to_another_another_product_option() throws InterruptedException {
    	 Thread.sleep(2000);
       subproduct.move_to();
     
     }
     @When("move product page should be displayed")
     public void move_product_page_should_be_displayed() throws InterruptedException {
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='ant-modal-title']")).isDisplayed();
     }
     @When("click on product dropdown and select any one product")
     public void click_on_product_dropdown_and_select_any_one_product() {
       subproduct.move_prd();
       subproduct.select_test();
    
      }
     @When("click on save button on moveto product")
     public void click_on_save_button_on_moveto_product() {
    	subproduct.save_move();
     }
     @Then("moveto product popup should be displayed")
     public void moveto_product_popup_should_be_displayed() {
         driver.findElement(By.xpath("//div[@style='position: absolute; top: 0px; left: 0px; width: 100%;']")).isDisplayed();
     }

//Scenarion7

     @When("click on desired products")
     public void click_on_desired_products() {
     subproduct.sce7();
     }
     @When("go to subproduct deletion option")
     public void go_to_subproduct_deletion_option()
     {
      subproduct.dlt();
     }
     @Then("click on the delete option")
     public void click_on_the_delete_option() {
    subproduct.delet();
     Boolean no_access =driver.findElement(By.xpath("//span[@class='disabled ant-tooltip-disabled-compatible-wrapper']")).isDisplayed();
     if(no_access) {
    	 System.out.println("no access pop should be displayed");
     }
     else
    	 Assert.fail("user can able delete");
     }
//scenario8
     @When("click on three dots on beside of new subproduct")
     public void click_on_three_dots_on_beside_of_new_subproduct() throws InterruptedException {
     Thread.sleep(2000);
    subproduct.dots();
    	     
     }
     @When("import and unpatae popup should be displayed")
     public void import_and_unpatae_popup_should_be_displayed() throws InterruptedException {
    	 Thread.sleep(1000);
    	 boolean import_csv=driver.findElement(By.xpath("//ul[@role='menu']")).isDisplayed();
         if(import_csv) {
         	System.out.println("pop up should be displayed");
         }else
         	Assert.fail("pop should not be displayed");
     }
     @When("click on import csv")
    public void click_on_import_csv() throws InterruptedException {
    	 Thread.sleep(1000);
         subproduct.csv();
     }
     @When("import csv pop page should be displayed")
     public void import_csv_pop_page_should_be_displayed() throws InterruptedException {

    	 Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Import from CSV']")).isDisplayed();
     }
     @When("click on dowload options")
     public void click_on_dowload_options() throws InterruptedException
     { Thread.sleep(1000);
    	subproduct.click_dowload();
     }
     
     @Then("click on cancel button")
     public void click_on_cancel_button() throws InterruptedException {
    	 Thread.sleep(2000);
   	 subproduct.cancle_csv();
     
     }
 //Scenario9
     @When("click on three dotsss")
     public void click_on_three_dotsss() throws InterruptedException {
    	 Thread.sleep(2000);
        subproduct.dots();
     }
     @When("update pop up should be displayed")
     public void update_pop_up_should_be_displayed() throws InterruptedException {
    	 Thread.sleep(1000);
    	 boolean import_csv=driver.findElement(By.xpath("//ul[@role='menu']")).isDisplayed();
         if(import_csv) {
         	System.out.println("pop up should be displayed");
         }else
         	Assert.fail("pop should not be displayed");

     }
     @When("click on update csv option")
     public void  click_on_update_csv_option() throws InterruptedException
     { Thread.sleep(2000);
    	subproduct.update_csv();
     }
     @When("update csv page should be displayed")
     public void update_csv_page_should_be_displayed() throws InterruptedException {
    	 Thread.sleep(1000);
         
    	  driver.findElement(By.xpath("//span[text()='Update CSV']")).isDisplayed();
     }

     @When("update page click on download option")
     public void update_page_click_on_download_option() throws InterruptedException {
    	 Thread.sleep(1000);
    	subproduct.click_dowload();
    	   }

     @Then("finaly cilck on cancel button")
     public void finaly_cilck_on_cancel_button() throws InterruptedException {
    	 Thread.sleep(2000);
       	subproduct.cancle_csv();

     }





    

    
       
    

   

    
 






}