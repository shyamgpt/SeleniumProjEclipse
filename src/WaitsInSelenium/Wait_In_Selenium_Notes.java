package WaitsInSelenium;

public class Wait_In_Selenium_Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Synchronisation in Selenium
		 * 
		 * 1.Implicit wait
		 * 2.Explicit wait
		 * 3.Thread.sleep
		 * 4.Fluent wait
		 * 
		 * Implicit wait --> It applied to globally for each and every webelemt,
		 * implicit wait applies globally
		 * 
		 * In explicti wait -- we can target espcific element
		 * It applied locally to epecific elememt
		 * explicit wait is do not applies globally
		 * 
		 * Thread.sleep--> this is not the part of webdriver, it is the part
		 * of java, and it do not listen to DOM also.
		 * If Thread.sleep is given for 5 Sec then it will wait for 5 Sec,
		 * whether element is lodded or not.
		 * */

		/**
		 * In framework how we will use the explicit wait to target
		 * especific element?
		 * 
		 * What is UAT ans IST Environment.
		 * In UAT enviroment we show the code to client in sign off.
		 * */
		
		/**
		 * pros & Cons of waits-->
		 * 
		 * 
		 * 
		 * Implicit waits--> 
		 * 
		 * Pros--Readable code
		 * Cons--
		 * Performanc issue is not caught
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Explicit waits-->
		 * pros--wait is applied to the tagreted element. so performance issue
		 * 
		 * cons--> 
		 * 
		 * Explicit wait can be categorised into 2 ways-->
		 * 1. Webdriver wait(i.e explicit wait)
		 * 2. Fluent wait=10 sec, Polling 4 sec
		 * 
		 * 
		 * Fluent wait -->
		 * This wait finds the webelement repeatedly at regular intervals of time
		 * until the timouts or till the object get founds
		 * --> If time in given in explicit wait (let say 10 sec is given)
		 * then till 1-10 sec it will continosly will look for the element
		 * whether the dom is loade or not.(every milli seconds)
		 * 
		 * -->In fluent wait we have to give the polling time so that it can 
		 * monitor at the given interval of time.
		 * 
		 * Eg; Fluent wait(timeout for 10 sec, and polling time for 2 sec)
		 * 
		 * Eg; Let say polling time is given 2 sec, then at every 2 sec it will
		 * it will look for the element is present or not in browser.
		 * - At every 2 sec it will search for that element,
		 * - let say element is not found in 2 sec then it will again for element
		 * after the 2 sec.
		 * - if element is found in 2sec then it will come out of that wait 
		 * once element is located.
		 * 
		 * Eg: Practical Example of Fluent wait -->
		 * this is used where locators element is getting changes -->
		 * 1-Your card is accepted, your order is being processed, Order confirmed
		 * 2-Your coupon code is valid (at 3 sec), 
		 *   Your coupon code successfully applied(at 6 sec)
		 *   and we have common xpath for both the element above.
		 * 
		 * Syntax-->
		 * 
		 * 
		 * 
		 * Wait<webdriver> wait = new FluentWait<webdriver>(driver).
		 * withTimeout(Durations.ofSecond(30)).PollingEvery(Duration.ofSeconds(3)).
		 * ignoring(NoSuchElementException.class);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("example")));
		 * */
		
		
		
		/*Code from lecture-->
		 * (Unique link to open lecture directly:

Have a copy of below link for Quick view of this video at later time
https://www.udemy.com/selenium-real-time-examplesinterview-questions/learn/v4/t/lecture/6760848)
		 * 
		 * public class base {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");



WebDriver driver=new ChromeDriver();

//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

WebDriverWait w =new WebDriverWait(driver,5);






String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





driver.get("https://rahulshettyacademy.com/seleniumPractise/");

Thread.sleep(3000);

addItems(driver,itemsNeeded);

driver.findElement(By.cssSelector("img[alt='Cart']")).click();

driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));



driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

driver.findElement(By.cssSelector("button.promoBtn")).click();

//explicit wait



w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));



System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

















}



public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;

List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));


for(int i=0;i<products.size();i++)


{


//Brocolli - 1 Kg

//Brocolli,    1 kg

String[] name=products.get(i).getText().split("-");

String formattedName=name[0].trim();


//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-


List itemsNeededList = Arrays.asList(itemsNeeded);



if(itemsNeededList.contains(formattedName))

{


j++;

//click on Add to cart

driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();


if(j==itemsNeeded.length)

{

break;

}





}

}

}




}


		 * 
		 * **/
		
		
	}

}
