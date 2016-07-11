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
 * The comparison's type between the property and the value in a Filter.
 *
 * @author Tercio Gaudencio Filho (terciofilho [at] gmail.com)
 */
public enum FilterOperator {

  EQUAL, NOT_EQUAL,

  LESS_THAN, LESS_OR_EQUAL,

  GREATER_THAN, GREATER_OR_EQUAL,

  LIKE, ILIKE,

  IN, NOT_IN,

  NULL, NOT_NULL,

  EMPTY, NOT_EMPTY,

  AND, OR,

  NOT,

  SOME,

  ALL,

  NONE,

  CUSTOM;

}
