// Copyright 2022 Diffblue Limited. All Rights Reserved.
// Unpublished proprietary source code.
// Use is governed by https://docs.diffblue.com/licenses/eula
package com.diffblue.javademo;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class LeftPad
{

  /**
   * My stupid implementation of left_pad, which seemed an easy test case
   *  left_pad("string", length, ("padchar")) === "left-padded string"
   *
   *  left_pad("foo", 5) === "  foo"
   *  left_pad("foobar", 6) === "foobar"
   *  left_pad("1", 2, "0") === "01"
   *  left_pad("1", 2, "-") === "-1"
   */
  private final String script =
      "function left_pad(s,c,p,u){return(s+'').length<c?left_pad((p==u?' ':p+'')+s,c,p):s}";

  private final Context context = Context.enter();
  private final ScriptableObject scope = context.initStandardObjects();
  private final Scriptable that = context.newObject(scope);
  private final Function fct = context.compileFunction(scope, script, "script", 1, null);

  /**
   * Wrapper for 2 parameter version
   *
   * @param str String to be padded
   * @param length Desired length
   * @return
   */
  public String left_pad(String str, int length) {
    return (String) fct.call(context, scope, that, new Object[] {str, length});
  }

  /**
   * Wrapper for 3 parameter version
   *
   * @param str     String to be padded
   * @param length  Desired length
   * @param padchar Char to pad with
   * @return
   */
  public String left_pad(String str, int length, char padchar) {
    return (String) fct.call(context, scope, that, new Object[] {str, length, padchar});
  }
}
