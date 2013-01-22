// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var win = Ti.UI.createWindow({
	backgroundColor:'white'
});
var label = Ti.UI.createLabel();
win.add(label);
win.open();

// TODO: write your module tests here
var calc = require('org.appcelerator.calc');
Ti.API.info("module is => " + calc);

var result = calc.addition(5, 6);

// label.text = calc.example() + result;

Ti.API.info("module exampleProp is => " + calc.exampleProp);
calc.exampleProp = "This is a test value";
label.text = calc.example() + " " + result + " " + calc.getMessage();

if (Ti.Platform.name == "android") {
	var proxy = calc.createExample({
		message: "Creating an example Proxy",
		backgroundColor: "red",
		width: 100,
		height: 100,
		top: 100,
		left: 150
	});

	proxy.printMessage("Hello world!");
	proxy.message = "Hi world!.  It's me again.";
	proxy.printMessage("Hello world!");
	win.add(proxy);
}

