package Definitions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jamal.pages.utils.DriverLoader;
import com.jamal.pages.utils.ProblemDomain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition  extends ProblemDomain {
	
	DriverLoader d =new DriverLoader();
	


	
public static WebDriver driver;

	@Given("^Go to the path where driver is located$")
	public void go_to_the_path_where_driver_is_located() throws Throwable {
		d.launchBrowser();
	}

	@When("^once the driver is initialzed accss the url \"([^\"]*)\"$")
	public void once_the_driver_is_initialzed_accss_the_url(String arg1) throws Throwable {
		d.launchurl();
	}

	@Then("^Maximize the window and jump to the objectives$")
	public void maximize_the_window_and_jump_to_the_objectives() throws Throwable {
		d.maximize();
	}

	@Given("^Verify if there are values on the screen$")
	public void verify_if_there_are_values_on_the_screen() throws Throwable {
		ProblemDomain Lib = new ProblemDomain();
				Lib.assertText(driver.findElement(By.tagName("body")), "Values");
	} 
	
	
	@Then("^print out the result with right count of  values$")
	public void print_out_the_result_with_right_count_of_values() throws Throwable {	
		WebElement body = driver.findElement(By.tagName("body"));
		String bodyText = body.getText();
		int count = 0;
		while (bodyText.contains("Values")){
		    count++;
		    bodyText = bodyText.substring(bodyText.indexOf("Values") + "Values".length());
		}
		System.out.println(count);
	}
	
	
	@Given("^verify if there are integers on the screen$")
	public void verify_if_there_are_integers_on_the_screen() throws Throwable {
	 		
		java.util.List<WebElement> isPresent = driver.findElements(By.tagName("body")) ;
	}
	
	 
		 @Then("^output the result with the value for the true condition$")
			public void output_the_result_with_the_value_for_the_true_condition() throws Throwable {
			 
			 WebElement element1 = driver.findElement(By.id("txt_val_1"));   
			 WebElement element2 = driver.findElement(By.id("txt_val_2"));   
			 WebElement element3 = driver.findElement(By.id("txt_val_3")); 
			 WebElement element4 = driver.findElement(By.id("txt_val_4")); 
			 WebElement element5 = driver.findElement(By.id("txt_val_5")); 

			 if(element1.equals(0))
			      System.out.println("element1 is not greater than 0");
			  else 
				  System.out.println("element1 is  greater than 0");
			   if (element2.equals(0))
			    	System.out.println("element2 is not greater than 0");
			   else 
					  System.out.println("element2 is greater than 0");
			   if (element3.equals(0))
			    	System.out.println("element3 is not greater than 0");
			   else 
					  System.out.println("element3 is greater than 0");
			   if (element4.equals(0))
			    	System.out.println("element4 is not greater than 0");
			   else 
					  System.out.println("element4 is  greater than 0");
			   if (element5.equals(0))
			    	System.out.println("element5 is not greater than 0");
			   else 
					  System.out.println("element5 is  greater than 0");	
		 }
		 
			 //   the second method would be 
//			   @Then("^output the result with the value for the true condition$")
//			   
//			   
//			   public void output_the_result_with_the_value_for_the_true_condition() throws Throwable {
//				java.util.List<WebElement> myList=driver.findElements(By.className("table"));
//				ArrayList<String> all_elements_text=new ArrayList<java.lang.String>();
//
//			    for(int i=0; i<0; i++){
//
//			   System.out.println("Values which are greater are "+ i);	    
//			}	     
	@Given("^Matching the format of the values with the regular expression for currency$")
	public void getting_the_regex_for_currency_validating() throws Throwable {
		
		
		//pattern for currency format
		Pattern p=Pattern.compile("^\\$?(([1-9]\\d{0,2}(,\\d{3})*)|0)?\\.\\d{1,2}$");	  
	}
	
	
	@Then("^Print the result if the condition matches$")
	public void print_the_result_if_the_condition_matches() throws Throwable {}
	WebElement val1= driver.findElement(By.id("txt_val_1"));
	WebElement val2=driver.findElement(By.id("txt_val_2"));
WebElement val3=driver.findElement(By.id("txt_val_3"));
WebElement val4=driver.findElement(By.id("txt_val_4"));
WebElement val5=driver.findElement(By.id("txt_val_5"));;
		

Boolean matchFlag = true; 
Pattern p1 = Pattern.compile("^\\$?(([1-9]\\d{0,2}(,\\d{3})*)|0)?\\.\\d{1,2}$");
{
	
if(val1!=null) {
	//check whether the given input value matches with the currency pattern, then set flag to true
	Matcher m=p1.matcher((CharSequence) val1);
	matchFlag =true;
	}
	else {matchFlag = false;
	}
	if(val2!=null) {
		//check whether the given input value matches with the currency pattern, then set flag to true
		Matcher m=p1.matcher((CharSequence) val2);
		matchFlag =true;
		}
		else {matchFlag = false;
		}
	if(val3!=null) {
		//check whether the given input value matches with the currency pattern, then set flag to true
		Matcher m=p1.matcher((CharSequence) val3);
		matchFlag =true;
		}
		else {matchFlag = false;
		}
	if(val4!=null) {
		//check whether the given input value matches with the currency pattern, then set flag to true
		Matcher m=p1.matcher((CharSequence) val4);
		matchFlag =true;
		}
		else {matchFlag = false;
		}
	if(val5!=null) {
		//check whether the given input value matches with the currency pattern, then set flag to true
		Matcher m=p1.matcher((CharSequence) val5);
		matchFlag =true;
		}
		else {matchFlag = false;
		}
	}

	@Given("^locating the elements$")
public void locating_the_elements() throws Throwable {
		WebElement val1= driver.findElement(By.id("txt_val_1"));
		WebElement val2=driver.findElement(By.id("txt_val_2"));
WebElement val3=driver.findElement(By.id("txt_val_3"));
WebElement val4=driver.findElement(By.id("txt_val_4"));
WebElement val5=driver.findElement(By.id("txt_val_5"));;
        
	}
	@Then("^output the result$")
	public void output_the_result() throws Throwable {
	
		WebElement val1= driver.findElement(By.id("txt_val_1"));
        WebElement val2=driver.findElement(By.id("txt_val_2"));
        WebElement val3=driver.findElement(By.id("txt_val_3"));
        WebElement val4=driver.findElement(By.id("txt_val_4"));
        WebElement val5=driver.findElement(By.id("txt_val_5"));
        WebElement Total=driver.findElement(By.id("txt_ttl_val"));
     
      String  ab = "val1"+"val2"+"val3"+"val4"+"val5";
		
		if 
        (ab.equals(Total) )
  System.out.println("sum matches the total balance");

		
  else 
  	System.out.println("");
	
	
}
		
		 }


