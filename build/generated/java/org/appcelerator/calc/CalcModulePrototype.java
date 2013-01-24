/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.calc;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollInvocation;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.KrollProxySupport;
import org.appcelerator.kroll.KrollRuntime;

import org.appcelerator.kroll.runtime.rhino.KrollBindings;
import org.appcelerator.kroll.runtime.rhino.KrollGeneratedBindings;
import org.appcelerator.kroll.runtime.rhino.Proxy;
import org.appcelerator.kroll.runtime.rhino.ProxyFactory;
import org.appcelerator.kroll.runtime.rhino.RhinoRuntime;
import org.appcelerator.kroll.runtime.rhino.TypeConverter;
import org.appcelerator.kroll.common.Log;

import java.util.HashMap;

import org.appcelerator.calc.CalcModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class CalcModulePrototype extends KrollModulePrototype
{
	// GENERATE_SUID

	private static final String TAG = "CalcModulePrototype";
	private static final String CLASS_TAG = "CalcModule";
	private static CalcModulePrototype calcModulePrototype;

	// Lazy loaded child APIs
	private Object API_Example = null;

	public static CalcModulePrototype getProxyPrototype()
	{
		return calcModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		calcModulePrototype = null;
	}

	public CalcModulePrototype()
	{
		if (calcModulePrototype == null && getClass().equals(CalcModulePrototype.class)) {
			calcModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == calcModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return calcModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(CalcModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getMessage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMessage()", Log.DEBUG_MODE);

		try {
		CalcModule proxy = (CalcModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getMessage();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object example(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "example()", Log.DEBUG_MODE);

		try {
		CalcModule proxy = (CalcModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.example();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_exampleProp()
	{
		Log.d(TAG, "get exampleProp", Log.DEBUG_MODE);
		CalcModule proxy = (CalcModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getExampleProp();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_exampleProp(Object value)
	{
		Log.d(TAG, "set exampleProp", Log.DEBUG_MODE);
		CalcModule proxy = (CalcModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setExampleProp(arg0);
		//proxy.setProperty("exampleProp", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getMessage = 2,
		Id_example = 3,
		Id_createExample = 4
		;
		

	public static final int MAX_PROTOTYPE_ID = 4;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-23 17:48:27 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 7: X="example";id=Id_example; break L;
            case 10: X="getMessage";id=Id_getMessage; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 13: X="createExample";id=Id_createExample; break L;
            }
            if (X!=null && X!=s && !X.equals(s)) id = 0;
            break L0;
        }
// #/generated#
		return id;
	}

// #/string_id_map#

	@Override
	protected void initPrototypeId(int id)
	{
		String name;
		int arity;
		switch (id) {
			case Id_constructor:
				arity = 0;
				name = "constructor";
				break;
			case Id_getMessage:
				arity = 0;
				name = "getMessage";
				break;
			case Id_example:
				arity = 0;
				name = "example";
				break;
			case Id_createExample:
				arity = 1;
				name = "createExample";
				break;
			default:
				super.initPrototypeId(id);
				return;
		}
		initPrototypeMethod(CLASS_TAG, id, name, arity);
	}

	@Override
	public Object execIdCall(IdFunctionObject f,
		Context cx, Scriptable scope, Scriptable thisObj, Object[] args)
	{
		if (!f.hasTag(CLASS_TAG)) {
			return super.execIdCall(f, cx, scope, thisObj, args);
		}

		while (thisObj != null && !(thisObj instanceof CalcModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		CalcModulePrototype proxy = (CalcModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getMessage:
				return getMessage(cx, thisObj, args);
				
			case Id_example:
				return example(cx, thisObj, args);
				
			case Id_createExample:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"org.appcelerator.calc.ExampleProxy", args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_exampleProp = 1
		;

;

	// Child APIs
	private static final int

		Id_Example = 2
		;

	public static final int MAX_INSTANCE_ID = 2;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-23 17:48:27 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==7) { X="Example";id=Id_Example; }
            else if (s_length==11) { X="exampleProp";id=Id_exampleProp; }
            if (X!=null && X!=s && !X.equals(s)) id = 0;
            break L0;
        }
// #/generated#
		if (id == 0) {
			return id;
		}
		return instanceIdInfo(PERMANENT, id);
	}

// #/string_id_map#

	@Override
	protected String getInstanceIdName(int id)
	{
		switch (id) {
			case Id_exampleProp:
				return "exampleProp"; 
			case Id_Example:
				return "Example";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		CalcModulePrototype proxy = this;
		while (start != null && !(start instanceof CalcModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CalcModulePrototype) {
			proxy = (CalcModulePrototype) start;
		}

		switch (id) {
			case Id_exampleProp:
				return proxy.getter_exampleProp();
			case Id_Example:
				if (proxy.API_Example == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Example = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.calc.ExampleProxy", org.appcelerator.calc.ExampleProxyPrototype.class); 
				}
				return proxy.API_Example;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		CalcModulePrototype proxy = this;
		while (start != null && !(start instanceof CalcModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CalcModulePrototype) {
			proxy = (CalcModulePrototype) start;
		}

		switch (id) {
			case Id_exampleProp:
				proxy.setter_exampleProp(value);
				break; 
			case Id_Example:
				if (value instanceof Proxy) {
					proxy.API_Example = value;
				} else {
					defineProperty(original, "Example", value, 0);
				}
				break;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	public String getClassName()
	{
		return CLASS_TAG;
	}
}
