/*
 * Copyright (C) 2016 Tercio Gaudencio Filho.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.github.x3333.poser;

/**
 * @author Tercio Gaudencio Filho (terciofilho [at] gmail.com)
 */
public class Field {

  //
  // Instance Variables

  protected String property;
  protected String key;
  protected FieldOperator operator;

  //
  // Constructors

  /**
   * Creates a Field providing the property, the key to be used in the {@link ResultType.MAP} and
   * the Operator.
   */
  public Field(final String property, final String key, final FieldOperator operator) {
    this.property = property;
    this.key = key;
    this.operator = operator;
  }

  /**
   * Creates a Field providing the property and the Operator.
   */
  public Field(final String property, final FieldOperator operator) {
    this.property = property;
    this.key = null;
    this.operator = operator;
  }

  /**
   * Creates a Field providing just the property.
   */
  public Field(final String property) {
    this.property = property;
    this.key = null;
    this.operator = null;
  }

  //
  // Interface

  public String getProperty() {
    return this.property;
  }

  public void setProperty(final String property) {
    this.property = property;
  }

  //

  public String getKey() {
    return this.key;
  }

  public void setKey(final String key) {
    this.key = key;
  }

  //

  public FieldOperator getOperator() {
    return this.operator;
  }

  public void setOperator(final FieldOperator operator) {
    this.operator = operator;
  }

}
