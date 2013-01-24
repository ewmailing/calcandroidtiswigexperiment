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

import org.appcelerator.calc.ExampleProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class ExampleProxyPrototype extends TiViewProxyPrototype
{
	// GENERATE_SUID

	private static final String TAG = "ExampleProxyPrototype";
	private static final String CLASS_TAG = "ExampleProxy";
	private static ExampleProxyPrototype exampleProxyPrototype;


	public static ExampleProxyPrototype getProxyPrototype()
	{
		return exampleProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		exampleProxyPrototype = null;
	}

	public ExampleProxyPrototype()
	{
		if (exampleProxyPrototype == null && getClass().equals(ExampleProxyPrototype.class)) {
			exampleProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == exampleProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return exampleProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ExampleProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setMessage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setMessage()", Log.DEBUG_MODE);

		try {
		ExampleProxy proxy = (ExampleProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setMessage: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setMessage(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getMessage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMessage()", Log.DEBUG_MODE);

		try {
		ExampleProxy proxy = (ExampleProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getMessage();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void printMessage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "printMessage()", Log.DEBUG_MODE);

		try {
		ExampleProxy proxy = (ExampleProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("printMessage: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.printMessage(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public String getter_message()
	{
		Log.d(TAG, "get message", Log.DEBUG_MODE);
		ExampleProxy proxy = (ExampleProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getMessage();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_message(Object value)
	{
		Log.d(TAG, "set message", Log.DEBUG_MODE);
		ExampleProxy proxy = (ExampleProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setMessage(arg0);
		//proxy.setProperty("message", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_setMessage = 2,
		Id_getMessage = 3,
		Id_printMessage = 4
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
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==10) {
                c=s.charAt(0);
                if (c=='g') { X="getMessage";id=Id_getMessage; }
                else if (c=='s') { X="setMessage";id=Id_setMessage; }
            }
            else if (s_length==11) { X="constructor";id=Id_constructor; }
            else if (s_length==12) { X="printMessage";id=Id_printMessage; }
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
			case Id_setMessage:
				arity = 1;
				name = "setMessage";
				break;
			case Id_getMessage:
				arity = 0;
				name = "getMessage";
				break;
			case Id_printMessage:
				arity = 1;
				name = "printMessage";
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

		while (thisObj != null && !(thisObj instanceof ExampleProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ExampleProxyPrototype proxy = (ExampleProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_setMessage:
				 setMessage(cx, thisObj, args);
				return Undefined.instance;
			case Id_getMessage:
				return getMessage(cx, thisObj, args);
				
			case Id_printMessage:
				 printMessage(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_message = 1
		;

;

;

	public static final int MAX_INSTANCE_ID = 1;

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
            if (s.length()==7) { X="message";id=Id_message; }
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
			case Id_message:
				return "message"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ExampleProxyPrototype proxy = this;
		while (start != null && !(start instanceof ExampleProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ExampleProxyPrototype) {
			proxy = (ExampleProxyPrototype) start;
		}

		switch (id) {
			case Id_message:
				return proxy.getter_message();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ExampleProxyPrototype proxy = this;
		while (start != null && !(start instanceof ExampleProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ExampleProxyPrototype) {
			proxy = (ExampleProxyPrototype) start;
		}

		switch (id) {
			case Id_message:
				proxy.setter_message(value);
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
