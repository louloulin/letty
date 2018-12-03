package com.letty.mvc.http;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Cookie
 *
 * @author lin
 */
@Data
@Builder
@ToString
public class Cookie {

    private String  name     = null;
    private String  value    = null;
    private String  domain   = null;
    private String  path     = "/";
    private long    maxAge   = -1;
    private boolean secure   = false;
    private boolean httpOnly = false;


}
