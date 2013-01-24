package org.appcelerator.calc;

import java.util.HashMap;

import org.appcelerator.kroll.runtime.rhino.KrollBindings;

public class calcGeneratedBindings
{
	public static void init()
	{
		KrollBindings.addExternalBinding("org.appcelerator.calc.CalcModule", org.appcelerator.calc.CalcModulePrototype.class);
		KrollBindings.addExternalBinding("org.appcelerator.calc.ExampleProxy", org.appcelerator.calc.ExampleProxyPrototype.class);
	}
}