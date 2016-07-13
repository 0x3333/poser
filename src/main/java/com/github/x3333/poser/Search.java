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

import java.util.Objects;

import com.google.common.base.MoreObjects;

/**
 * @author Tercio Gaudencio Filho (terciofilho [at] gmail.com)
 */
public class Search {

  //
  // Static Resources

  public static Search of(final Class<?> searchClass) {
    return new Search(searchClass);
  }

  //
  // Instance Variables

  protected final Class<?> searchClass;

  // Search
  protected ResultType resultType;
  protected boolean disjunction;
  protected boolean distinct;

  // Paging
  protected Integer firstResult;
  protected Integer maxResults;
  protected Integer page;

  //
  // Constructor

  public Search(final Class<?> searchClass) {
    this.searchClass = searchClass;
  }

  //
  // Interface

  public Class<?> getSearchClass() {
    return this.searchClass;
  }

  //

  public ResultType getResultType() {
    return this.resultType;
  }

  public void setResultType(final ResultType resultType) {
    this.resultType = resultType;
  }

  //

  public boolean isDisjunction() {
    return this.disjunction;
  }

  public void setDisjunction(final boolean disjunction) {
    this.disjunction = disjunction;
  }

  //

  public boolean isDistinct() {
    return this.distinct;
  }

  public void setDistinct(final boolean distinct) {
    this.distinct = distinct;
  }

  //
  // Paging

  public Integer getFirstResult() {
    return this.firstResult;
  }

  public void setFirstResult(final Integer firstResult) {
    this.firstResult = firstResult;
  }

  //

  public Integer getMaxResults() {
    return this.maxResults;
  }

  public void setMaxResults(final Integer maxResults) {
    this.maxResults = maxResults;
  }

  //

  public int getPage() {
    return this.page;
  }

  public void setPage(final int page) {
    this.page = page;
  }

  //

  @Override
  public int hashCode() {
    return Objects.hash(//
        this.searchClass, //

        this.resultType, //
        this.disjunction, //
        this.distinct, //

        this.firstResult, //
        this.maxResults, //
        this.page //
    );
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }

    final Search other = (Search) obj;
    return Objects.equals(this.searchClass, other.searchClass)

        && Objects.equals(this.resultType, other.resultType) //
        && Objects.equals(this.disjunction, other.disjunction) //
        && Objects.equals(this.distinct, other.distinct) //

        && Objects.equals(this.firstResult, other.firstResult) //
        && Objects.equals(this.maxResults, other.maxResults) //
        && Objects.equals(this.page, other.page);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this) //
        .add("searchClass", this.searchClass) //

        .add("resultType", this.resultType) //
        .add("disjunction", this.disjunction) //
        .add("distinct", this.distinct) //

        .add("firstResult", this.firstResult) //
        .add("maxResults", this.maxResults) //
        .add("page", this.page) //
        .toString();
  }

  //

}
