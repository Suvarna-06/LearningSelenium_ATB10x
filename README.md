# 🚀 Selenium Learning Guide

## 🛠️ Tech Stack for Selenium

- ✅ **Java**
- ✅ **TestNG** (testng.xml)
- ✅ **Maven** (pom.xml)
- ✅ **Allure Report**
- ✅ **Jenkins**
- ✅ **GIT**
- ✅ **log4j** (log4j.xml)
- ✅ **Selenium**
- ✅ **GitHub**
- ✅ **DDT (Apache POI)**
- ✅ **Test Data - TestData.xlsx**

---

## 📖 Learning Selenium - Concepts with Examples

### 🔹 1. Introduction to Selenium
- 🧐 What is Selenium?
- 🏗️ Selenium Components: Selenium WebDriver, Selenium Grid, Selenium IDE
- 🎯 Advantages and Limitations of Selenium

### 🔹 2. Setting up the Selenium Environment
- 🔧 Installing Java and setting up JDK
- 💻 Installing Eclipse/IntelliJ
- 📦 Adding Selenium dependencies using Maven (pom.xml)
- 🌍 Setting up WebDriver (Chrome, Firefox, Edge, etc.)

### 🔹 3. Basic Selenium Commands 🏁
- 🌐 Launching a Browser
- 🔎 Navigating to a URL
- 🏷️ Locating Web Elements (ID, Name, XPath, CSS Selector, etc.)
- 🖱️ Clicking Elements, Sending Keys, Submitting Forms

```java
WebDriver driver = new ChromeDriver();
driver.get("https://example.com");
driver.findElement(By.id("username")).sendKeys("testuser");
driver.findElement(By.id("password")).sendKeys("password123");
driver.findElement(By.id("loginButton")).click();
```

### 🔹 4. Handling Different Web Elements 🎭
- 📝 Handling Text Boxes, Buttons, Checkboxes, and Radio Buttons
- 📂 Handling Dropdowns (Select class)
- ⚠️ Handling Alerts, Pop-ups, Frames, and Windows

```java
Select dropdown = new Select(driver.findElement(By.id("dropdown")));
dropdown.selectByVisibleText("Option 1");
```

### 🔹 5. TestNG for Selenium 🧪
- 📌 Setting up TestNG (testng.xml)
- 🏷️ Annotations: @Test, @BeforeTest, @AfterTest, @BeforeMethod, @AfterMethod
- ✅ Assertions (Hard & Soft Assertions)
- 🛠️ Parameterization using testng.xml

```java
@Test
public void loginTest() {
    Assert.assertEquals(driver.getTitle(), "Dashboard");
}
```

### 🔹 6. Data-Driven Testing (DDT) using Apache POI 📊
- 📄 Reading and writing data from Excel (TestData.xlsx)

```java
FileInputStream file = new FileInputStream("TestData.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("Sheet1");
String value = sheet.getRow(1).getCell(0).getStringCellValue();
```

### 🔹 7. Logging with log4j 📝
- ⚙️ Configuring log4j.xml
- 📢 Generating logs for debugging

```java
Logger logger = LogManager.getLogger(TestClass.class);
logger.info("Test case execution started");
```

### 🔹 8. Reporting with Allure 📊
- 🏆 Setting up Allure for Selenium
- 📜 Generating and viewing reports

### 🔹 9. Running Tests on Jenkins 🏗️
- 🛠️ Setting up Jenkins for Selenium Automation
- 🚀 Running tests in Jenkins pipeline

### 🔹 10. Version Control with Git & GitHub 🔄
- 🔗 Setting up Git for Selenium
- 🔀 Pushing and pulling test automation projects from GitHub

### 🔹 11. Parallel Execution and Cross-Browser Testing 🌍
- 📌 Running tests in multiple browsers using TestNG XML
- 🖥️ Selenium Grid for parallel execution

### 🔹 12. CI/CD Integration with Jenkins & Maven ⚡
- 🔄 Automating test execution in Jenkins pipeline
- 🏗️ Running tests through Maven commands

```sh
mvn clean test
```

---

## 🎯 Conclusion
By mastering these concepts and integrating Selenium with different tools, you will be able to automate UI testing efficiently and effectively.

🚀 **Happy Testing!** 🏆

