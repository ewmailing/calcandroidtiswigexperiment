/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 * Warning: This file is GENERATED, and should not be modified
 */
package org.appcelerator.calc;

import org.appcelerator.kroll.common.KrollSourceCodeProvider;

public class CommonJsSourceProvider implements KrollSourceCodeProvider
{
	public String getSourceCode()
	{
		return getSourceCode("org.appcelerator.calc");
	}

	public String getSourceCode(String module)
	{
		if (module.equals("org.appcelerator.calc/org.appcelerator.calc")) {
			module = "org.appcelerator.calc";
		}

		AssetCryptImpl source = new AssetCryptImpl();
		return source.readAsset(module + ".js");
	}
}
