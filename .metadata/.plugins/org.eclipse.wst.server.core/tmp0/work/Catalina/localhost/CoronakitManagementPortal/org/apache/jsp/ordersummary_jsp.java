/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-23 09:29:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ordersummary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("  <div class=\"col-75\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <form action=\"/action_page.php\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-50\">\r\n");
      out.write("            <h3>Billing Address</h3>\r\n");
      out.write("            <label for=\"fname\"><i class=\"fa fa-user\"></i> Full Name</label>\r\n");
      out.write("            <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"John M. Doe\">\r\n");
      out.write("            <label for=\"email\"><i class=\"fa fa-envelope\"></i> Email</label>\r\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"john@example.com\">\r\n");
      out.write("            <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i> Address</label>\r\n");
      out.write("            <input type=\"text\" id=\"adr\" name=\"address\" placeholder=\"542 W. 15th Street\">\r\n");
      out.write("            <label for=\"city\"><i class=\"fa fa-institution\"></i> City</label>\r\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"New York\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-50\">\r\n");
      out.write("                <label for=\"state\">State</label>\r\n");
      out.write("                <input type=\"text\" id=\"state\" name=\"state\" placeholder=\"NY\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-50\">\r\n");
      out.write("                <label for=\"zip\">Zip</label>\r\n");
      out.write("                <input type=\"text\" id=\"zip\" name=\"zip\" placeholder=\"10001\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-50\">\r\n");
      out.write("            <h3>Payment</h3>\r\n");
      out.write("            <label for=\"fname\">Accepted Cards</label>\r\n");
      out.write("            <div class=\"icon-container\">\r\n");
      out.write("              <i class=\"fa fa-cc-visa\" style=\"color:navy;\"></i>\r\n");
      out.write("              <i class=\"fa fa-cc-amex\" style=\"color:blue;\"></i>\r\n");
      out.write("              <i class=\"fa fa-cc-mastercard\" style=\"color:red;\"></i>\r\n");
      out.write("              <i class=\"fa fa-cc-discover\" style=\"color:orange;\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <label for=\"cname\">Name on Card</label>\r\n");
      out.write("            <input type=\"text\" id=\"cname\" name=\"cardname\" placeholder=\"John More Doe\">\r\n");
      out.write("            <label for=\"ccnum\">Credit card number</label>\r\n");
      out.write("            <input type=\"text\" id=\"ccnum\" name=\"cardnumber\" placeholder=\"1111-2222-3333-4444\">\r\n");
      out.write("            <label for=\"expmonth\">Exp Month</label>\r\n");
      out.write("            <input type=\"text\" id=\"expmonth\" name=\"expmonth\" placeholder=\"September\">\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"checkbox\" checked=\"checked\" name=\"sameadr\"> Shipping address same as billing\r\n");
      out.write("        </label>\r\n");
      out.write("        <input type=\"submit\" value=\"Continue to checkout\" class=\"btn\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-25\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <h4>Cart\r\n");
      out.write("        <span class=\"price\" style=\"color:black\">\r\n");
      out.write("          <i class=\"fa fa-shopping-cart\"></i>\r\n");
      out.write("          <b>4</b>\r\n");
      out.write("        </span>\r\n");
      out.write("      </h4>\r\n");
      out.write("      <p><a href=\"#\">Product 1</a> <span class=\"price\">$15</span></p>\r\n");
      out.write("      <p><a href=\"#\">Product 2</a> <span class=\"price\">$5</span></p>\r\n");
      out.write("      <p><a href=\"#\">Product 3</a> <span class=\"price\">$8</span></p>\r\n");
      out.write("      <p><a href=\"#\">Product 4</a> <span class=\"price\">$2</span></p>\r\n");
      out.write("      <hr>\r\n");
      out.write("      <p>Total <span class=\"price\" style=\"color:black\"><b>$30</b></span></p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<hr/>\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
