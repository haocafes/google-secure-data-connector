/* Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Id$
 */
package com.google.dataconnector.util;

/**
 * Exception for errors during registration of Secure Link Client.
 *
 * @author rayc@google.com (Ray Colline)
 */
public class RegistrationException extends ConnectionException {
  private static final long serialVersionUID = 2951268804856108084L;

  /**
   * Constructs the exception with an error message.
   *
   * @param message A string representing the error message.
   */
  public RegistrationException(final String message) {
    super(message);
  }

  /**
   * Creates the exception with the specified underlying cause.
   *
   * @param cause the underlying cause.
   */
  public RegistrationException(final Throwable cause) {
    super(cause);
  }

  /**
   * Creates the exception with the specified error message and cause.
   *
   * @param msg the error message.
   * @param cause the underlying cause.
   */
  public RegistrationException(final String msg, final Throwable cause) {
    super(msg, cause);
  }

}
