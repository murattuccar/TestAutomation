package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageObjects {
	@FindBy(xpath = "//input[@name='username']")
    public WebElement Username ;
	@FindBy(xpath = "//input[@name='password']")
    public WebElement Password;
	@FindBy(xpath = "//input[@type='button']")    
	public WebElement SignInButton;
	
	//Login status
	public static String successful = "**Successful Login**";
	public static String failed = "**Failed Login**";
	
	//Alert messages
	public static String shortUsernameWarning = "Username too short.  The username must be at least 4 characters in length..";
	public static String shortPasswordWarning = "Password too short.  The password must be at least 4 characters in length.";
	public static String longPasswordWarning = "Password is too long. Password must be up to 8 characters in length";
	public static String longUsernameWarning = "Username is too long.  The username must be up to 16 characters in length.";
	public static String UsernameWarning = "Username is wrong. Please enter the correct username.";
	public static String PasswordWarning = "Password is wrong. Please enter the correct password.";
	
}


