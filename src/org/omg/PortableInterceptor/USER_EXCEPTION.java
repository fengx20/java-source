package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/USER_EXCEPTION.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u211/12973/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Monday, April 1, 2019 8:56:01 PM PDT
*/

public interface USER_EXCEPTION
{

  /**
   * Indicates a UserException reply status. One possible value for 
   * <code>RequestInfo.reply_status</code>.
   * @see RequestInfo#reply_status
   * @see SUCCESSFUL
   * @see SYSTEM_EXCEPTION
   * @see LOCATION_FORWARD
   * @see TRANSPORT_RETRY
   */
  public static final short value = (short)(2);
}