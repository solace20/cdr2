package com.solace.session;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

/**
 * Created by solace on 2017/2/12.
 * function use
 */
public class HttpSessionWrapper implements HttpSession{
    private HttpSession session;

    public HttpSessionWrapper(HttpSession session){
        this.session = session;
    }
    @Override
    public long getCreationTime() {
        return this.session.getCreationTime();
    }

    @Override
    public String getId() {
        return this.session.getId() ;
    }

    @Override
    public long getLastAccessedTime() {
        return this.session.getLastAccessedTime();
    }

    @Override
    public ServletContext getServletContext() {
        return this.session.getServletContext();
    }

    @Override
    public void setMaxInactiveInterval(int i) {
        this.session.setMaxInactiveInterval(i);
    }

    @Override
    public int getMaxInactiveInterval() {
        return this.session.getMaxInactiveInterval();
    }

    @Override
    public HttpSessionContext getSessionContext() {
        return this.session.getSessionContext();
    }

    @Override
    public Object getAttribute(String s) {
        return this.session.getAttribute(s);
    }

    @Override
    public Object getValue(String s) {
        return this.session.getValue(s);
    }

    @Override
    public Enumeration getAttributeNames() {
        return this.session.getAttributeNames();
    }

    @Override
    public String[] getValueNames() {
        return this.session.getValueNames();
    }

    @Override
    public void setAttribute(String s, Object o) {
        this.session.setAttribute(s,o);
    }

    @Override
    public void putValue(String s, Object o) {
        this.session.putValue(s,o);
    }

    @Override
    public void removeAttribute(String s) {
        this.session.removeAttribute(s);
    }

    @Override
    public void removeValue(String s) {
        this.session.removeValue(s);
    }

    @Override
    public void invalidate() {
        this.session.invalidate();
    }

    @Override
    public boolean isNew() {
        return this.session.isNew();
    }
}
