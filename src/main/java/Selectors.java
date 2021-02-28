import org.openqa.selenium.By;

public class Selectors {
    public static By cookie = By.cssSelector("a[aria-label='dismiss cookie message']");
    public static By username = By.cssSelector("input[data-placeholder='Username']");
    public static By password = By.cssSelector("input[formcontrolname='password']");
    public static By loginButton = By.cssSelector("button[aria-label='LOGIN']");
    public static By menu = By.cssSelector("svg[data-icon=\"bars\"]");
    public static By setupMenu = By.cssSelector(".group-items > :nth-child(1)");
    public static By HumanResources = By.xpath("//span[contains(text(),'Human Resources')]");
    public static By Employees = By.xpath("//span[contains(text(),'Employees')]");
    public static By TrippleDot = By.cssSelector("div>div.ng-star-inserted>button>span>fa-icon");
    public static By TextFile = By.cssSelector("button[role=\"menuitem\"]");
    public static By addButton = By.cssSelector("ms-add-button[tooltip='EMPLOYEE.TITLE.ADD']");
    public static By firstName = By.cssSelector("ms-text-field[formcontrolname='firstName']>input");
    public static By lastName = By.cssSelector("ms-text-field[formcontrolname='lastName']>input");
    public static By employeeId = By.cssSelector("input[formcontrolname='employeeId']");
    public static By documentType = By.cssSelector("mat-form-field[formgroupname='documentInfo'] div div div div div");
    public static By documentType2 = By.xpath("//span[contains(text(),'Passport')]");
    public static By documentNumber = By.cssSelector("input[formcontrolname='documentNumber']");
    public static By saveButton = By.cssSelector("ms-save-button");
    public static By alert = By.cssSelector("div[role='alertdialog']");
    public static By lastPageButton = By.cssSelector("button[aria-label='Last Page']");
    public static By verifyName = By.xpath("//td[text()='Hasan  Karaca']");
    public static By updateFirstName = By.cssSelector("#ms-text-field-12>input");
}
