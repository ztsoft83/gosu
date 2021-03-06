/*
 * Copyright 2012. Guidewire Software, Inc.
 */

package gw.lang.reflect.java;

import gw.lang.reflect.IType;

public interface IJavaBackedType extends IType, IJavaBackedTypeData {
  IType getTypeFromJavaBackedType();
}
