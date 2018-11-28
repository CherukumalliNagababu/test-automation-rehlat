 
var gulp = require('gulp');
var reporter = require('cucumber-html-reporter');
var today = new Date();
var date = today.getDate()+'-'+(today.getMonth()+1)+'-'+today.getFullYear();
var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
var reportName = today.getHours()+ "_" + today.getMinutes()+ "_" + today.getSeconds();
var dateTime = date+' '+time;
var date2=date+' '+reportName;
var folder = date;

var options = {
        theme: 'bootstrap',
        jsonFile: './Reports/cukes/cucumber.json',
        output: './HtmlReport/'+folder+'/'+date2+'cucumber_report.html',
        reportSuiteAsScenarios: true,
        launchReport: true,
        metadata: {
            "Version":"0.0.1",
            "Test Environment": "",
            "Browser"	: "Chrome  54.0.2840.98",
            "Author"	: "NAGABABU CH",
            "Time"   	: dateTime,
            "Platform": "Windows 10",
            "Parallel"	: "Scenarios",
            "Executed"	: "Remote"
        }
    };
 
	 reporter.generate(options);
 
   