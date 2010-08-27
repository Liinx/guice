/**
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.inject.servlet;

import java.util.Map;

import javax.servlet.http.HttpServlet;

/**
 * A binding to a single instance of a servlet. 
 *
 * @author sameb@google.com
 * @since 3.0
 */
public interface InstanceServletBinding {
  
  /**
   * Returns the pattern type that this servlet binding was created with.
   * This will be {@link UriPatternType#REGEX} if the binding was created with
   * {@link ServletModule#serveRegex(String, String...)}, and 
   * {@link UriPatternType#SERVLET} if it was created with
   * {@link ServletModule#serve(String, String...)}.
   */
  UriPatternType getUriPatternType();

  /** Returns the pattern used to match against the servlet. */
  String getPattern();

  /** Returns any init params supplied when creating the binding. */
  Map<String, String> getInitParams();

  /** Returns the servlet instance that will be used. */
  HttpServlet getServletInstance();

}