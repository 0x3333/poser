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
    if (obj == null) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }

    final Search other = (Search) obj;

    if (!Objects.equals(this.searchClass, other.searchClass)) {
      return false;
    }

    if (!Objects.equals(this.resultType, other.resultType)) {
      return false;
    }
    if (!Objects.equals(this.disjunction, other.disjunction)) {
      return false;
    }
    if (!Objects.equals(this.distinct, other.distinct)) {
      return false;
    }

    if (!Objects.equals(this.firstResult, other.firstResult)) {
      return false;
    }
    if (!Objects.equals(this.maxResults, other.maxResults)) {
      return false;
    }
    if (!Objects.equals(this.page, other.page)) {
      return false;
    }

    return true;
  }

  //

}
