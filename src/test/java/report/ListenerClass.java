package report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerClass implements ITestListener {

	ExtentSparkReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;


	public void configurationReport() {
		htmlReporter=new ExtentSparkReporter("ExtentReport.html");
		report=new ExtentReports();
		report.attachReporter(htmlReporter);



		/////////  addd system info/env info .................

		report.setSystemInfo("os", "windows");
		report.setSystemInfo("m/c", "testpc1");
		report.setSystemInfo("browser", "chrome");
		report.setSystemInfo("user-name", "priya");

		//////////   confi to change look and  feel of report...............
		htmlReporter.config().setDocumentTitle("repotdemo");
		htmlReporter.config().setReportName("first");
		htmlReporter.config().setTheme(Theme.DARK);



	} 


	public void onStart(ITestContext Result) {
		configurationReport();
		System.out.println("before on start method one time....");

	}
	public void onFinish(ITestContext Result) {
		System.out.println("after on finish  one time....");
		report.flush();
	}
	public void onTestStart(ITestResult Result) {
		System.out.println("Name of test method start...."+Result.getName());
	}
	public void onTestFailure(ITestResult Result) {
		System.out.println("Name of test method fail...."+Result.getName());
		
		test=report.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("fail test case   "+Result.getName()
		, ExtentColor.RED));

	}
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Name of test method skipp...."+Result.getName());
		test=report.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("fail test case   "+Result.getName()
		, ExtentColor.ORANGE));
	}
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Name of test method successfully executed...."+Result.getName());

		test=report.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("success test case   "+Result.getName()
		, ExtentColor.GREEN));
	}
}
